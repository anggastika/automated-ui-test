
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
public class Setting {

  @JsonProperty("live_transaction")
  private Long liveTransaction;
  @JsonProperty("update_profile")
  private Boolean updateProfile;

}
