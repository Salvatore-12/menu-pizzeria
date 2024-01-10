package salvatoreasssennato.menupizzeria.Entities;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Drinks {
   private String name;
   private double capacity;
   private int degrees;
   private int calories;
   private double price;

   @Override
   public String toString() {
      return "\n Drinks{"+
              "name='"+name + '\'' +","+
              "capacity="+capacity +","+
              "degrees="+degrees +","+
              "calories="+calories +","+
              "price="+price +
              '}';
   }
}
