package cn.jondai.abstract_factory;

/**
 * Created by JonDai on 2016/4/26.
 */
public class ShuKingdomFactory implements KingdomFactory{
    public Army createArmy() {
        return new ShuArmy();
    }

    public Castle createCastle() {
        return new ShuCastle();
    }

    public King createKing() {
        return new ShuKing();
    }
}
