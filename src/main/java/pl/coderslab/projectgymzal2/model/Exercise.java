package pl.coderslab.projectgymzal2.model;

import javax.persistence.*;

@Entity
public class Exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int sets;
    private int reps;
    private int weights;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "plan_id", nullable = false)
    private Plan plan;

    public Exercise(String name, int sets, int reps, int weights) {
        this.name = name;
        this.sets = sets;
        this.reps = reps;
        this.weights = weights;
    }

    public Exercise() {
    }

    public Long getId() {
        return id;
    }

    public Exercise setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Exercise setName(String name) {
        this.name = name;
        return this;
    }

    public int getSets() {
        return sets;
    }

    public Exercise setSets(int sets) {
        this.sets = sets;
        return this;
    }

    public int getReps() {
        return reps;
    }

    public Exercise setReps(int reps) {
        this.reps = reps;
        return this;
    }

    public int getWeights() {
        return weights;
    }

    public Exercise setWeights(int weights) {
        this.weights = weights;
        return this;
    }
}
