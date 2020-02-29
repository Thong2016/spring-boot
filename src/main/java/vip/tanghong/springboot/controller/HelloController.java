package vip.tanghong.springboot.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.*;
import vip.tanghong.springboot.domain.Person;
import vip.tanghong.springboot.domain.Role;
import vip.tanghong.springboot.domain.User;

import java.util.Map;

/**
 * HelloController
 * Description:测试@RequestBody接收多个参数
 * @author: tanghong
 * @date: 2019-01-14 10:10
 */
@ResponseBody
@RestController
public class HelloController {

    /**
     * 直接将前台传过来的数据(字符串)反序列化成对象
     * @param user
     * @return
     */
    @PostMapping(value = "hello1")
    public String hello1(@RequestBody User user) {
        System.out.println(user);
        String userStr = JSON.toJSONString(user);
        return userStr;
    }


    /**
     *将前台传过来的数据(字符串)用字符串接收,然后再将其反序列化成对象
     * @param userStr
     * @return
     */
    @PostMapping(value = "hello2")
    public String hello2(@RequestBody String userStr) {
        System.out.println(userStr);

        JSONObject jsonObject = JSON.parseObject(userStr);
        System.out.println(jsonObject);

        System.out.println(jsonObject.get("userId"));
        System.out.println(jsonObject.get("userName"));
        System.out.println(jsonObject.get("password"));

        User user = jsonObject.toJavaObject(User.class);
        System.out.println(user);

        return JSONObject.toJSONString(user);
    }


    /**
     * 将前台穿过来的数据用map接收,然后再将其转换成对象
     * 注意:参数前面必须加@RequestBody,否则map接收不到数据,这时map为null
     * @param map
     * @return
     */
    @PostMapping(value = "hello3")
    public String hello3(@RequestBody Map<String, Object> map) {
        System.out.println(map);

        System.out.println(map.get("userId"));
        System.out.println(map.get("userName"));
        System.out.println(map.get("password"));

        User user = JSONObject.parseObject(JSONObject.toJSONString(map), User.class);
        System.out.println(user);

        return JSONObject.toJSONString(user);
    }

    /**
     * congtroller层的方法不能同时使用两个@RequestBody,否则会报错
     * org.springframework.http.converter.HttpMessageNotReadableException:
     * I/O error while reading input message; nested exception is java.io.IOException: Stream closed
     * @param user
     * @param role
     * @return
     */
    @PostMapping(value = "hello4")
    public String hello4(@RequestBody User user, @RequestBody Role role) {
        System.out.println(user);
        System.out.println(role);
        String userStr = JSON.toJSONString(user);
        String roleStr = JSON.toJSONString(role);
        return userStr + roleStr;
    }


    /**
     * 如果前台要同时传两个(多个)对象的数据到后台,后台需要将这两个对象用一个新的对象包装起来(因为@RequestBody只能接收一个对象)
     * 这时前台只需要将数据传递到后台包装对象的属性中就可以了
     * 注意这时前台传参的方式:
     * {
     * 	"user":{
     * 	  "userId": 1,
     * 	  "userName": "tanghong",
     * 	  "password": "123456"
     *        },
     * 	"role":{
     * 		"roleId": 2,
     * 		"roleCode": "1024",
     * 		"roleName": "管理员"
     *    }
     * }
     * @param person
     * @return
     */
    @PostMapping(value = "hello5")
    public String hello5(@RequestBody Person person) {
        User user = person.getUser();
        Role role = person.getRole();

        System.out.println(user);
        System.out.println(role);

        String userStr = JSON.toJSONString(user);
        String roleStr = JSON.toJSONString(role);
        return userStr + "\n" + roleStr;
    }

    /**
     * 如果要前台要传递多个对象到后台,后台除了可以用一个包装类将需要接受值的多个对象封装之外
     * 还可以通过Map接收
     * 除了前后台可以这样交互数据,系统与系统之间(RPC)也可以这样传递数据(通过Map传递多个对象,这种方式用的很多)
     * 注意传递的json数据
     * {
     * 	"user":{
     * 	  "userId": 1,
     * 	  "userName": "tanghong",
     * 	  "password": "123456"
     *        },
     * 	"role":{
     * 		"roleId": 2,
     * 		"roleCode": "1024",
     * 		"roleName": "管理员"
     *    }
     * }
     * @param map
     * @return
     */
    @RequestMapping("hello6")
    public String hello6(@RequestBody Map<String, Object> map) {
        System.out.println(map);    //{user={userId=1, userName=tanghong, password=123456}, role={roleId=2, roleCode=1024, roleName=管理员}}

        Map<String, Object> user = (Map<String, Object>) map.get("user");
        Map<String, Object> role = (Map<String, Object>) map.get("role");

        System.out.println(user);
        System.out.println(role);

        return JSONObject.toJSONString(user) + "\n" + JSONObject.toJSONString(role);
    }


    /**
     * 后台不加@RequestBody,并且前台使用form-data和x-www-form-urlencoded的方式也可以提交多个对象的数据
     * 前台传递数据的方式(form-data和x-www-form-urlencoded):
     * user.userId=1
     * user.userName=tanghong
     * user.password=123456
     * role.roldId=2
     * role.roleCode=1024DE
     * role.roleName=角色1
     * @param person
     * @return
     */
    @RequestMapping("hello7")
    public String hello7(Person person) {
        System.out.println(person.getUser());
        System.out.println(person.getRole());
        return "hello7";
    }


    /**
     * 无论加@RequestBody还是不加,都无法使用两个参数同时获取数据,但是Ajax貌似可以,有待尝试
     * @param user
     * @param role
     * @return
     */
    @RequestMapping("hello8")
    public String hello8(User user, Role role) {
        System.out.println(user);
        System.out.println(role);
        return "hello8";
    }

}
