package salvatoreasssennato.menupizzeria.Entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("application.properties")
public class menuConfig{
// PIZZE
  @Bean
  public PizzaMargherita Margherita(){
      PizzaMargherita pizzaMargherita= new PizzaMargherita();
      pizzaMargherita.setStr1("tomato");
      pizzaMargherita.setStr2("cheese");
      pizzaMargherita.setCalories(1010);
      pizzaMargherita.setPrice(4.99);
      return pizzaMargherita;
  }
  @Bean
   public HawaiianPizza hawaiianPizza(){
      HawaiianPizza hawaiianPizza=new HawaiianPizza();
      hawaiianPizza.setStr1("tomato");
      hawaiianPizza.setStr2("cheese");
      hawaiianPizza.setHam("ham");
      hawaiianPizza.setPineapple("pineapple");
      hawaiianPizza.setCalories(1024);
      hawaiianPizza.setPrice(6.99);
      return hawaiianPizza;

  }
  @Bean
    public SalamiPizza salamiPizza(){
      SalamiPizza salamiPizza=new SalamiPizza();
      salamiPizza.setStr1("tomato");
      salamiPizza.setStr2("cheese");
      salamiPizza.setSalami("salami");
      salamiPizza.setCalories(1160);
      salamiPizza.setPrice(5.99);
      return salamiPizza;
  }
// TOPPINGS
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
      return new Drinks("Acqua",0.5,0,0,1.29);
    }
    @Bean
    Drinks Lemonade(){
      return new Drinks("Limonata",0.33, 0,128,1.29);
    }
    @Bean
    Drinks Beer(){
      return new Drinks("Birra:Moretti",0.66,5,37,1.35);
    }
    @Bean
    Drinks Wine(){
      return new Drinks("Vino:Nero D'Avola",0.75,14,600,9.50);
    }
    @Bean
   //TableOrder getcostCovered (@Value("${costoCoperto}") double costCovered){
      //return new TableOrder(costCovered);
    //}


    }



