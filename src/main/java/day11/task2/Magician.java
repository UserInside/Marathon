package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {
    double magicAtt;

    public Magician() {
        health = 100;
        physAtt = 5;
        magicAtt = 20;
        physDef = 0.0;
        magicDef = 0.8;
    }

    public void magicalAttack(Hero hero) {
        double magDmg = (magicAtt * (1 - hero.magicDef));
        if (magDmg > hero.health) {
            hero.health = 0;
        } else {
            hero.health -= magDmg;

        }
    }

    public String toString () {
        return "Magician{health=" + health + "}";
    }

}


