package vip.tanghong.springboot.factory;
/**
 * Cat
 * Description:
 * @author: tanghong
 * @date: 2019-01-18 13:55
 */
public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
