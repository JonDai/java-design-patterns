package cn.jondai.builder;

import org.junit.Test;

/**
 * Created by JonDai on 2016/5/4.
 */
public class TestStringBuilder {
    @Test
    public void test1(){
        String sb = new StringBuilder()
                .append("aa")
                .append("ss")
                .toString();
        System.out.println(sb);
    }
}
