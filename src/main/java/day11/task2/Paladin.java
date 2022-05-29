package day11.task2;

public class Paladin extends Hero implements Healer {

    public Paladin() {
        health = 100;
        physAtt = 15;
        physDef = 0.5;
        magicDef = 0.2;
    }

    @Override
    public void healHimself() {
        health += 25;
        if(health > 100) health = 100;

    }

    @Override
    public void healTeammate(Hero hero) {
        hero.health += 10;
        if(hero.health > 100) hero.health = 100;
    }

    public void physicalAttack(Hero hero) {
        hero.health -= physAtt * (1 - hero.physDef);
        if (hero.health < 0) hero.health = 0;
    }
    public String toString() {
        return "Paladin{health="+health+"}";
    }
}
