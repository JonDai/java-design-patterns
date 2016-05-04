package cn.jondai.factory.method;

/**
 * Created by JonDai on 2016/4/20.
 * 精灵的武器
 */
public class ElfWeapon implements Weapon{

    private WeaponType weaponType;

    public ElfWeapon(WeaponType weaponType){
        this.weaponType = weaponType;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    @Override
    public String toString() {
        return "Elven " + weaponType;
    }

    @Override
    public void kill() {
        System.out.println("Elf is killing...");
    }
}
