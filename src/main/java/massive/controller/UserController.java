package massive.controller;


import lombok.RequiredArgsConstructor;
import massive.entities.User;
import massive.services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private UserService userService;

    @PostMapping("/register")
    public User register() {
        userService.registerUser()
    }
}
