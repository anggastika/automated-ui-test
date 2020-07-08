
package demo.models.products.details;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@SuppressWarnings("unused")
public class Changesvalueaum {

    private Double all;
    @JsonProperty("1m")
    private Object m;
    @JsonProperty("1y")
    private Double y;
    private Object ytd;

}
