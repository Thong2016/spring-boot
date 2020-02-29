package vip.tanghong.springboot.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Person
 * Description:用户实体类和角色实体类的属性集合
 * @author: tanghong
 * @date: 2019-01-14 11:06
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Person implements Serializable {

    private User user;

    private Role role;

}
