package demo.api.bibit.auth.login;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import demo.models.auth.login.login_otp.LoginOtpResponse;
import demo.models.auth.login.login_otp.Token;
import demo.models.auth.login.login_phone.LoginPhoneResponse;
import io.restassured.RestAssured;
import io.restassured.config.EncoderConfig;
import io.restassured.config.ObjectMapperConfig;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static demo.constants.EndpointConstants.BASE_PATH;
import static demo.constants.EndpointConstants.BASE_URL;
import static io.restassured.RestAssured.given;

public class BaseApi {

  private Response loginOtpResponse;

  public RequestSpecification baseRequest() {
    return given().baseUri(BASE_URL).basePath(BASE_PATH)
            .config(RestAssured.config()
                    .encoderConfig(EncoderConfig.encoderConfig()
                            .encodeContentTypeAs("x-www-form-urlencoded",
                                    ContentType.URLENC).and().defaultContentCharset("UTF-8")).and()
                    .objectMapperConfig(new ObjectMapperConfig().jackson2ObjectMapperFactory(
                            (cls, charset) -> {
                              ObjectMapper objectMapper = new ObjectMapper();
                              objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                              return objectMapper;
                            }
                    )))
            .contentType(ContentType.URLENC)
            .header("Charset", "UTF-8")
            .log().all();
  }


  public RequestSpecification baseRequestWithLogin() {
    if(this.loginOtpResponse == null) {
      this.loginOtpResponse = login();
    }
    LoginOtpResponse loginData = this.loginOtpResponse.as(LoginOtpResponse.class);
    Token token = loginData.getData().getToken();
    return baseRequest().header("Authorization", token.getType() + " " + token.getAccess())
        .cookies(loginOtpResponse.getCookies());
  }

  private Response login() {
    LoginApi loginApi = new LoginApi();
    Response response = loginApi.loginPhone("62", "85156242296");
    LoginPhoneResponse loginPhoneResponse = response.as(LoginPhoneResponse.class);
    return loginApi.loginOTP("62", "85156242296", loginPhoneResponse.getData().getOtp().toString(),
        "a3235c35-c8b3-478b-a2d6-74d696c1deef");
  }

}
