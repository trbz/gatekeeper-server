package com.siarkowski.gatekeeper.server.commons.dto.authorization;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class LoginRequest {

    private final String username;
    private final String password;
}
