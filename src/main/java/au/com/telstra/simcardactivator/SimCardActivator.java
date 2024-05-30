package au.com.telstra.simcardactivator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import au.com.telstra.simcardactivator.repository.SimCardRepository;

@SpringBootApplication
public class SimCardActivator {

    @Autowired 
    SimCardRepository simCardRepository;
    
    public static void main(String[] args) {
        SpringApplication.run(SimCardActivator.class, args);
    }

}
