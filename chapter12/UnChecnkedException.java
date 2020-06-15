package chapter12;

/**
 * Exception which no need to check whose super class is RunTimeException/Error
 * @Program:
 * @Pescription:
 * @Param:
 * @Return:
 * @Author: Sebastian Gao
 * @Date: 2020-06-13 18:43
 */

public class UnChecnkedException {
    public static void main(String[] args) {
//        String value = null;
//        System.out.println(value.toString());
//
//        String strValue = "123a";
//        //String to number
//        int value1 = Integer.parseInt(strValue);
//        System.out.println(value1);

        Person p = new Person();
        Student stu = (Student)p;



    }
}

class Person{

}

class Student extends Person{

}
