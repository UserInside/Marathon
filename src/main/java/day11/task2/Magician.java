package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {

    public Magician() {
        health = 100;
        physAtt = 5;
        magicAtt = 20;
        physDef = 0.0;
        magicDef = 0.8;
    }

    public void physicalAttack(Hero hero) {
        hero.health -= physAtt * (1 - hero.physDef);
        if (hero.health < 0) hero.health = 0;
    }

    public void magicalAttack(Hero hero) {
        hero.health -= magicAtt * (1 - hero.magicDef);
        if (hero.health < 0) hero.health = 0;
    }

    public String toString() {
        return "Magician{health=" + health + "}";
    }


}
