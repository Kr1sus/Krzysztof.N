package pl.coderslab.projectgymzal2.controller;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pl.coderslab.projectgymzal2.model.UserEntity;
import pl.coderslab.projectgymzal2.repository.UserRepository;

import javax.validation.Valid;

@Controller
public class UserController {
    public UserRepository userRepository;


    public String hashPassword(String password) {

        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/addUser")
    public String addExercise(Model model) {
        model.addAttribute("userEntity", new UserEntity());
        return "registerForm";
    }
//    @PostMapping("/addUser")
//    public String addExercisePost(UserEntity userEntity){
//        userEntity.setPassword(hashPassword(userEntity.getPassword()));
//        userEntity.setRole("ROLE_USER");
//        userRepository.save(userEntity);
//        return "redirect:index.jsp";
//    }
    @PostMapping("/addUser")
    public String addFormPost(@Valid UserEntity userEntity, BindingResult result){
        if (result.hasErrors()){
            return "registerForm";
        }
        userEntity.setPassword(hashPassword(userEntity.getPassword()));
        userEntity.setRole("ROLE_USER");
        this.userRepository.save(userEntity);
        return "redirect:/start";
    }
}
