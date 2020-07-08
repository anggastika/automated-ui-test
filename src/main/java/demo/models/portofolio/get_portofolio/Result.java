
package demo.models.portofolio.get_portofolio;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Result {

  private String created;
  private Object goalsetting;
  private Long id;
  private Double invested;
  @JsonProperty("is_goal")
  private Long isGoal;
  @JsonProperty("is_partner_category")
  private Boolean isPartnerCategory;
  private Long items;
  private Double marketvalue;
  private String name;
  private Long pending;
  private Double percentage;
  private Long profitloss;
  private Long robo;
  private String roboid;
  private Long templateid;
  private Double totalporto;

}
