package dto;

import lombok.Data;

@Data
public class ReservationRequest {

    private String accommodationId;
    private String userId;
    private String startDate;
    private String endDate;

}
