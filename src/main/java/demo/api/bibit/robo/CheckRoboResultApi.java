package demo.api.bibit.robo;

import demo.api.bibit.auth.login.BaseApi;
import io.restassured.response.Response;

import static demo.constants.EndpointConstants.ENDPOINT_CHECK_ROBO_RESULT;

public class CheckRoboResultApi extends BaseApi {
    public Response getRoboResult(String roboid) {
        Response response = baseRequestWithLogin()
                .param("roboid", roboid)
                .get(ENDPOINT_CHECK_ROBO_RESULT);

//        response.getBody().prettyPrint();
        return response;
    }
}
