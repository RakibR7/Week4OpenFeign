package ie.atu.userservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient(name = "confirmation-service", url = "http://localhost:8082")
public interface RegistrationServiceClient {
    @PostMapping("/confirm")
    String somedetail(@RequestBody UserDetails userDetails);
}
