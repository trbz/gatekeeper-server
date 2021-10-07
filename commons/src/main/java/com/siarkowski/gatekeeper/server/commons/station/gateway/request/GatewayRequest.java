package com.siarkowski.gatekeeper.server.commons.station.gateway.request;

import com.siarkowski.gatekeeper.server.commons.station.gateway.GatewayAction;
import com.siarkowski.gatekeeper.server.commons.station.gateway.GatewayType;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Getter
@Builder
public class GatewayRequest {

    private final GatewayType gateway;

    @NotBlank
    private final String outsideStationId;

    private final GatewayAction action;
}
