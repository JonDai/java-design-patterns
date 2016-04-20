package cn.jondai.factory.method;

/**
 * Created by JonDai on 2016/4/20.
 */
public class OrcBlacksmith implements Blacksmith {
    @Override
    public Weapon manufactureWeapon(WeaponType weaponType) {
        return new OrcWeapon(weaponType);
    }
}
