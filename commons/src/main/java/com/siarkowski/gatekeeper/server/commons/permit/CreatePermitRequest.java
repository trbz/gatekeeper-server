package com.siarkowski.gatekeeper.server.commons.permit;

import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.time.ZonedDateTime;

@Builder
@Getter
public class CreatePermitRequest {

    @NotBlank
    private final String permitId;

    @Min(1)
    private final int accessLimit;

    @NotEmpty
    private final ZonedDateTime expirationTime;
}
