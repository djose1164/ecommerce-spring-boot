package com.djose1164.ecommerce.exceptions;

public enum ErrorCode {
    GENERIC_ERROR("PACKT-0001", "The system is unable to cmplete the request. Contact system support."),
    HTTP_MEDIATYPE_NOT_SUPPORTED("PACKT-0002", "Requested media type is not supported. Please use application/json or "
            + "appliction/xml as 'Content-Type' header value"),
    HTTP_MESSAGE_NOT_WRITABLE("PACKT-0003", "Missing 'Accept' header. Please add 'Accept' header."),
    HTTP_MEDIA_TYPE_NOT_ACCEPTABLE("PACKT-0004", "Requested 'Accept' header value is not supported. Please use application/json "
    + "or application/xml as 'Accept' value"),
    JSON_PARSE_ERROR("PACKT-0005", "Make sure request payload should be a valid JSON or XML object according to 'Content-Type'.");

    ErrorCode(final String errCode, final String errMsgKey) {
        this.errCode = errCode;
        this.errMsgKey = errMsgKey;
    }

    public String getErrCode() {
        return errCode;
    }

    public String getErrMsgKey() {
        return errMsgKey;
    }

    private String errCode;
    private String errMsgKey;
}
