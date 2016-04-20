package cn.jondai.factory.method;

/**
 * Created by JonDai on 2016/4/20.
 * 半兽人的武器
 */
public class OrcWeapon implements Weapon {

    private WeaponType weaponType;

    public OrcWeapon(WeaponType weaponType){
        this.weaponType = weaponType;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    @Override
    public String toString() {
        return "Orcish " + weaponType;
    }

    @Override
    public void kill() {
        System.out.println("Orc is killing...");
    }
}
