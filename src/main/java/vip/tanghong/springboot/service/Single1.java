package vip.tanghong.springboot.service;
/**
 * InterviewTest
 * Description:
 * @author: tanghong
 * @date: 2019-01-16 08:25
 */
public class Single1 {

    private Single1() {}

    private static final Single1 test = new Single1();

    public static Single1 getSingle() {
        return test;
    }

}
