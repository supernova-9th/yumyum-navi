package com.yamyamnavi.support.error;

import org.springframework.http.HttpStatus;

public class JwtValidateException extends YamYamException {

    public JwtValidateException(ErrorCode errorCode) {
        super(HttpStatus.UNAUTHORIZED, errorCode);
    }

    public JwtValidateException(ErrorCode errorCode, String message) {
        super(HttpStatus.UNAUTHORIZED, errorCode, message);
    }

    public JwtValidateException() {
        super(HttpStatus.UNAUTHORIZED, ErrorCode.INVALID_TOKEN);
    }
}