package com.siarkowski.gatekeeper.server.commons.dto.station;

import com.siarkowski.gatekeeper.server.commons.dto.station.gateway.GatewayType;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@AllArgsConstructor
public class OutsideStation {

    @NotNull
    @NotBlank
    private String id;

    @NotNull
    @NotBlank
    private String LockId;

    @Size(max = 2)
    @NotNull
    private List<GatewayType> doors;
}
