package salvatoreasssennato.menupizzeria.Entities;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name="drinks")
@Getter
@Setter
@AllArgsConstructor

public class Drinks {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;
   @Column(name = "name", columnDefinition = "VARCHAR(255)")
   private String name;
   @Column(name = "capacity",columnDefinition = "DOUBLE")
   private double capacity;
   @Column(name = "degrees", columnDefinition = "INT")
   private int degrees;

   @Column(name = "calories", columnDefinition = "INT")
   private int calories;

   @Column(name = "price", columnDefinition = "DOUBLE")
   private double price;

   public Drinks() {
   }

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
