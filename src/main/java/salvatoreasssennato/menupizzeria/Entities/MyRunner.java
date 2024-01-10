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
        System.out.println("pizza list");
        System.out.println(ctx.getBean("margherita"));
        System.out.println(ctx.getBean("hawaiian"));
        System.out.println(ctx.getBean("salamiPizza"));

        System.out.println("questo è il mio menù");
        Menu menu=(Menu) ctx.getBean("menu");
        System.out.println(menu);
    }
}
