package salvatoreasssennato.menupizzeria.Entities;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Drinks {
   private String name;
   private double capacity;
   private int degrees;
   private int calories;
   private double price;
}
