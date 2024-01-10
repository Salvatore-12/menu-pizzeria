package salvatoreasssennato.menupizzeria.Entities;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import salvatoreasssennato.menupizzeria.MenuPizzeriaApplication;
@Component
@PropertySource("application.properties")
public class MyRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MenuPizzeriaApplication.class);
        System.out.println("questo è il mio menù");
        Menu menu=(Menu) ctx.getBean("menu");
        System.out.println(menu);
        //System.out.println("questa è la lista di tutti i condimenti");
        //System.out.println(ctx.getBean("getTomato"));
        //System.out.println(ctx.getBean("getCheese"));
        //System.out.println(ctx.getBean("getProsciuttoCrudo"));
        //System.out.println(ctx.getBean("getHam"));
        //System.out.println(ctx.getBean("getSalami"));
        //System.out.println(ctx.getBean("getBuffaloMozzarella"));
        //System.out.println(ctx.getBean("getFrenchFriess"));
        //System.out.println(ctx.getBean("getPineapple"));

    }
}
