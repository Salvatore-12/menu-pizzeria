package salvatoreasssennato.menupizzeria.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name="pizza")
public class Pizza {
    @Id
    @GeneratedValue
    private long id;
    @Column(name = "name", nullable = false, length = 255)
    private String name;
    @ElementCollection
    @CollectionTable(name = "pizza_toppings", joinColumns = @JoinColumn(name = "pizza_id"))
    private List<Toppings>toppingsList=new ArrayList<>();

    @Column(name = "calories")
    private int calories;
    @Column(name = "price")
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
