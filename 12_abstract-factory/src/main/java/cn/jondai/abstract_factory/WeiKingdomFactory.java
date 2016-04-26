package cn.jondai.abstract_factory;

/**
 * Created by JonDai on 2016/4/26.
 */
public class WeiKingdomFactory implements KingdomFactory{

    public Army createArmy() {
        return new WeiArmy();
    }

    public Castle createCastle() {
        return new WeiCastle();
    }

    public King createKing() {
        return new WeiKing();
    }
}
