package vip.tanghong.springboot.inter;

/**
 * Description:
 *
 * @author: tanghong
 * @date: 2019-01-15 10:44
 */
public interface SuperInterface {

    public String getCat();

    default public String getDog() {
        return "interface dog";
    }

}
