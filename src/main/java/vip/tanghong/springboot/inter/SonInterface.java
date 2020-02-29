package vip.tanghong.springboot.inter;

/**
 * Description:
 *
 * @author: tanghong
 * @date: 2019-01-15 11:04
 */
public interface SonInterface extends FatherInterface, TestInterface {

    String getSon();

    default String getSon2() {
        return "son2";
    };

}
