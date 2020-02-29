package vip.tanghong.springboot.impl;

import vip.tanghong.springboot.inter.SonInterface;

/**
 * SonImpl
 * Description:
 * @author: tanghong
 * @date: 2019-01-15 11:07
 */
public class SonImpl implements SonInterface {

    @Override
    public String getSon() {
        return "son";
    }

    @Override
    public String getFather() {
        return "father";
    }

}
