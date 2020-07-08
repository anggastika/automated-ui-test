package demo.api.bibit.products.get_products;

import demo.api.bibit.auth.login.BaseApi;
import io.restassured.response.Response;

import static demo.constants.EndpointConstants.*;

public class ProductsApi extends BaseApi {
    public Response getBestProductsByCategoryName(String categoryName, int limit) {
        Response response = baseRequest()
                .param("category", categoryName)
                .param("limit", limit)
                .get(ENDPOINT_GET_BEST_PRODUCTS_BY_CATEGORY);
        return response;
    }

    public Response getProductDetail(String symbol) {
        Response response = baseRequest()
                .pathParam("symbol", symbol)
                .get(ENDPOINT_GET_PRODUCT_DETAILS);
        return response;
    }

    public Response getProductProspectus(String symbol) {
        Response response = baseRequest()
                .pathParam("symbol", symbol)
                .get(ENDPOINT_GET_PRODUCT_PROSPECTUS);
        return response;
    }

    public Response getProductFactsheets(String symbol) {
        Response response = baseRequest()
                .pathParam("symbol", symbol)
                .get(ENDPOINT_GET_PRODUCT_FACTSHEETS);
        return response;
    }
}
