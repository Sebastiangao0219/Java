package chapter13;

import java.io.*;

/**
 * TODO: Perform the basic methods of Input/Output Stream
 * ATTENTION: 目前的读写方式还比较原始，建议在这里熟悉InputStream/OutputStream的一些重用方法即可。
 * 后续会有一些高阶的类对读写方法进行升级和扩展
 * @Program:
 * @Pescription:
 * @Param:
 * @Return:
 * @Author: Sebastian Gao
 * @Date: 2020-06-15 11:09
 */

public class FileStreamDemo {
    private static final String FILE_PATH = "/Users/g-sebastian/desktop/Java/JavaSourceDemo/src/chapter13/FileDemo.java";

    public static void main(String[] args) throws IOException {
        //readFile();
        writeFile();

    }

    public static void writeFile() throws IOException {
        //This file is not exists by default
        final String FILE_PATH_1 = "/Users/g-sebastian/desktop/Java/JavaSourceDemo/src/chapter13/FileDemo1.java";
        OutputStream outStream = new FileOutputStream(FILE_PATH_1);
        String content = "package chapter13;\n";
        content += "public class FileDemo1{\n";
        content += "\tpublic static void main(String[] args){";
        content += "\n\t\tSystem.out.println(\"Hello World!\");\n\t}";
        content += "\n}";
        outStream.write(content.getBytes());//核心语句：将字符串转换成字节数组，写入到文件中
        outStream.close();//写入完毕后一定记得关闭打开的资源

    }

    public static void readFile() throws IOException {
        File file = new File(FILE_PATH);//
        InputStream inputStream = new FileInputStream(file);
        /**
         * Basic operations on read files - comparatively stable
         * 'inputStream.available()' gets InputStream, can read the size of the file in byte
         * @Param: [args]
         * @Return: void
         */
        byte[] bytes = new byte[10000];
        int count = 0;
        while((bytes[count] = (byte)inputStream.read()) != -1){
            count++;
        }
        String content = new String(bytes);//converting byte arrays from read into String so as to print
        System.out.println(content);
        inputStream.close();
    }
}
