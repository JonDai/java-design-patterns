package cn.jondai.abstract_factory;

/**
 * Created by JonDai on 2016/4/26.
 * 王国的工厂接口，这是抽象工厂模式最精髓的地方
 */
public interface KingdomFactory {

    Army createArmy();

    Castle createCastle();

    King createKing();

}
