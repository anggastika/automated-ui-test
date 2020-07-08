package demo.models.auth.login.login_otp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Moengage {

    @JsonProperty("FINISH_REGISTER_DATE")
    private Long fINISHREGISTERDATE;
    @JsonProperty("HAVE_REMINDER")
    private Boolean hAVEREMINDER;
    @JsonProperty("HAVE_TRANSACTION")
    private Boolean hAVETRANSACTION;

}