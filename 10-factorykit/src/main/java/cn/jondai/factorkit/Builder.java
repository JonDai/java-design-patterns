package cn.jondai.factorkit;

import java.util.function.Supplier;

/**
 * Created by JonDai on 2016/4/19.
 */
public interface Builder {
    void add(WeaponType name, Supplier<Weapon> supplier);
}
