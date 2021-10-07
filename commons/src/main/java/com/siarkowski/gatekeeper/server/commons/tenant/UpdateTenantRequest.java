package com.siarkowski.gatekeeper.server.commons.tenant;


import com.siarkowski.gatekeeper.server.commons.station.InsideStation;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Getter
@Builder
public class UpdateTenantRequest {

    @Min(0)
    private final int id;

    @NotBlank
    private final String name;

    @Min(0)
    private final int houseNumber;

    private final InsideStation station;
}
