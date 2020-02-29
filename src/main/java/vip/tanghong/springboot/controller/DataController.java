package vip.tanghong.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vip.tanghong.springboot.domain.JsonResult;
import vip.tanghong.springboot.domain.User;

/**
 * DataController
 * Description:数据返回测试
 * @author: tanghong
 * @date: 2019-01-15 10:05
 */
@RestController
public class DataController {

    @RequestMapping("/user")
    public User user() {
        User user = new User();
        user.setUserId(1);
        user.setUserName("tanghong");
        user.setPassword("123456");
        return user;
    }


    @RequestMapping("/json")
    public JsonResult jsonResult() {
        JsonResult<Object> jsonResult = new JsonResult<>();
        return jsonResult;
    }


    @RequestMapping("/json2")
    public JsonResult jsonResult2() {
        User user = new User();
        user.setUserId(1);
        user.setUserName("tanghong");
        user.setPassword("123456");

        JsonResult<User> jsonResult = new JsonResult<>(user);
        return jsonResult;
    }


    @RequestMapping("/json3")
    public JsonResult jsonResult3() {
        JsonResult<Object> jsonResult = new JsonResult<>(1, "error");
        return jsonResult;
    }


    @RequestMapping("/json4")
    public JsonResult jsonResult4() {
        JsonResult<Object> jsonResult = new JsonResult<>();

        User user = new User();
        user.setUserId(1);
        user.setUserName("tanghong");
        user.setPassword("123456");

        jsonResult.setData(user);

        return jsonResult;
    }

}
