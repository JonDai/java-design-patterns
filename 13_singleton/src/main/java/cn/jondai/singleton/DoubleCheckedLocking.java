package cn.jondai.singleton;

/**
 * Created by JonDai on 2016/5/3.
 * 双检锁/双重校验锁
 *
 * JDK 版本：JDK1.5 起
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 实现难度：较复杂
 * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * getInstance() 的性能对应用程序很关键。
 */
public class DoubleCheckedLocking {

    private static volatile DoubleCheckedLocking instance;

    /**
     * 为了防止反射实例化调用
     */
    private DoubleCheckedLocking(){
        if(instance != null){
            throw new IllegalStateException("Already initialized.");
        }
    }

    // Joshua Bloch "Effective Java, Second Edition", p. 283-284
    public static DoubleCheckedLocking getInstance(){
        DoubleCheckedLocking result = instance;

        if(result == null){
            synchronized (DoubleCheckedLocking.class){
                result = instance;
                if(result == null){
                    instance = result = new DoubleCheckedLocking();
                }
            }
        }

        return result;
    }
}
