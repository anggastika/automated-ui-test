
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
public class Simplereturn {

    private Object all;
    @JsonProperty("1d")
    private Double d;
    @JsonProperty("1m")
    private Double m;
    @JsonProperty("1y")
    private Double y;
    private Double ytd;

}
