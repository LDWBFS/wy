package com.example.wy.common.common;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

/**
 * <p>
 *  自定义基础的response
 * </p>
 *
 * @author FS
 * @since 2021-05-08
 */

@Getter
@Setter
public class BaseResponse {
    private int status;
    private String message;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void addMessage(String msg) {
        if (StringUtils.hasText(msg)) {
            if (StringUtils.hasText(this.message)) {
                this.message += ";" + msg;
            } else {
                this.message = msg;
            }
        }
    }

}
