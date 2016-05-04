package cn.jondai.duilder;

/**
 * Created by JonDai on 2016/5/4.
 */
public enum HairColor {
    WHITE, BLOND, RED, BROWN, BLACK;

    @Override
    public String toString() {
        return name().toUpperCase();
    }
}
