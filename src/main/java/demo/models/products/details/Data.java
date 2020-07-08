
package demo.models.products.details;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@lombok.Data
@Builder
@SuppressWarnings("unused")
public class Data {

    private List<Asset> asset;
    private Aum aum;
    private List<Bank> bank;
    @JsonProperty("bank_redeem")
    private BankRedeem bankRedeem;
    private Cagr cagr;
    private Changesvalue changesvalue;
    private Changesvalueaum changesvalueaum;
    private String currency;
    @JsonProperty("custodian_bank")
    private CustodianBank custodianBank;
    private Boolean etf;
    private List<Object> exitload;
    private Expenseratio expenseratio;
    private Fee fee;
    private List<Holding> holding;
    private Long id;
    private Boolean index;
    @JsonProperty("investment_manager")
    private InvestmentManager investmentManager;
    private Maxdrawdown maxdrawdown;
    private Long minbuy;
    private Long minsell;
    private String name;
    private Nav nav;
    private Long notbuyable;
    private String profile;
    private String riskprofile;
    private String robocategory;
    private List<Object> shareholders;
    private Boolean sharia;
    private Simplereturn simplereturn;
    private String symbol;
    private Long tradeable;
    private String type;

}
