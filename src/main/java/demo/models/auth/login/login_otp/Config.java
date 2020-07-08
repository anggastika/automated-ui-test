
package demo.models.auth.login.login_otp;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@SuppressWarnings("unused")
public class Config {

  @JsonProperty("bonus_product")
  private String bonusProduct;
  @JsonProperty("payment_channel")
  private List<String> paymentChannel;
  @JsonProperty("robo_min_topup")
  private Long roboMinTopup;

}
