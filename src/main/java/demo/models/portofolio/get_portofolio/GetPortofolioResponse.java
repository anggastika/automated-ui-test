
package demo.models.portofolio.get_portofolio;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@lombok.Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class  GetPortofolioResponse {

  private Data data;
  private String message;

}
