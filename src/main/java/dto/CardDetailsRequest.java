package dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class CardDetailsRequest {

    private String cardNumber;
    private String cvv;
    private String date;
}
