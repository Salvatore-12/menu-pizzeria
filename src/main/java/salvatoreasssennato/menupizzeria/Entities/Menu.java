package salvatoreasssennato.menupizzeria.Entities;


import lombok.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@Component
public class Menu {

private List<Pizza> pizzaList;

private List<Drinks> drinksList;

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
