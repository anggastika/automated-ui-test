
package demo.models.auth.login.login_phone;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@lombok.Data
@Builder
public class Data {

  private Long otp;
  private Boolean resend;
  private Long resendtime;

}
