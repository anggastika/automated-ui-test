
package demo.models.auth.login.login_phone;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@lombok.Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class LoginPhoneResponse {

  private Data data;
  private String message;

}
