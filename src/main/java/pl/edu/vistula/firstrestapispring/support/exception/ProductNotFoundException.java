package pl.edu.vistula.firstrestapispring.support.exception;

public class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException(Long id) {
        super(String.format("Product with %d not found", id));
    }
}