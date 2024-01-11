package salvatoreasssennato.menupizzeria.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import salvatoreasssennato.menupizzeria.Entities.Enum.StateTable;

@Entity
@Table(name="tables")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Tables {
    @Id
    @GeneratedValue
    private long id;
    @Column(name = "max_covered", columnDefinition = "INT")
    private int max_covered;
    @Enumerated(EnumType.STRING)
    @Column(name = "state_table", columnDefinition = "VARCHAR(255)")
    private StateTable state_table;

    @Override
    public String toString() {
        return "\n Table{" +
                "id=" + id +
                ", max_covered=" + max_covered +
                ", state_table=" + state_table +
                '}';
    }
}
