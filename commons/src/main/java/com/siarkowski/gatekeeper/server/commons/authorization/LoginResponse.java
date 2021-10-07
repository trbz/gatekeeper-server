package com.siarkowski.gatekeeper.server.commons.dto.authorization;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class LoginResponse {

    private final String token;
    private final String type;
}
