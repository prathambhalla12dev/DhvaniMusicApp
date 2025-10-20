package Backend.Dhvani.Controller;

import Backend.Dhvani.Dto.ApiResponseDto;
import jakarta.annotation.Nonnull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dhvani/user")
public class UserController {

        @PostMapping("/signup")
        public @Nonnull ResponseEntity<ApiResponseDto> signup(){
            ApiResponseDto apiResponseDto = new ApiResponseDto();

            return ResponseEntity.ok(apiResponseDto);
        }
}
