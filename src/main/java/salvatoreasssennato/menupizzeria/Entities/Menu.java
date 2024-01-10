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

    public Menu(@Qualifier("listaDiPizze")List<Pizza> pizzaList, List<Drinks> drinksList) {
        this.pizzaList = pizzaList;
        this.drinksList = drinksList;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "pizzaList=" + pizzaList +
                ", drinksList=" + drinksList +
                '}';
    }
}
