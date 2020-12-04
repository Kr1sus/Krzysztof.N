package pl.coderslab.projectgymzal2;


import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import pl.coderslab.projectgymzal2.model.UserEntity;
import pl.coderslab.projectgymzal2.repository.UserRepository;


@Component
public class Test {

    private UserRepository userRepository;


//    public Test(UserRepository userRepository, PasswordEncoder passwordEncoder) {
//
//        UserEntity user = new UserEntity();
//        user.setUsername("krzysiek");
//        user.setPassword(passwordEncoder.encode("123"));
//        user.setRole("ROLE_USER");
//
//        userRepository.save(user);
//    }
}
