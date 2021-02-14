package dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ReservationRequest {

    private String accommodationId;
    private String userId;
    private String startDate;
    private String endDate;
    private String flow;

}
