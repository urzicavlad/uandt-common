package dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class PaymentResponse {

    private String paymentId;
    private String reservationId;
    private String userId;

}
