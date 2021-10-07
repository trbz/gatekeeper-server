package com.siarkowski.gatekeeper.server.commons.dto.tenant;


import lombok.Builder;
import lombok.Getter;
import pl.edu.pw.elka.gatekeeper.db.dto.station.InsideStation;

@Getter
@Builder
public class UpdateTenantRequest {

    private final int id;
    private final String name;
    private final int houseNumber;
    private final InsideStation station;
}
