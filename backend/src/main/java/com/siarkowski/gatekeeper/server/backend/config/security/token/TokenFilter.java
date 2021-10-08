package com.siarkowski.gatekeeper.server.backend.config.security.token;

import com.sensilabs.informme.backend.exceptions.AuthorizationException;
import com.sensilabs.informme.backend.service.security.PrincipalDetailsServiceImpl;
import com.sensilabs.informme.backend.utils.ErrorCodes;
import com.sensilabs.informme.commons.dto.apikey.TokenType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
public class TokenFilter extends OncePerRequestFilter {

    @Autowired
    private JwtUtils jwtUtils;

    @Autowired
    private PrincipalDetailsServiceImpl principalDetailsService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        try {
            String jwt = jwtUtils.parseJwt(request);

            if (jwt != null && jwtUtils.validateJwtToken(jwt)){

                TokenType tokenType = jwtUtils.getTokenTypeFromJwtToken(jwt);
                String principalId = jwtUtils.getPrincipalFromJwtToken(jwt);
                UserDetails principal;

                switch (tokenType){
                    case USER_ACCOUNT:
                        principal = principalDetailsService.loadUserById(principalId);
                        break;

                    case APPLICATION:
                        principal = principalDetailsService.loadAppById(principalId);
                        break;

                    default:
                        throw new AuthorizationException(ErrorCodes.TOKEN_TYPE_NOT_FOUND);
                }

                UsernamePasswordAuthenticationToken authentication =
                        new UsernamePasswordAuthenticationToken(principal, null,
                                principal.getAuthorities());

                authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));

                SecurityContextHolder.getContext().setAuthentication(authentication);

            }
        } catch (Exception e) {
            log.error("Cannot set user authentication: {}", e.getMessage());
        }

        filterChain.doFilter(request, response);
    }

}
