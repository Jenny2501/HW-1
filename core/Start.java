package ru.geekbrains.oop.core;

import ru.geekbrains.oop.core.Cat;
import ru.geekbrains.oop.core.Human;
import ru.geekbrains.oop.core.Robot;

public class Start {
        Cat tom = new Cat();
        tom.name="Том";

        Robot rob = new Robot();
        rob.name ="Rob";

        Human vasya = new Human();
        vasya.name ="Vasya";


        public static void main(String[] args) {
                Partner_1 petya = new Partner_1();
                petya.setName("Петя");

                Partner_2 vova = new Partner_2();
                vova.setName("Вова");
        }

         System.out.println();

        partner_1.run(40);
        partner_1.jump(3);

        System.out.println();

        partner_2.run(70);
        partner_2.jump(4);
}
