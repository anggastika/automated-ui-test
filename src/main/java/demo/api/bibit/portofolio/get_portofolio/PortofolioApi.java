package demo.api.bibit.portofolio.get_portofolio;

import demo.api.bibit.auth.login.BaseApi;
import io.restassured.response.Response;

import static demo.constants.EndpointConstants.ENDPOINT_GET_PORTOFOLIO_BY_CATEGORY_ID;
import static demo.constants.EndpointConstants.ENDPOINT_GET_PORTOFOLIO_SUMMARY;

public class PortofolioApi extends BaseApi {

  public static void main(String[] args) {
    PortofolioApi api = new PortofolioApi();
    api.getPortofolio();
  }

  public Response getPortofolio() {
    Response response = baseRequestWithLogin()
        .get(ENDPOINT_GET_PORTOFOLIO_SUMMARY);
    response.getBody().prettyPrint();
    return response;
  }

  public Response getPortofolioByCategoryId(String categoryId){
    Response response = baseRequestWithLogin().pathParam("categoryId", categoryId)
        .get(ENDPOINT_GET_PORTOFOLIO_BY_CATEGORY_ID);
    response.getBody().prettyPrint();
    return response;
  }

}
