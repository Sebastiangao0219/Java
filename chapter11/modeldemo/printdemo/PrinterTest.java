package chapter11.modeldemo.printdemo;
import chapter11.modeldemo.printdemo.iface.IInkBox;
import chapter11.modeldemo.printdemo.impl.A4PaperImpl;
import chapter11.modeldemo.printdemo.impl.ColorInkBoxImpl;

/**
 * @Program:
 * @Pescription:
 * @Param:
 * @Return:
 * @Author: Sebastian Gao
 * @Date: 2020-06-12 14:50
 */

public class PrinterTest {
    public static void main(String[] args) {
        Printer printer = new Printer();
        /**
         * install inl box and paper for the printer
         * @Param:
         * @Return:
         */

        printer.setInkbox(new ColorInkBoxImpl());
        printer.setPaper(new A4PaperImpl());
        printer.print("Test!");
    }
}
