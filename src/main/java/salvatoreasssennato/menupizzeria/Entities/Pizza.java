package salvatoreasssennato.menupizzeria.Entities;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private List<Toppings>toppingsList=new ArrayList<>();
    private int calories;
    private double price;

    public Pizza() {
    }

    public Pizza(String name, List<Toppings> toppingsList, int calories, double price) {
        this.name = name;
        this.toppingsList = toppingsList;
        this.calories = calories;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Toppings> getToppingsList() {
        return toppingsList;
    }

    public void setToppingsList(List<Toppings> toppingsList) {
        this.toppingsList = toppingsList;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n Pizza{"+
                "name='"+ name+'\''+","+
                "toppingsList="+toppingsList.stream().map(Toppings::getName).toList()+","+
                "calories="+calories +","+
                "price="+price +
                '}';
    }
}
