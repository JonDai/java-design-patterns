package cn.jondai.factory.method;

/**
 * Created by JonDai on 2016/4/20.
 * sword 剑
 * spear 长矛
 * axe 斧头
 */
public enum WeaponType {

    SHORT_SWORD("short sword"), SPEAR("spear"), AXE("axe"), UNDEFINED("");

    private String title;

    WeaponType(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
