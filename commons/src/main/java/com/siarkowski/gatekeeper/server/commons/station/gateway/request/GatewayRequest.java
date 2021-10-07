package com.siarkowski.gatekeeper.server.commons.dto.station.gateway;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class GatewayRequest {

    private GatewayType gateway;
    private String outsideStationId;
    private GatewayAction action;
}
