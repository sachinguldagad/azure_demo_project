package com.techprimers.kubernetes.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="server" ,url = "${feign.url}")//http://users-service:8080/users
public interface UserFeign {

	@GetMapping("/get")
    public String getUsers();
}
