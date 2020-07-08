
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
public class Preference {

  private Long gopayAnnouncement;
  private Long hasOpenedTopUpModal;
  private Long hasShownSyariahDialog;
  private Moengage moengage;
  private Long shareGopayFeature;
  private Long statusHide;
  private Long syariah;
  @JsonProperty("update_profile")
  private Boolean updateProfile;

}
