package au.com.telstra.simcardactivator.component;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import au.com.telstra.simcardactivator.pojo.SimCard;
import au.com.telstra.simcardactivator.pojo.SimCardResponse;
import au.com.telstra.simcardactivator.service.SimCardService;

@RestController
public class SimCardActivatorController {

    private final SimCardActivateHandler simCardActivateHandler;
    SimCardService simCardService;

    public SimCardActivatorController(SimCardActivateHandler simCardActivateHandler) {
        this.simCardActivateHandler = simCardActivateHandler;
    }

    @GetMapping("/{id}")
    public ResponseEntity<SimCardResponse> getSimCard(@PathVariable Long id) {
        return new ResponseEntity<>(simCardService.getSimCard(id), HttpStatus.OK);
    }

    @PostMapping("/activate")
    public ResponseEntity<SimCard> activate(@RequestBody SimCard simcard) {
    //public void activate(@RequestBody SimCard simcard) {
    
        var actuationResult = simCardActivateHandler.handleActivate(simcard);
        System.out.println(actuationResult.getSuccess());     

        return new ResponseEntity<>(simCardService.saveSimCard(simcard), HttpStatus.CREATED);
    }
}
