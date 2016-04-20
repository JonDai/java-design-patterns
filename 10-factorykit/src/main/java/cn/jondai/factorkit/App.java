package cn.jondai.factorkit;

/**
 * Created by JonDai on 2016/4/19.
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
        Weapon axe = factory.create(WeaponType.BOW);
        System.out.println(axe);
    }
}
