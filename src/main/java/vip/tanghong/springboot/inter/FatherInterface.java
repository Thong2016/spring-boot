package vip.tanghong.springboot.inter;

/**
 * Description:
 *
 * @author: tanghong
 * @date: 2019-01-15 11:05
 */
public interface FatherInterface {

    String getFather();

    default String getFather2() {
        return "father2";
    };

}
