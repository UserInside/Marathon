package day11.task2;

public class Shaman extends Hero implements Healer, PhysAttack, MagicAttack {
    double magicAtt;
    public final double HEAL_TEAMMATE = 30;
    public final double HEAL_HIMSELF = 50;


    public Shaman() {
        health = 100;
        physAtt = 10;
        magicAtt = 15;
        physDef = 0.2;
        magicDef = 0.2;
    }

    @Override
    public void healHimself() {
        if (health + HEAL_HIMSELF > 100) health = 100;
        else health += HEAL_HIMSELF;
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + HEAL_TEAMMATE > 100) hero.health = 100;
        else hero.health += HEAL_TEAMMATE;
    }

    public void magicalAttack(Hero hero) {
        double magDmg = (magicAtt * (1 - hero.magicDef));
        if (magDmg > hero.health) {
            hero.health = 0;
        } else {
            hero.health -= magDmg;
        }
    }


    public String toString() {
        return "Shaman{health=" + health + "}";
    }
}
