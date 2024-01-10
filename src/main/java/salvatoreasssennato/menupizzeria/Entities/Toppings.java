package salvatoreasssennato.menupizzeria.Entities;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Toppings {
    private String name;
    private int calories;
    private double price;

    @Override
    public String toString() {
        return "\n Toppings{" +
                "name='" + name + '\'' +
                ",calories=" + calories +
                ",price=" + price +
                '}';
    }
}
