
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
@SuppressWarnings("unused")
public class PaymentConfig {

  @JsonProperty("OY_PARTNER_USER_ID")
  private String oYPARTNERUSERID;
  @JsonProperty("VA_NUMBER_BNI")
  private String vANUMBERBNI;

}
