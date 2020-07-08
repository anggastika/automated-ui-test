package demo.api.bibit.auth.login;

import io.restassured.response.Response;

import static demo.constants.EndpointConstants.ENDPOINT_LOGIN_OTP;
import static demo.constants.EndpointConstants.ENDPOINT_LOGIN_PHONE;

public class LoginApi extends BaseApi {

  public Response loginPhone(String code, String phone) {
    Response response = baseRequest()
        .formParam("code", code)
        .formParam("phone", phone)
        .post(ENDPOINT_LOGIN_PHONE);
    response.getBody().prettyPrint();
    return response;
  }

  public Response loginOTP(String code, String phone, String otp, String notifId) {
    Response response = baseRequest()
        .formParam("code", code)
        .formParam("phone", phone)
        .formParam("otp", otp)
        .formParam("notifid", notifId)
        .post(ENDPOINT_LOGIN_OTP);
    response.getBody().prettyPrint();
    return response;
  }

}
