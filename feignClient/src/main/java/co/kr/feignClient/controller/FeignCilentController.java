package co.kr.feignClient.controller;


import co.kr.feignClient.dto.GetUserResponse;
import co.kr.feignClient.client.*;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController

public class FeignCilentController {

    @Autowired
    private UserClient userClient;

    @GetMapping("/v1/feign")
    public ResponseEntity<GetUserResponse> getUsers(){
        GetUserResponse users = userClient.getUsers("nat=us");
        return new ResponseEntity<GetUserResponse>(users, HttpStatus.OK);
    }


}
