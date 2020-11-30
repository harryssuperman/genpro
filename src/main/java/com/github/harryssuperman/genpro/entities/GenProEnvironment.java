package com.github.harryssuperman.genpro.entities;

import java.util.Objects;
import java.util.StringJoiner;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class GenProEnvironment {
    private Long id;
    private String name;

    public GenProEnvironment(String name) {
        this.name = name;
    }

    public GenProEnvironment() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @SequenceGenerator(name = "GenProEnvironmentSequence")
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenProEnvironment that = (GenProEnvironment) o;
        return id.equals(that.id) &&
                name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", GenProEnvironment.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .toString();
    }
}
