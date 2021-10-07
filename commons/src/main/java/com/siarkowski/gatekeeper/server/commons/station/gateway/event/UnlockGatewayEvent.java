package com.siarkowski.gatekeeper.server.commons.station.gateway.event;

import com.siarkowski.gatekeeper.server.commons.station.gateway.GatewayType;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class UnlockGatewayEvent {

    private final String deviceId;
    private final GatewayType gateway;
}
