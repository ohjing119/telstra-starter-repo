package au.com.telstra.simcardactivator.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import au.com.telstra.simcardactivator.pojo.Actuate;

@RestController
public class SimCardActivatorController {
    @PostMapping("/activate")
    public ResponseEntity<HttpStatus> activate(@RequestBody Actuate actuate) {
      //  contactService.saveContact(contact);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
