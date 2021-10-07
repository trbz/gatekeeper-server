package com.siarkowski.gatekeeper.server.commons.station;

import com.siarkowski.gatekeeper.server.commons.station.gateway.GatewayType;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Builder
@Getter
public class OutsideStation {

    @NotBlank
    private final String id;

    @NotBlank
    private final String lockId;

    @Size(max = 2)
    @NotNull
    private final List<GatewayType> gates;
}
