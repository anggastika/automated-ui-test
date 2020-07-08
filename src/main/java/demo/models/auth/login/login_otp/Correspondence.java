
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
public class Correspondence {

  private String address;
  @JsonProperty("city_code")
  private String cityCode;
  @JsonProperty("city_name")
  private String cityName;
  private String country;
  @JsonProperty("postal_code")
  private Long postalCode;

}
