package dto;

import lombok.Data;

@Data
public class PaymentRequest {

    private String cardType;
    private String cardNumber;
    private String reservationId;
    private String billingName;
    private String billingStreetAddress;
    private String billingZipCode;
    private String billingInvoiceEmail;
    private String amount;


}
