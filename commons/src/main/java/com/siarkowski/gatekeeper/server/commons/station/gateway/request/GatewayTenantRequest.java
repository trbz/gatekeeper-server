package pl.edu.pw.elka.gatekeeper.db.dto.door;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.edu.pw.elka.gatekeeper.db.dto.station.DoorType;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TenantRequest {

    private int houseNumber;
    private DoorType door;
    private String outsideStationId;
}
