
package demo.models.auth.login.login_otp;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@SuppressWarnings("unused")
public class User {

  private String address;
  @JsonProperty("amend_bank")
  private Boolean amendBank;
  @JsonProperty("amend_date")
  private Object amendDate;
  @JsonProperty("approval_date")
  private String approvalDate;
  private Long bank;
  @JsonProperty("bank_account_name")
  private String bankAccountName;
  @JsonProperty("bank_account_number")
  private String bankAccountNumber;
  @JsonProperty("bank_color")
  private String bankColor;
  @JsonProperty("bank_name")
  private String bankName;
  @JsonProperty("birth_date")
  private String birthDate;
  @JsonProperty("birth_place")
  private String birthPlace;
  private String city;
  @JsonProperty("city_name")
  private String cityName;
  private List<Correspondence> correspondence;
  @JsonProperty("correspondence_custom")
  private Long correspondenceCustom;
  private String country;
  private Long education;
  private String email;
  @JsonProperty("file_edd")
  private String fileEdd;
  @JsonProperty("file_identity")
  private String fileIdentity;
  @JsonProperty("file_identity_status")
  private Long fileIdentityStatus;
  @JsonProperty("file_signature")
  private String fileSignature;
  @JsonProperty("file_signature_status")
  private Long fileSignatureStatus;
  private String firstname;
  private String fullname;
  private Long gender;
  private Long id;
  private String identity;
  private Long income;
  @JsonProperty("income_source")
  private Long incomeSource;
  @JsonProperty("income_source_other")
  private Object incomeSourceOther;
  private String lastname;
  @JsonProperty("login_last")
  private String loginLast;
  @JsonProperty("marital_status")
  private Long maritalStatus;
  private Long occupation;
  private String phone;
  @JsonProperty("phone_code")
  private String phoneCode;
  @JsonProperty("phone_number")
  private String phoneNumber;
  @JsonProperty("postal_code")
  private Object postalCode;
  private Object province;
  @JsonProperty("referral_code")
  private String referralCode;
  private Long religion;
  private Object rt;
  private Object rw;
  private Sinvest sinvest;
  private Long status;
  @JsonProperty("sub_district")
  private Object subDistrict;
  private Survey survey;

}
