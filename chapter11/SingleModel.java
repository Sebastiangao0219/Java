package chapter11;
/*
 * Instance of Single model
 */
public class SingleModel {
    /*
     * 用来保存唯一的本类的实例
     */
    private static SingleModel me = null;

    public int count = 0;
    private SingleModel(){
        count++;
    }

    /*
     * To get the one and only instance of the local class
     * core method of single model
     * instance can be new cuz the private constructor and this
     * method are in the same class
     */
    public static SingleModel getInstance(){
        if(null == me)
            me = new SingleModel();
        return me;
    }


}