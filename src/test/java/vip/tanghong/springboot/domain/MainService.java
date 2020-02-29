package vip.tanghong.springboot.domain;
/**
 * MainService
 * Description:
 * @author: tanghong
 * @date: 2019-01-16 22:16
 */
public class MainService {

    static {
        System.out.println("我是main方法中的静态代码块");
    }

    {
        System.out.println("我是main方法中的构造代码块");
    }

    public static void main(String[] args) {
        System.out.println("我是main方法");
        Student student1 = new Student();
        Student student2 = new Student();
    }

}
