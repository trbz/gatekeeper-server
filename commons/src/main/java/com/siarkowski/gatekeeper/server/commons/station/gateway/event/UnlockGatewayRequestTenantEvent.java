package pl.edu.pw.elka.gatekeeper.db.dto.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import pl.edu.pw.elka.gatekeeper.db.dto.station.DoorType;

@Data
@AllArgsConstructor
public class UnlockDoorTenantRequestEvent {

    private final String outsideStationId;
    private final String tenantStationId;
    private final DoorType door;
}
