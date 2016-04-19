package cn.jondai.lamdba;

import com.google.common.collect.Interner;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by JonDai on 2016/4/19.
 */
public class TestLambdaExpress {
    //匿名方法
    @Test
    public void test1(){

        System.out.println(add(5 ,6));
//        Collections.sort();
    }

    public int add(int x, int y) {
        return x + y;
    }

    Runnable r1 = () -> {System.out.println("Hello Lambda!");};

    @Test
    public void test2(){
        List<Integer> nums = Lists.newArrayList(1,null,3,4,null,6);
        long count = nums.stream().filter(num -> num != null).count();
//        System.out.printf(new Long(Long.valueOf(count)).toString());
        System.out.println(count);
    }

    @Test
    public void test3(){
        List<Integer> nums = Lists.newArrayList(1,null,3,4,null,6);
        //流的转换
        List<Integer> numList = nums.stream().filter(num -> num != null).collect(Collectors.toList());
//        Integer[] s_nums = integerStream.toArray(Integer[] :: new);
        System.out.println(numList.size());
    }

    /**
     * 流的操作
     * map:生成的是个 1:1 映射，每个输入元素，都按照规则转换成为另外一个元素
     * flatMap :一对多映射关系
     * filter:对原始 Stream 进行某项测试，通过测试的元素被留下来生成一个新 Stream。
     */

    @Test
    //map操作--转换大写
    public void test4(){
        List<String> wordList = Lists.newArrayList("aa","bb","cc","dd");
//        List<String> outList = wordList.stream().map(String :: toUpperCase).collect(Collectors.toList());
        List<String> outList = wordList.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());
        System.out.println(outList);
     }

    @Test
    //map操作--平方数
    public void test5(){
        List<Integer> nums = Lists.newArrayList(1,2,3,4);
        List<Integer> outNums = nums.stream().map(n -> n*n).collect(Collectors.toList());
        System.out.println(outNums);
    }

    @Test
    //filter操作 --留下偶数
    public void test6(){
        List<Integer> nums = Lists.newArrayList(1,2,3,4,5,6,7,8,9);
        List<Integer> collect = nums.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        System.out.println(collect.size());
    }

}
