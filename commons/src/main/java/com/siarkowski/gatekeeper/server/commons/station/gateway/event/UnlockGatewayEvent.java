package pl.edu.pw.elka.gatekeeper.db.dto.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import pl.edu.pw.elka.gatekeeper.db.dto.station.DoorType;

@Data
@AllArgsConstructor
public class UnlockDoorEvent {

    private final String deviceId;
    private final DoorType door;
}
