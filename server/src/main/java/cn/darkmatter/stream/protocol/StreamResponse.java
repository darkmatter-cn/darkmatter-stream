package cn.darkmatter.stream.protocol;

public class StreamResponse<T> {
    private int code;
    private String message;
    private T data = null;

    public StreamResponse(ResponseCode c) {
        code = c.getCode();
        message = c.getMessage();
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public StreamResponse<T> setData(T data) {
        this.data = data;
        return this;
    }
}
