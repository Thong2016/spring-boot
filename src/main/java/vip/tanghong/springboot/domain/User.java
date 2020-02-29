package vip.tanghong.springboot.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * User
 * Description:用户实体类
 * @author: tanghong
 * @date: 2019-01-14 10:13
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User implements Serializable {

    private Integer userId;

    private String userName;

    private String password;

}
