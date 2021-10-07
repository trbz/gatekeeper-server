package pl.edu.pw.elka.gatekeeper.db.dto.station;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class GuestDto {

    private String guestId;
    private int accessLimit;
    private ZonedDateTime expirationTime;
}
