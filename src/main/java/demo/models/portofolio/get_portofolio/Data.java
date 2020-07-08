
package demo.models.portofolio.get_portofolio;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@lombok.Data
@Builder
public class Data {

  private Double invested;
  private Double marketvalue;
  private Double percentage;
  private Long profitloss;
  private List<Result> result;
  private Long totalpending;
  private Double totalporto;

}
