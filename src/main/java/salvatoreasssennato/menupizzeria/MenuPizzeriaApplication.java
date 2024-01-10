package salvatoreasssennato.menupizzeria;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import salvatoreasssennato.menupizzeria.Entities.Menu;

@SpringBootApplication
public class MenuPizzeriaApplication {

	public static void main(String[] args) {

 AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MenuPizzeriaApplication.class);
  System.out.println("pizza list");
  //System.out.println(ctx.getBean("Margherita"));
  System.out.println(ctx.getBean("margherita"));
  System.out.println(ctx.getBean("hawaiian"));
  System.out.println(ctx.getBean("salamiPizza"));
  //System.out.println(ctx.getBean("hawaiianPizza"));
  System.out.println("questo è il mio menù");
  Menu menu=(Menu) ctx.getBean("menu");
  System.out.println(menu);
  System.out.println("list of ingredients");
  //System.out.println(ctx.getBean("getTomato"));
  //System.out.println(ctx.getBean("getCheese"));
  //System.out.println(ctx.getBean("getProsciuttoCrudo"));
  //System.out.println(ctx.getBean("getHam"));
  //System.out.println(ctx.getBean("getSalami"));
  //System.out.println(ctx.getBean("getBuffaloMozzarella"));
  //System.out.println(ctx.getBean("getFrenchFriess"));
  //System.out.println(ctx.getBean("getPineapple"));
  //System.out.println("drink list");
  //System.out.println(ctx.getBean("Water"));
  //System.out.println(ctx.getBean("Lemonade"));
  //System.out.println(ctx.getBean("Beer"));
  //System.out.println(ctx.getBean("Wine"));

	}
}
