
package demo.models.auth.login.login_otp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@SuppressWarnings("unused")
public class Survey {

  private String birthday;
  private String income;
  private Long investPriority;
  private Long invgoal;
  private Long lossAction;
  private Long marital;
  private String netsaving;

}
