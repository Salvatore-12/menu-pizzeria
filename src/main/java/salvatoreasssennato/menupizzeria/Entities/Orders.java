package salvatoreasssennato.menupizzeria.Entities;

import java.time.LocalDate;

public class Orders extends TableOrder{
private Drinks drinks;
private HawaiianPizza hawaiianPizza;
private Toppings toppings;
private StateOrder stateOrder;
private int numberCovered;
private LocalDate acquisitionTime;

    public Orders(long id, int maxcovered, int costCovered, StateTable stateTable) {
        super(id, maxcovered, costCovered, stateTable);
    }
}
