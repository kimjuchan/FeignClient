package co.kr.feignClient.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetUserResponse {

    private List<Result> results;
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Result{
        private String gender;
        private String email;
    }



}
