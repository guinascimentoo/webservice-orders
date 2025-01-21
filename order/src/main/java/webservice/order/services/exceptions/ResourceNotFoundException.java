package webservice.order.services.exceptions;

import java.io.Serializable;

public class ResourceNotFoundException extends RuntimeException{
    private static final long serialVersionsUID = 1L;

    public ResourceNotFoundException(Object id){
        super("Resource not found. Id: " + id);
    }
}