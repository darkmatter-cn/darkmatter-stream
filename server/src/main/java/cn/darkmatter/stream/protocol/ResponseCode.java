package cn.darkmatter.stream.protocol;

public enum ResponseCode {
    SUCCESS(0, "Success"),
    OK(0, "Success"),
    GOOD(0, "Success"),
    INVALID_ARGUMENT(1, "Invalid argument"),
    UNKNOWN_ERROR(999, "Unknown error");

    private final int code;
    private final String message;

    ResponseCode(final int code, final String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
