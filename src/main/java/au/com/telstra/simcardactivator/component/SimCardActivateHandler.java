package au.com.telstra.simcardactivator.component;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import au.com.telstra.simcardactivator.pojo.ActuationResult;
import au.com.telstra.simcardactivator.pojo.SimCard;

@Component
public class SimCardActivateHandler {
    private final RestTemplate restTemplate;
    private final String apiUrl;

    public SimCardActivateHandler(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
        this.apiUrl = "http://localhost:8444/actuate";
    }
    
    public ActuationResult handleActivate(SimCard simCard) {
        return restTemplate.postForObject(apiUrl, simCard, ActuationResult.class);
    }
}
