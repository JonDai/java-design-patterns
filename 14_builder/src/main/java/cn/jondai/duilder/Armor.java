package cn.jondai.duilder;

/**
 * Created by JonDai on 2016/5/4.
 * 盔甲
 */
public enum Armor {

    CLOTHES("clothes"), LEATHER("leather"), CHAIN_MAIL("chain mail"), PLATE_MAIL("plate mail");

    private String clothes;

    Armor(String clothes) {
        this.clothes = clothes;
    }

    @Override
    public String toString() {
        return "Armor{" +
                "clothes='" + clothes + '\'' +
                '}';
    }
}
