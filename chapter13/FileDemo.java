package chapter13;

import javax.swing.*;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Date;

/**
 * TODO: Perform methods of class File
 *
 * @Program:
 * @Pescription:
 * @Param:
 * @Return:
 * @Author: Sebastian Gao
 * @Date: 2020-06-14 15:54
 */

public class FileDemo {
    /**
     * current filepath constant
     * @Param:
     * @Return:
     */
    private static final String FILE_PATH = "/Users/g-sebastian/Desktop/Java";
    public static void main(String[] args) throws IOException {
        JFileChooser fileChooser = new JFileChooser(new File("."));
        //让FileChooser可以选择文件夹
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        fileChooser.showOpenDialog(null);//显示出选择文件的对话框（null表示无父窗体）
        //获得用户选择的文件 建议使用时判断file是否为null，如果为null，表示用户点了取消按钮
        File file = fileChooser.getSelectedFile();//获得用户选择的文件
        if(null == file){
            System.out.println("User doesn't select any file, OS force to exit!");
            System.exit(0);
        }
        //root repository of current project new File(".");
        //File file = new File(FILE_PATH);
        System.out.println("File/Directory exist? " + file.exists());
        System.out.println("Is it a file? " + file.isFile());
        System.out.println("Is it a Directory? " + file.isDirectory());
        System.out.println("File/Directory name: " + file.getName());
        System.out.println("Absolute Path: " + file.getAbsolutePath());
        System.out.println("Path: " + file.getPath());
        System.out.println("Last Modified Time: " + new Date(file.lastModified()).toLocaleString());
        System.out.println("Is Hidden: " + file.isHidden());
        System.out.println("If can read: " + file.canRead());
        System.out.println("If can write: " + file.canWrite());
        System.out.println("Space Occupied: " + file.length());//unit is byte
        System.out.println("Change unit: " + file.canExecute());
        //Generate file using class file
//        if (!file.exists()) {
//            if(file.createNewFile());
//                System.out.println("File Created Successfully!");
//        }

//        if(file.exists()){
//            file.delete();
//            System.out.println("File delete successfully!");
//        }

//        file.createNewFile();
//        System.out.println("File recreate successfully!");
        /**
         * this method(.list()) is for list file names of a certain folder
         * @Param: [args]
         * @Return: void
         */
        String [] fileNames = file.list(new DirFilter());
        for (int i = 0; i < fileNames.length; i++) {
            System.out.println(fileNames[i]);
        }

    }

    static class DirFilter implements FilenameFilter{

        @Override
        public boolean accept(File dir, String name) {
            if(name.endsWith("java") || name.endsWith("txt")){
                return true;
            }
            return false;
        }
    }

}

//}
