package vip.tanghong.springboot.domain;

import lombok.Data;

/**
 * JsonResult
 * Description:返回数据对象
 * @author: tanghong
 * @date: 2019-01-15 09:47
 */
@Data
public class JsonResult<T> {

    private Integer code;

    private String msg;

    private Long ts;

    private T data;

    public JsonResult() {
        this.code = 0;
        this.msg = "success";
        this.ts = System.currentTimeMillis();
    }

    public JsonResult(Integer code, String msg) {
        this.code = 0;
        this.msg = "success";
        this.code = code;
        this.msg = msg;
        this.ts = System.currentTimeMillis();
    }

    public JsonResult(T data) {
        this.code = 0;
        this.msg = "success";
        this.ts = System.currentTimeMillis();
        this.data = data;
    }

}
