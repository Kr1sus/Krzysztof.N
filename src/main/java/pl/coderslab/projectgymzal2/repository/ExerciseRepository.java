package pl.coderslab.projectgymzal2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.projectgymzal2.model.Exercise;

@Repository
public interface ExerciseRepository extends JpaRepository<Exercise, Long> {

}
