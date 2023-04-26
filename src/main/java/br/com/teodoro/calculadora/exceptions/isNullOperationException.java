package br.com.teodoro.calculadora.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class isNullOperationException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public isNullOperationException(String exception) {
        super(exception);
    }
}