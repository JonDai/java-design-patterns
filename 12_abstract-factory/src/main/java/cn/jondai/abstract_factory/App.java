package cn.jondai.abstract_factory;

/**
 * Created by JonDai on 2016/4/26.
 *
 */
public class App {

    private Army army;
    private Castle castle;
    private King king;

    public void createKingdomFactory(final KingdomFactory factory){
        setArmy(factory.createArmy());
        setCastle(factory.createCastle());
        setKing(factory.createKing());
    }

    public static void main(String[] args){
        App app = new App();
        System.out.println("This is WeiGuo !");
        app.createKingdomFactory(new WeiKingdomFactory());
        System.out.println(app.getKing().getKingName());
        System.out.println(app.getCastle().getDescription());
        System.out.println(app.getArmy().fighting());

        System.out.println("This is ShuGuo !");
        app.createKingdomFactory(new ShuKingdomFactory());
        System.out.println(app.getKing().getKingName());
        System.out.println(app.getCastle().getDescription());
        System.out.println(app.getArmy().fighting());
    }


    public Army getArmy() {
        return army;
    }

    public void setArmy(Army army) {
        this.army = army;
    }

    public Castle getCastle() {
        return castle;
    }

    public void setCastle(Castle castle) {
        this.castle = castle;
    }

    public King getKing() {
        return king;
    }

    public void setKing(King king) {
        this.king = king;
    }
}
