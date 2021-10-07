package com.siarkowski.gatekeeper.server.commons.station.gateway.request;

import com.siarkowski.gatekeeper.server.commons.station.gateway.GatewayType;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Builder
@Getter
public class GatewayTenantRequest {

    private final int houseNumber;

    private final GatewayType gateway;

    @NotBlank
    private String outsideStationId;
}
