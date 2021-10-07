package com.siarkowski.gatekeeper.server.commons.station.gateway.request;


import com.siarkowski.gatekeeper.server.commons.station.gateway.GatewayType;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Builder
@Getter
public class GatewayPermitRequest {

    @NotBlank
    private final String guestId;

    private final GatewayType gateway;

    @NotBlank
    private final String outsideStationId;
}
