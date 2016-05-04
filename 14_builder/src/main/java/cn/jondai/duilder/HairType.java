package cn.jondai.duilder;

/**
 * Created by JonDai on 2016/5/4.
 * 发型
 */
public enum HairType {
    BALD("bald"), SHORT("short"), CURLY("curly"), LONG_STRAIGHT("long straight"), LONG_CURLY("long curly");

    private String title;
    HairType(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "HairType{" +
                "title='" + title + '\'' +
                '}';
    }
}
