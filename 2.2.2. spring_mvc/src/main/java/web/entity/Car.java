package web.entity;

import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class Car {

    private Long id;

    private String name;

    private String model;

    public Car(String name, String model) {
        this.name = name;
        this.model = model;

    }

    public Car() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id.equals(car.id) &&
                name.equals(car.name) &&
                model.equals(car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, model);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
