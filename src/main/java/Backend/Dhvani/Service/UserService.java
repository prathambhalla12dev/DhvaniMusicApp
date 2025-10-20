package Backend.Dhvani.Service;

import Backend.Dhvani.Dto.ApiResponseDto;
import Backend.Dhvani.Dto.UserSignupRequestDto;

public interface UserService {
    ApiResponseDto signup(UserSignupRequestDto userSignupRequestDto);
}
