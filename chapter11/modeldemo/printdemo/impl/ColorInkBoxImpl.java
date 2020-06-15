package chapter11.modeldemo.printdemo.impl;

import chapter11.modeldemo.printdemo.iface.IInkBox;

/**
 * @Program:
 * @Pescription:
 * @Param:
 * @Return:
 * @Author: Sebastian Gao
 * @Date: 2020-06-12 14:52
 */

public class ColorInkBoxImpl implements IInkBox {

    @Override
    public String getColor() {
        return "Red";
    }
}
