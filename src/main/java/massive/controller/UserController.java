package massive.controller;


import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import massive.controller.dto.RegisterUserDto;
import massive.entities.User;
import massive.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody RegisterUserDto registerUserDto) {

        return ResponseEntity.ok(userService.registerUser(registerUserDto.getLoginId(), registerUserDto.getUsername()));
    }

    @GetMapping("/{loginId}")
    public ResponseEntity<User> getUser(@PathVariable String loginId) {
        return ResponseEntity.ok(userService.findUser(loginId));
    }
}
