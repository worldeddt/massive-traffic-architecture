package massive.services;


import lombok.RequiredArgsConstructor;
import massive.entities.User;
import massive.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void findUser(String loginId) {
        User user = userRepository.findByLoginId(loginId)
                .orElseThrow(() -> new RuntimeException("User not found"));

    }

    public User registerUser(String loginId, String username) {
        User user = new User(loginId, username);
        return userRepository.save(user);
    }
}
