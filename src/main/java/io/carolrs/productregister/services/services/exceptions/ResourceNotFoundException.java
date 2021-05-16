package io.carolrs.productregister.services.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    private static final long seriaLVersionUID = 1L;

    public ResourceNotFoundException (Object id){
        super("Resource Not Found. Id" + id);
    }

}
