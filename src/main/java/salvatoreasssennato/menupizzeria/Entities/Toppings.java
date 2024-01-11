package salvatoreasssennato.menupizzeria.Entities;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name="toppings")
@Getter
@Setter
@NoArgsConstructor

public class Toppings {
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "name", nullable = false, length = 255)
    private String name;
    @Column(name = "calories")
    private int calories;
    @Column(name = "price")
    private double price;

    public Toppings(String name, int calories, double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n Toppings{" +
                "name='" + name + '\'' +
                ",calories=" + calories +
                ",price=" + price +
                '}';
    }
}
