package cn.jondai.factory.method;

/**
 * Created by JonDai on 2016/4/20.
 * 铁匠:制造武器
 */
public interface Blacksmith {
    /**
     * 制造武器
     * @return
     */
    Weapon manufactureWeapon(WeaponType weaponType);
}
