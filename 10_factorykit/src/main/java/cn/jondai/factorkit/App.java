package cn.jondai.factorkit;

/**
 * Created by JonDai on 2016/4/19.
 *
 * 工厂模式：
 *  使用Lambda表达式来实现的工厂模式不同于一般的简单工厂或者工厂方法模式
 *  更类似于工厂方法模式
 *
 * 首先有四种角色:
 *  1.抽象产品 -> Weapon
 *  2.具体产品 -> Axe、Bow ...
 *  3.抽象工厂 -> WeaponFactory
 *  4.生产者 -> Builder
 *
 *  抽象工厂职责：
 *      1.程序启动时，需要初始化工厂，有了工厂就得需要生产者，并且赋予生产者相应的生产技能，比如生产Axe斧头的技能
 *      2.通过工厂，我们可以通过需要产品的名称或者其他，来让生产者成产出我们需要的产品
 *  生产者职责：
 *      1.如何生产出需要的产品
 */
public class App {
    /**
     * main函数作为程序得入口点
     * 这个程序大量的使用了Java8 Lambda的表达式，factory（）方法传入了一个Consumer（消费者）的函数，
     * 这个函数表达式右侧，又传入了一个Supplier（生产者）的函数-->创建一个对象
     * 并且函数式接口只有当运行它唯一的一个方法时才会触发执行
     * 当执行WeaponFactory.factory() / consumer.accept(map :: put);语句时将会执行builder.add这一段代码
     * builder.add()之后 WeaponFactory中的map会存入这一对象，map的键为name，值为lambda表达式
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
