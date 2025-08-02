package shipCaptain;

import java.time.LocalDate;

public class DockingRequest {
    private int requestID,shipID;
    private String shipName,shipSize,cargoType,priorityLevel,requestedDock,specialRequirements;
    private LocalDate ETADate,ETATime;
}
