
package demo.models.robo.result;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@lombok.Data
@Builder
@SuppressWarnings("unused")
public class Data {

    private Long categoryid;
    @JsonProperty("is_goal")
    private Long isGoal;
    private String name;
    private Result result;
    private String roboid;
    private Long templateid;

}
