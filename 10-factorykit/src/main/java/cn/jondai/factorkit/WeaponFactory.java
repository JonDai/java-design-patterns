package cn.jondai.factorkit;

import java.util.HashMap;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Created by JonDai on 2016/4/19.
 */
@FunctionalInterface
public interface WeaponFactory {

    Weapon create(WeaponType name);

    /**
     * 返回给该函数接口一个默认的lambda表达式（是一个Supplier生产者的函数接口）
     * 运行create方法时便执行还lambda。  map.get(name) -> 返回个 lambda（Spear::new）
     * 然后执行Supplier.get()方法时便执行该lambda
     * @param consumer
     * @return
     */
    static WeaponFactory factory(Consumer<Builder> consumer){
        HashMap<WeaponType , Supplier<Weapon>> map = new HashMap<>();
        consumer.accept(map :: put);
        return name -> map.get(name).get();
    }
}
