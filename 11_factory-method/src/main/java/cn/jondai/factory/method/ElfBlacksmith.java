package cn.jondai.factory.method;

/**
 * Created by JonDai on 2016/4/20.
 */
public class ElfBlacksmith implements Blacksmith{

    @Override
    public Weapon manufactureWeapon(WeaponType weaponType) {
        return new ElfWeapon(weaponType);
    }
}
