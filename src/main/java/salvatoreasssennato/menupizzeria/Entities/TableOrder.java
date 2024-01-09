package salvatoreasssennato.menupizzeria.Entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class TableOrder {
    private long id;
    private int maxcovered;
    private double costCovered;
    private StateTable stateTable;
}
