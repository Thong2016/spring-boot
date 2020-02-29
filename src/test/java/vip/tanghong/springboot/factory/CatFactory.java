package vip.tanghong.springboot.factory;
/**
 * CatFactory
 * Description:
 * @author: tanghong
 * @date: 2019-01-18 13:56
 */
public class CatFactory implements Factory {


    @Override
    public Animal createAnimal() {
        return new Cat();
    }

}
