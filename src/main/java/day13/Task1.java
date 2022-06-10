package day13;

import java.util.Date;


public class Task1 {
    public static void main(String[] args) {
        User u1 = new User("Victor");
        User u2 = new User("Father");
        User u3 = new User("Mother");

        u1.sendMessage(u2, "Привет, как дела?");
        u1.sendMessage(u2, "Что делаешь?");
        u2.sendMessage(u1, "Привет, всё нормально.");
        u2.sendMessage(u1, "Ты как?");
        u2.sendMessage(u1, "Котлетки покушал?");
        u3.sendMessage(u1, "Взял денег у бати?");
        u3.sendMessage(u1, "Какой вообще сегодня день?");
        u3.sendMessage(u1, "В чём смысл бытия?");
        u1.sendMessage(u3, "Ну мааааам...");
        u1.sendMessage(u3, "Ну хватит уже!");
        u1.sendMessage(u3, "Я уже большой мальчик");
        u3.sendMessage(u1, "Ну хз...");

        MessageDatabase.showDialog(u1, u3);

    }

}