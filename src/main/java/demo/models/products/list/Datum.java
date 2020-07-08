
package demo.models.products.list;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@SuppressWarnings("unused")
public class Datum {
    private Aum aum;
    private Boolean etf;
    private List<Object> exitload;
    private Expenseratio expenseratio;
    private Long id;
    private Boolean index;
    private Long minbuy;
    private Long minsell;
    private String name;
    private Long notbuyable;
    private String profile;
    private String riskprofile;
    private String robocategory;
    private Double scoremax;
    private Double scoremin;
    private List<Object> shareholders;
    private Boolean sharia;
    private Simplereturn simplereturn;
    private String symbol;
    private Long tradeable;
    private String type;

}
