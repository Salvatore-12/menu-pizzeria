package salvatoreasssennato.menupizzeria.Entities;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TableOrder {
    private long id;

    private int maxcovered;

    private StateTable stateTable;
}
