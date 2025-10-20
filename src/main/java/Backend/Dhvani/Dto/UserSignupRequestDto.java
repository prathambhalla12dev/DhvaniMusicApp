package Backend.Dhvani.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserSignupRequestDto {

    private String fullName;
    private String username;
    private String phoneNumber;
    private String password;
}
