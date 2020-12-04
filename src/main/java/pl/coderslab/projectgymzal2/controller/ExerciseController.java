package pl.coderslab.projectgymzal2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.projectgymzal2.model.Exercise;
import pl.coderslab.projectgymzal2.repository.ExerciseRepository;


@Controller
public class ExerciseController {

    public ExerciseRepository exerciseRepository;

    public ExerciseController(ExerciseRepository exerciseRepository) {
        this.exerciseRepository = exerciseRepository;
    }

    @GetMapping("/addExercise")
    public String addExercise(Model model) {
        model.addAttribute("exercise", new Exercise());
        return "addExercise";
    }

    @PostMapping("/addExercise")
    public String addExercisePost(Exercise exercise) {
        exerciseRepository.save(exercise);
        return "redirect:showExercise";
    }

    @GetMapping("/showExercise")
    public String showExercises(Model model) {
        model.addAttribute("exercise", exerciseRepository.findAll());
        return "showExercise";
    }

    @GetMapping("/deleteExercise/{id}")
    public String deleteExercise(@PathVariable Long id) {
//        Optional<Exercise> exercise = exerciseRepository.findById(id);

//        if (exercise.isPresent()) {
//            exerciseRepository.delete(exercise.get());
//        }
        exerciseRepository.deleteById(id);
        return "redirect:/showExercise";
    }

    @GetMapping("/showExercise/{id}")
    public String showExercise(@PathVariable Long id, Model model) {


        model.addAttribute("exercise", exerciseRepository.findById(id).get());
        return "exerciseDetails";
    }


}
