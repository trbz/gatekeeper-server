package com.siarkowski.gatekeeper.server.commons.dto.tenant;


import com.siarkowski.gatekeeper.server.commons.dto.station.InsideStation;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CreateTenantRequest {

    private final String name;
    private final int houseNumber;
    private final InsideStation station;
}
