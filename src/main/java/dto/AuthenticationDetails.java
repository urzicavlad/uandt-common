package dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class AuthenticationDetails {

    private String token;
    private String userId;
    private String email;
    private String error;

}