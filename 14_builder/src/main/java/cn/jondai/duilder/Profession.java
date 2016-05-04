package cn.jondai.duilder;

/**
 * Created by JonDai on 2016/5/4.
 * 职业枚举
 */
public enum  Profession {
    WARRIOR, THIEF, MAGE, PRIEST;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
