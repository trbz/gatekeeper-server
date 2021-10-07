package pl.edu.pw.elka.gatekeeper.db.dto.station;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class GuestRequest {

    private String guestId;

    private DoorType door;
    private String outsideStationId;
}
