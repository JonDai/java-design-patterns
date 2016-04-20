package cn.jondai.factory.method;

/**
 * Created by JonDai on 2016/4/20.
 */
public class App {

    private final Blacksmith blacksmith;

    public App(Blacksmith blacksmith) {
        this.blacksmith = blacksmith;
    }

    public static void main(String[] args){
        App app = new App(new OrcBlacksmith());
        app.manufactureWeapons();
    }

    private void manufactureWeapons(){
        Weapon weapon;
        weapon = blacksmith.manufactureWeapon(WeaponType.AXE);
        System.out.println(weapon);
        weapon.kill();


    }
}
