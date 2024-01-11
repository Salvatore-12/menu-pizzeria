package salvatoreasssennato.menupizzeria.Entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import salvatoreasssennato.menupizzeria.Entities.Enum.StateTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("application.properties")
public class menuConfig{
 //PIZZE
    @Bean
    public Pizza margherita(){
      Pizza pizza=new Pizza();
      pizza.setName("Margherita");
      pizza.setToppingsList(Arrays.asList(getTomato(),getCheese()));
      pizza.setCalories(1010);
      pizza.setPrice(4.99);
      return pizza;
    }

    @Bean
    public Pizza hawaiian(){
     Pizza pizza=new Pizza();
     pizza.setName("Hawaiian");
     pizza.setToppingsList(Arrays.asList(getTomato(),getCheese(),getHam(),getPineapple()));
     pizza.setCalories(1024);
     pizza.setPrice(6.99);
     return pizza;
    }
    @Bean
    public Pizza salamiPizza(){
     Pizza pizza=new Pizza();
     pizza.setName("SalamiPizza");
     pizza.setToppingsList(Arrays.asList(getTomato(),getCheese(),getSalami()));
     pizza.setCalories(1160);
     pizza.setPrice(5.99);
     return pizza;
    }
    @Bean("listaDiPizze")
      List<Pizza>listaDiPizze(){
        List<Pizza>ListPizza=new ArrayList<>();
        ListPizza.add(margherita());
        ListPizza.add(hawaiian());
        ListPizza.add(salamiPizza());
        return ListPizza;
    }

// TOPPINGS
    @Bean
    Toppings getTomato(){
        return new Toppings("Tomato",150,1.00);
    }
    @Bean
    Toppings getCheese(){
      return new Toppings("Cheese",350,2.00);
    }
    @Bean
    Toppings getProsciuttoCrudo(){
        return new Toppings("Prosciutto crudo",250,2.50);
    }
    @Bean
    Toppings getBuffaloMozzarella(){
        return new Toppings("Mozzarerlla di bufala",400,2.50);
    }
    @Bean
    Toppings getFrenchFriess(){
        return new Toppings("Patatine fritte",150,2.00);
    }
    @Bean
    Toppings getSalami(){
        return new Toppings("Salame",200,1.50);
    }
    @Bean
    Toppings getHam(){
        return new Toppings("Prosciutto cotto",35,0.99);
  }
    @Bean
    Toppings getPineapple(){
        return new Toppings("Ananas",35,0.99);
    }

    //DRINKS
    @Bean
    Drinks Water(){
      return new Drinks(1,"Acqua",0.5,0,0,1.29);
    }
    @Bean
    Drinks Lemonade(){
      return new Drinks(2,"Limonata",0.33, 0,128,1.29);
    }
    @Bean
    Drinks Beer(){
      return new Drinks(3,"Birra:Moretti",0.66,5,37,1.35);
    }
    @Bean
    Drinks Wine(){
      return new Drinks(4,"Vino:Nero D'Avola",0.75,14,600,9.50);
    }
 // TABLES
    @Bean
    public Tables getTavolo1(){
        return new Tables(1,5, StateTable.Libero);
    }
    @Bean
    public Tables getTavolo2(){
        return new Tables(2,3, StateTable.Libero);
    }

    }



