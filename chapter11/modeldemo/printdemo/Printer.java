package chapter11.modeldemo.printdemo;

import chapter11.modeldemo.printdemo.iface.IInkBox;
import chapter11.modeldemo.printdemo.iface.IPaper;

/**
 * class of printer, print with standard ink box and paper
 *
 * @Program:
 * @Pescription:
 * @Param:
 * @Return:
 * @Author: Sebastian Gao
 * @Date: 2020-06-12 14:30
 */

public class Printer {
    /**
     * ink box and paper in the printer
     *
     * @Param:
     * @Return:
     */
    private IInkBox inkbox = null;
    private IPaper paper = null;

    /**
     * print method of printer, using ink box and paper
     *
     * @Param: content. the content passed to printer to print
     * @Return:
     */
    public void print(String content) {
        if (inkbox == null || paper == null) {
            System.out.println("Ink box or paper error, please retry after correct installation!");
            return;
        }
        /**
         * processes of print
         * @Param: [content]
         * @Return: void
         */
        String color = inkbox.getColor();
        String type = paper.getSize();
        System.out.println("The color of words is " + color);
        System.out.println("The type of the paper is " + type);
        System.out.println("The printed content is " + content);
    }

    public IInkBox getInkbox() {
        return inkbox;
    }

    public void setInkbox(IInkBox inkbox) {
        this.inkbox = inkbox;
    }

    public IPaper getPaper() {
        return paper;
    }

    public void setPaper(IPaper paper) {
        this.paper = paper;
    }
}
