package cn.darkmatter.stream.controller;

import cn.darkmatter.stream.protocol.ResponseCode;
import cn.darkmatter.stream.protocol.StreamResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ErrorHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler({
        IllegalArgumentException.class,
        MethodArgumentTypeMismatchException.class
    })
    @ResponseBody
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public StreamResponse<String> handleInvalidArguments(Exception e) {
        logger.info("Invalid argument: {}", e.getMessage());
        return new StreamResponse<String>(ResponseCode.INVALID_ARGUMENT).setData("");
    }

    public void handleServerErrors() {}

    private static Logger logger = LoggerFactory.getLogger(ErrorHandler.class);
}
