package chapter11.modeldemo.printdemo.impl;

import chapter11.modeldemo.printdemo.iface.IPaper;

/**
 * @Program:
 * @Pescription:
 * @Param:
 * @Return:
 * @Author: Sebastian Gao
 * @Date: 2020-06-12 15:00
 */

public class B5PaperImpl implements IPaper{

    @Override
    public String getSize() {
        return "B5";
    }
}
