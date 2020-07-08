
package demo.models.auth.login.login_otp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@lombok.Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class LoginOtpResponse {

    private Data data;
    private String message;

}
