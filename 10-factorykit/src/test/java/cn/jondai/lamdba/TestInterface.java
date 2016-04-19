package cn.jondai.lamdba;

/**
 * Created by JonDai on 2016/4/19.
 */
public interface TestInterface {
    default void foo(String x){
        System.out.println("this is default:"+ x);
    }

    static boolean isNull(String str){
        System.out.println("Interface Null Check");
        return str == null ? true : "".equals(str) ? true : false;
    }
}
