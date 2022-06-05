package day11.task2;

public class Paladin extends Hero implements Healer {

    public final double HEAL_TEAMMATE = 10;
    public final double HEAL_HIMSELF = 25;

    public Paladin() {
        health = 100;
        physAtt = 15;
        physDef = 0.5;
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

    public String toString() {
        return "Paladin{health="+health+"}";
    }
}
