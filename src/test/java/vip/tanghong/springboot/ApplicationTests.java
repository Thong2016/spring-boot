package vip.tanghong.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import vip.tanghong.springboot.impl.AbstractSuperImpl;
import vip.tanghong.springboot.impl.SuperInterfaceImpl;
import vip.tanghong.springboot.inter.SuperInterface;

import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Test
    public void contextLoads() {
        AbstractSuperImpl abstractSuper = new AbstractSuperImpl();
        System.out.println(abstractSuper.getCat());
        System.out.println(abstractSuper.getDog());

        System.out.println("-----------------");

        SuperInterfaceImpl superInterface = new SuperInterfaceImpl();
        System.out.println(superInterface.getCat());
        System.out.println(superInterface.getDog());
    }


    @Test
    public void test01() {
        Map<String, String> map = new HashMap<>();
        map.put("1", "111");
        map.put("2", "222");
        if(map.containsKey("1")) {
            System.out.println("--------------");
            System.out.println("map中包含数字1");
            System.out.println("--------------");
            ArrayList<String> values = (ArrayList<String>) map.values();
            System.out.println(values);
        }else {
            System.out.println("---------------");
            System.out.println("map中不包含数字1");
            System.out.println("---------------");
            ArrayList<String> values = (ArrayList<String>) map.values();
            System.out.println(values);
        }
    }


    @Test
    public void test02() {
        Boolean isSuccess = null;
        if(!isSuccess) {
            System.out.println("-------------success---------------");
        }else {
            System.out.println("-------------failed----------------");
        }
    }


    @Test
    public void test03() {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> hashSet = new HashSet<>();

        while(hashSet.size() < 10) {
            hashSet.add(scanner.nextInt());
        }

        for(Integer integer : hashSet) {
            System.out.println(integer);
        }

    }

    public void test04() {

    }

}

