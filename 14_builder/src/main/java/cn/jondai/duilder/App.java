package cn.jondai.duilder;

/**
 * Created by JonDai on 2016/5/4.
 * Builder Pattern 创建者模式
 * 使用多个简单的对象一步一步构建成一个复杂的对象。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 * 意图：将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示。
 * 主要解决：主要解决在软件系统中，有时候面临着"一个复杂对象"的创建工作，其通常由各个部分的子对象用一定的算法构成；
 * 由于需求的变化，这个复杂对象的各个部分经常面临着剧烈的变化，但是将它们组合在一起的算法却相对稳定。
 * 何时使用：一些基本部件不会变，而其组合经常变化的时候。
 *
 * 应用实例： 1、去肯德基，汉堡、可乐、薯条、炸鸡翅等是不变的，而其组合是经常变化的，生成出所谓的"套餐"。 2、JAVA 中的 StringBuilder。
 * 优点： 1、建造者独立，易扩展。 2、便于控制细节风险。
 * 缺点： 1、产品必须有共同点，范围有限制。 2、如内部变化复杂，会有很多的建造类。
 * 使用场景： 1、需要生成的对象具有复杂的内部结构。 2、需要生成的对象内部属性本身相互依赖。
 * 注意事项：与工厂模式的区别是：建造者模式更加关注与零件装配的顺序。
 */
public class App {

    public static void main(String[] args){
        Hero ManZi = new Hero.HeroBuilder(Profession.WARRIOR,"蛮子")
                .withHairType(HairType.LONG_CURLY)
                .withHairColor(HairColor.BLACK)
                .withWeapon(Weapon.DAGGER)
                .build();

        System.out.println(ManZi);

        Hero LiuLang = new Hero.HeroBuilder(Profession.MAGE , "流浪")
                .withHairType(HairType.BALD)
                .withWeapon(Weapon.BOW)
                .build();

        System.out.println(LiuLang);

        Hero DeMa = new Hero.HeroBuilder(Profession.WARRIOR, "德玛")
                .withHairType(HairType.SHORT)
                .withHairColor(HairColor.RED)
                .withArmor(Armor.LEATHER)
                .withWeapon(Weapon.SWORD)
                .build();

        System.out.println(DeMa);

    }
}
