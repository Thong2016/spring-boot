package vip.tanghong.springboot.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Role
 * Description:角色实体类
 * @author: tanghong
 * @date: 2019-01-14 10:15
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Role implements Serializable {

    private Integer roleId;

    private String roleCode;

    private String roleName;

}
