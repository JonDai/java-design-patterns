package cn.jondai.factorkit;

/**
 * Created by JonDai on 2016/4/19.
 */
public class App {
    /**
     * Program entry point.
     *
     * @param args @param args command line args
     */
    public static void main(String[] args) {
        WeaponFactory factory = WeaponFactory.factory(builder -> {
            builder.add(WeaponType.SWORD, Sword::new);
            builder.add(WeaponType.AXE, Axe::new);
            builder.add(WeaponType.SPEAR, Spear::new);
            builder.add(WeaponType.BOW, Bow::new);
        });
        Weapon axe = factory.create(WeaponType.AXE);
        System.out.println(axe);
    }
}
