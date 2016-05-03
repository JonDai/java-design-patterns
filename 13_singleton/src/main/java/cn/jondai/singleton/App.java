package cn.jondai.singleton;

/**
 * Created by JonDai on 2016/5/3.
 * 单例模式（Singleton Pattern）是 Java 中最简单的设计模式之一。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 * 这种模式涉及到一个单一的类，该类负责创建自己的对象，同时确保只有单个对象被创建。这个类提供了一种访问其唯一的对象的方式，
 * 可以直接访问，不需要实例化该类的对象。
 *
 * 注意：
 * 1、单例类只能有一个实例。
 * 2、单例类必须自己创建自己的唯一实例。
 * 3、单例类必须给所有其他对象提供这一实例。
 *
 * 经验之谈：一般情况下，不建议使用懒汉方式，建议使用饿汉方式。
 * 只有在要明确实现 lazy loading 效果时，才会使用登记方式。如果涉及到反序列化创建对象时，可以尝试使用枚举方式。
 * 如果有其他特殊的需求，可以考虑使用双检锁方式。
 */
public class App {

    public static void main(String[] args){
        //懒汉模式
        LazyMan lazyMan = LazyMan.getInstance();
        System.out.println("Lazy Man: " + lazyMan);

        //饿汉模式
        HungryMan hungryMan = HungryMan.getInstance();
        System.out.println("Hungry Man: "+ hungryMan);

        //枚举模式
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        System.out.println("Enum Singleton :"+ enumSingleton);

        //双重检查模式
        DoubleCheckedLocking doubleCheckedLocking = DoubleCheckedLocking.getInstance();
        System.out.println("Double Checked Locking: "+ doubleCheckedLocking);

        // 登记式\静态内部类
        Register register = Register.getInstance();
        System.out.println("Register :"+ register);
    }


}
