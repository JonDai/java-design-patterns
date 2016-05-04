package cn.jondai.duilder;

/**
 * Created by JonDai on 2016/5/4.
 * 武器
 */
public enum Weapon {

    DAGGER, SWORD, AXE, WARHAMMER, BOW;

    @Override
    public String toString() {
        return name().toUpperCase();
    }
}
