package com.siarkowski.gatekeeper.server.commons.station.gateway.event;

import com.siarkowski.gatekeeper.server.commons.station.gateway.GatewayType;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class UnlockGatewayRequestTenantEvent {

    private final String outsideStationId;
    private final String tenantStationId;
    private final GatewayType gateway;
}
