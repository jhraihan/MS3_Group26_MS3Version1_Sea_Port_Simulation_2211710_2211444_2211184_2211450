package port_Administrator;

import java.time.LocalDate;

public class PortFee {
    private int feeID;
    private String feeType,rateCatagory,baseAmount,applicableVesselSize,description,currency;
    private LocalDate effectiveDate,expiryDate;
    private boolean taxIncluded;
}
