
package demo.models.products.details;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@lombok.Data
@Builder
@SuppressWarnings("unused")
public class ProductDetailsResponse {

    private Data data;
    private String message;

}
