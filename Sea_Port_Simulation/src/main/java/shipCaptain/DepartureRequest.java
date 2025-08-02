package shipCaptain;

import java.time.LocalDate;

public class DepartureRequest {
    private int requestID,shipID;
    private String shipName,currentDockLocation,departureType,customerClearanceStatus,tugboatAssitanceRequired,nextDestinationPort;
    private LocalDate requestedDepartureDate,requestedDepurtureTime;
}
