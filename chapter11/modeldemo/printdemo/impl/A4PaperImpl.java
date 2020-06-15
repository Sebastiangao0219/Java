package chapter11.modeldemo.printdemo.impl;

import chapter11.modeldemo.printdemo.iface.IPaper;

/**
 * @Program:
 * @Pescription:
 * @Param:
 * @Return:
 * @Author: Sebastian Gao
 * @Date: 2020-06-12 14:54
 */

public class A4PaperImpl implements IPaper {
    @Override
    public String getSize() {
        return "A4";
    }
}
