package Backend.Dhvani.Dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserSignupRequestDto {

    @NotBlank(message="please enter your full name")
    private String fullName;

    @NotBlank(message="please enter your username")
    @Size(min=8,max=50, message="username must be of at least 8 characters and at most 50 characters")
    @Pattern(regexp="^[a-z0-9_]+$", message="only lowercase letters, digits and underscore are allowed in the username")
    private String username;

    @NotBlank(message="please enter your phoneNumber")
    @Pattern(regexp = "^\\+\\d{1,3}\\s\\d{10}$", message = "invalid phone number format")
    private String phoneNumber;

    @NotBlank(message="please enter your password")
    @Size(min=8, message="password should be at least 8 characters long")
    @Pattern(
            regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$",
            message = "password must contain at least one lowercase letter, one uppercase letter, and one number"
    )
    private String password;

    @NotBlank(message="please confirm your password")
    private String confirmPassword;
}
