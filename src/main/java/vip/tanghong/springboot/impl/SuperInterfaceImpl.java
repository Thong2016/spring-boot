package vip.tanghong.springboot.impl;

import vip.tanghong.springboot.inter.SuperInterface;

/**
 * SuperInterfaceImpl
 * Description:
 * @author: tanghong
 * @date: 2019-01-15 10:46
 */
public class SuperInterfaceImpl implements SuperInterface {

    @Override
    public String getCat() {
        return "interface cat";
    }

}
