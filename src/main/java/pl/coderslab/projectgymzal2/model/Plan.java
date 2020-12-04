package pl.coderslab.projectgymzal2.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Plan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;

    @OneToMany(mappedBy = "plan", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Exercise> exercises = new ArrayList<>();

    public Plan(String name) {
        this.name = name;
    }

    public Plan() {
    }

    public Long getId() {
        return id;
    }

    public Plan setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Plan setName(String name) {
        this.name = name;
        return this;
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    public Plan setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
        return this;
    }
}
