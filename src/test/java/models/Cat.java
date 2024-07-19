package models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor // аннатация создает конструкор с параметрами
@Data // Включает в себя Getter, Setter, RequiredArgsConstructor, ToString, EqualsAndHashCode, Value
@Builder
@NoArgsConstructor // аннатация создает конструкор с БЕЗпараметрами
public class Cat {
    private String name;
    private String type;

}
