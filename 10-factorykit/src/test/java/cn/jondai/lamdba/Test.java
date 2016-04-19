package cn.jondai.lamdba;

/**
 * Created by JonDai on 2016/4/19.
 */
public class Test implements TestInterface{

    public boolean isNull(String str){
        System.out.println("Impl Null Check");
        return str == null ? true : false;
    }

    public static void main(String[] args){
        Test test = new Test();
        test.foo("Lambda");

        test.isNull("Lambda");
    }
}
