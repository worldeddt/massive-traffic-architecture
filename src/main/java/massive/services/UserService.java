package massive.services;


import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import massive.entities.User;
import massive.repository.UserRepository;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User findUser(String loginId) {
        return userRepository.findByLoginId(loginId)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Transactional
    public User registerUser(String loginId, String username) {
        User user = new User(loginId, username);
        return userRepository.save(user);
    }
}
