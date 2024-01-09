package salvatoreasssennato.menupizzeria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import salvatoreasssennato.menupizzeria.Entities.HawaiianPizza;
import salvatoreasssennato.menupizzeria.Entities.PizzaMargherita;
import salvatoreasssennato.menupizzeria.Entities.SalamiPizza;

@SpringBootApplication
public class MenuPizzeriaApplication {

	public static void main(String[] args) {
		//1)metodo tradizionale
//SpringApplication.run(MenuPizzeriaApplication.class, args);
//PizzaMargherita pm=new PizzaMargherita("tomato","cheese",1010,4.99);
//System.out.println(pm);
//    HawaiianPizza hp= new HawaiianPizza("tomato","cheese",1024,6.99,"ham","pineapple");
//     System.out.println(hp);
//SalamiPizza sp=new SalamiPizza("tomato","cheese",1160,5.99,"salami");
//System.out.println(sp);
 AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MenuPizzeriaApplication.class);
  System.out.println("pizza list");
  System.out.println(ctx.getBean("Margherita"));
  System.out.println(ctx.getBean("hawaiianPizza"));
  System.out.println(ctx.getBean("salamiPizza"));
  System.out.println("list of ingredients");
  System.out.println(ctx.getBean("getCheese"));
  System.out.println(ctx.getBean("getProsciuttoCrudo"));
  System.out.println(ctx.getBean("getHam"));
  System.out.println(ctx.getBean("getSalami"));
  System.out.println(ctx.getBean("getBuffaloMozzarella"));
  System.out.println(ctx.getBean("getFrenchFriess"));
  System.out.println(ctx.getBean("getPineapple"));
  System.out.println("drink list");
  System.out.println(ctx.getBean("Water"));
  System.out.println(ctx.getBean("Lemonade"));
  System.out.println(ctx.getBean("Beer"));
  System.out.println(ctx.getBean("Wine"));

	}
}
