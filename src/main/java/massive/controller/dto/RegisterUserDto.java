package massive.controller.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public class RegisterUserDto {
    private String loginId;
    private String username;
}
