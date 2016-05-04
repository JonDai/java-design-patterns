package cn.jondai.duilder;

/**
 * Created by JonDai on 2016/5/4.
 * 英雄有许多属性
 */
public final class Hero {

    /**
     * 职业
     */
    private final Profession profession;

    private final String name;

    /**
     * 发型
     */
    private final HairType hairType;

    /**
     * 头发颜色
     */
    private final HairColor hairColor;

    /**
     * 盔甲
     */
    private final Armor armor;

    /**
     * 武器
     */
    private final Weapon weapon;

    public Hero(HeroBuilder heroBuilder) {
        this.profession = heroBuilder.profession;
        this.name = heroBuilder.name;
        this.hairType = heroBuilder.hairType;
        this.hairColor = heroBuilder.hairColor;
        this.armor = heroBuilder.armor;
        this.weapon = heroBuilder.weapon;
    }

    public Profession getProfession() {
        return profession;
    }

    public String getName() {
        return name;
    }

    public HairType getHairType() {
        return hairType;
    }

    public HairColor getHairColor() {
        return hairColor;
    }

    public Armor getArmor() {
        return armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("This is a ")
                .append(profession)
                .append(" named ")
                .append(name);
        if (hairColor != null || hairType != null) {
            sb.append(" with ");
            if (hairColor != null) {
                sb.append(hairColor).append(' ');
            }
            if (hairType != null) {
                sb.append(hairType).append(' ');
            }
            sb.append(hairType != HairType.BALD ? "hair" : "head");
        }
        if (armor != null) {
            sb.append(" wearing ").append(armor);
        }
        if (weapon != null) {
            sb.append(" and wielding a ").append(weapon);
        }
        sb.append('.');
        return sb.toString();
    }

    /**
     * The Builder Class
     */
    public static class HeroBuilder{
        private final Profession profession;
        private final String name;
        private HairType hairType;
        private HairColor hairColor;
        private Armor armor;
        private Weapon weapon;


        public HeroBuilder(Profession profession, String name) {
            if(profession == null || name == null){
                throw new IllegalArgumentException("profession or name not be null");
        }
            this.profession = profession;
            this.name = name;
        }


        public HeroBuilder withHairType(HairType hairType){
            this.hairType = hairType;
            return this;
        }

        public HeroBuilder withHairColor(HairColor hairColor){
            this.hairColor = hairColor;
            return this;
        }

        public HeroBuilder withArmor(Armor armor){
            this.armor = armor;
            return this;
        }

        public HeroBuilder withWeapon(Weapon weapon){
            this.weapon = weapon;
            return this;
        }

        public Hero build(){
            return new Hero(this);
        }
    }


}


