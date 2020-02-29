package vip.tanghong.springboot.service;
/**
 * Single2
 * Description:
 * @author: tanghong
 * @date: 2019-01-16 08:29
 */
public class Single2 {

    private Single2() {}

    private static Single2 single = null;

    public static synchronized Single2 getSingle() {
        if(single == null) {
            single = new Single2();
        }
        return single;
    }

}
