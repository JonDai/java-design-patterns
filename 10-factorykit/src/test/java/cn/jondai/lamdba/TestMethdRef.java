package cn.jondai.lamdba;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by JonDai on 2016/4/19.
 */
public class TestMethdRef {

    @Test
    public void convertTest() {
        List<String> collected = new ArrayList<>();
        collected.add("alpha");
        collected.add("beta");
        collected = collected.stream().map(String::toUpperCase).collect(Collectors.toCollection(ArrayList::new));//注意发生的变化
        System.out.println(collected);
    }
}
