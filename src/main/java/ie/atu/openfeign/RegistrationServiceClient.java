package ie.atu.openfeign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@FeignClient(name = "confirmation-service", url = "http://localhost:8082")
public interface RegistrationServiceClient {
    @PostMapping("/confirm")
    String somDetails(@RequestBody UserDetails userDetails);
}
