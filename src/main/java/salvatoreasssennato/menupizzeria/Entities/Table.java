package salvatoreasssennato.menupizzeria.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import salvatoreasssennato.menupizzeria.Entities.Enum.StateTable;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Table {
    private int numberTable;
    private int maxcovered;
    private StateTable stateTable;



}
