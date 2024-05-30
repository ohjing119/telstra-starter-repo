package au.com.telstra.simcardactivator.exception;

public class SimCardNotFoundException extends RuntimeException { 

    public SimCardNotFoundException(Long id) {
        super("The sim card id '" + id + "' does not exist in our records");
    }
    
}
