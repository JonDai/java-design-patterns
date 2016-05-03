package cn.jondai.singleton;

import java.io.Serializable;

/**
 * Created by JonDai on 2016/5/3.
 * 登记式/静态内部类
 *
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 实现难度：一般
 * 描述：这种方式能达到双检锁方式一样的功效，但实现更简单。对静态域使用延迟初始化，应使用这种方式而不是双检锁方式。
 * 这种方式只适用于静态域的情况，双检锁方式可在实例域需要延迟初始化时使用。
 */
public final class Register implements Serializable{
    private static final long serialVersionUID = 1L;

    private Register(){}

    public static Register getInstance(){
        return HelperHolder.INSTANCE;
    }

    protected Object readResolve() {
        return getInstance();
    }

    private static class HelperHolder {
        public static final Register INSTANCE =
                new Register();
    }
}
