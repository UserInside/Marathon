package day11.task2;

public abstract class Hero {
     protected int health;
     protected double physAtt;
     protected double physDef;
     protected double magicDef;

     public void physicalAttack(Hero hero) {
          double physDmg = (physAtt * (1 - hero.physDef));
          if (physDmg > hero.health) {
               hero.health = 0;
          } else {
               hero.health -= physDmg;
          }
     }
}
