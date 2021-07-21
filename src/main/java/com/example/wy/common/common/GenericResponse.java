package com.example.wy.common.common;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GenericResponse<T> extends BaseResponse implements ResponseState {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public boolean isSuccess() {
        return getStatus() == 1;
    }
}
