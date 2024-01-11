package salvatoreasssennato.menupizzeria.Entities;

import jakarta.persistence.*;
import salvatoreasssennato.menupizzeria.Entities.Enum.StateOrder;

import java.time.LocalTime;
@Entity
@Table(name="orders")
public class Orders{
    @Id
    @GeneratedValue
    private long id;
    @Enumerated(EnumType.STRING)
    @Column(name = "state_order", nullable = false)
    private StateOrder stateOrder;
    @Column(name = "number_covered", nullable = false)
    private int numberCovered;
    @Column(name = "acquisition_time", nullable = false)
    private LocalTime acquisitionTime;
    @ManyToOne
    @JoinColumn(name = "table_id", nullable = false)
    private Tables table;


}
