package dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class KYCDetails {

    private String sessionId;
    private String userId;

}
