package cn.jondai.singleton;

/**
 * Created by JonDai on 2016/5/3.
 * 懒汉模式
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 实现难度：易
 * 描述：这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
 * 优点：第一次调用才初始化，避免内存浪费。
 * 缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
 * getInstance() 的性能对应用程序不是很关键（该方法使用不太频繁）。
 */
public class LazyMan {

    private static LazyMan instance;

    private LazyMan(){}

    /**
     * 懒加载
     * @return
     */
    public static synchronized LazyMan getInstance(){
        if(instance == null){
          instance = new LazyMan();
        }

        return instance;
    }
}
