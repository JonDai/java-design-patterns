package cn.jondai.factorkit;

import java.util.HashMap;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Created by JonDai on 2016/4/19.
 */
public interface WeaponFactory {

    Weapon create(WeaponType name);

    static WeaponFactory factory(Consumer<Builder> consumer){
        HashMap<WeaponType , Supplier<Weapon>> map = new HashMap<>();
        consumer.accept(map :: put);
        return name -> map.get(name).get();
    }
}
