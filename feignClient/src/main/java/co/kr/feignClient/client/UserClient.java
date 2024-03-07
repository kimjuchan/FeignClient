package co.kr.feignClient.client;

import co.kr.feignClient.dto.GetUserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name="userClient",url="https://randomuser.me")
public interface UserClient {
    @GetMapping("/api/") // requestParam 값 존재.
    GetUserResponse getUsers(@RequestParam("nat") String nation);

}
