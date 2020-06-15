package chapter12;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * TODO: Must Check Exception, except RunTimeException and Error
 * and their subclasses
 *
 * @Program:
 * @Pescription:
 * @Param:
 * @Return:
 * @Author: Sebastian Gao
 * @Date: 2020-06-13 18:49
 */

public class CheckedException {
    public static void main(String[] args) {

        File file = new File("/Users/g-sebastian/Desktop/Java/test.txt");
        try {
            FileWriter writer = new FileWriter(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file.exists());
    }
}
