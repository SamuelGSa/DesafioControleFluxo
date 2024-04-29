package org.example.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParametrosInvalidosException extends RuntimeException{

    public  ParametrosInvalidosException(String code) {
        super(code);
    }

}
