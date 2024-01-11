package salvatoreasssennato.menupizzeria.Entities;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
@Entity
@Table(name="menu")
@Getter
@Setter
@Component
public class Menu {
    @Id
    @GeneratedValue
    private long id;
    @OneToMany(mappedBy = "menu", cascade = CascadeType.ALL)

    private List<Pizza> pizzaList;
    @OneToMany(mappedBy = "menu", cascade = CascadeType.ALL)
    private List<Drinks> drinksList;

    @OneToMany(mappedBy = "menu", cascade = CascadeType.ALL)
    private List<Toppings> toppingsList;

    public Menu(@Qualifier("listaDiPizze")List<Pizza> pizzaList, List<Drinks> drinksList,List<Toppings>toppingsList) {
        this.pizzaList = pizzaList;
        this.drinksList = drinksList;
        this.toppingsList=toppingsList;
    }

    @Override
    public String toString() {
        return "Menu{" + "\n" +
                "Pizzas=" + pizzaList +"\n" +
                "Drinks=" + drinksList +"\n" +
                "Toppings=" + toppingsList +"\n" +
                '}';
    }
}
