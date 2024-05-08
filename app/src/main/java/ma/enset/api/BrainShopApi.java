package ma.enset.api;

import ma.enset.model.BrainShopResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface BrainShopApi {
    @GET
    Call<BrainShopResponse> getMessage(@Url String URL);
}
