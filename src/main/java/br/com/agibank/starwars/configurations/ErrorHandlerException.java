package br.com.agibank.starwars.configurations;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class ErrorHandlerException {

    @ExceptionHandler
    public ResponseEntity<String> handleException(Throwable throwable){
        log.info("Estou tratando o erro que aconteceu");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(throwable.getMessage());
    }
}
