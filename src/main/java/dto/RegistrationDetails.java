package dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class RegistrationDetails {

    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String password;
    private String street;
    private String zipCode;
    private String role;

}
