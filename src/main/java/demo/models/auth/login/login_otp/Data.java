
package demo.models.auth.login.login_otp;

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

  private Long active;
  private Config config;
  private Crisp crisp;
  private Long estRegistration;
  @JsonProperty("is_amend")
  private Long isAmend;
  @JsonProperty("is_have_recurring")
  private Boolean isHaveRecurring;
  @JsonProperty("is_have_transaction")
  private Boolean isHaveTransaction;
  @JsonProperty("need_edd")
  private Long needEdd;
  @JsonProperty("payment_config")
  private PaymentConfig paymentConfig;
  private Long pin;
  @JsonProperty("pin_length")
  private Long pinLength;
  private Preference preference;
  private String roboid;
  private Setting setting;
  private Sinvest sinvest;
  private Long suspend;
  private Token token;
  private User user;
  private Long validbank;
  private Long validemail;

}
