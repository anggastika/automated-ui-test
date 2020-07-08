package demo.constants;

public interface EndpointConstants {
    String BASE_URL = "https://api.lab.bibit.id/";
    String BASE_PATH = "/testing";
    String ENDPOINT_LOGIN_PHONE = "/auth/login/phone";
    String ENDPOINT_LOGIN_OTP = "/auth/login/otp";
    String ENDPOINT_GET_PORTOFOLIO_LIST = "/portfolio/list/{filter}";
    String ENDPOINT_GET_PORTOFOLIO_SUMMARY = "/portfolio";
    String ENDPOINT_GET_PORTOFOLIO_BY_CATEGORY_ID = "/portfolio/category/:categoryid/{categoryId}";
    String ENDPOINT_CHECK_ROBO_RESULT = "/robo/check";
    String ENDPOINT_GET_BEST_PRODUCTS_BY_CATEGORY = "/products/best/category";
    String ENDPOINT_GET_PRODUCT_DETAILS = "/products/{symbol}";
    String ENDPOINT_GET_PRODUCT_PROSPECTUS = "/products/{symbol}/prospectus";
    String ENDPOINT_GET_PRODUCT_FACTSHEETS = "/products/{symbol}/factsheets";
}
