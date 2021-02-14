package dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class PaymentRequest {

    private String cardType;
    private String cardNumber;
    private String reservationId;
    private String billingName;
    private String billingStreetAddress;
    private String billingZipCode;
    private String billingInvoiceEmail;
    private String amount;
    private boolean useDefaultPayment;

}
