package cn.jondai.lamdba;

import org.junit.Test;

/**
 * Created by JonDai on 2016/4/19.
 */
public class TestLambda implements TestInterface{
    public boolean isNull(String str){
        System.out.println("Impl Null Check");
        return str == null ? true : false;
    }

    @Test
    public void test1(){
        new Thread(() -> System.out.println("lambda实现的线程")).run();
    }

    @Test
    public void test2(){
        TestLambda tl = new TestLambda();
        tl.foo("Lambda");
        tl.isNull("abc");
    }

}
