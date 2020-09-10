package ru.geekbrains.oop.core;

        public Partner_1(String name) {
        super(name);
        this.maxJump = 3;
        this.maxRun = 40 ;



    }
    public void run(){
        System.out.println("Пробежал");
    }
    public void jump(){
        System.out.println("Прыгает");
    }

public class Partner_1 extends Partners implements Barriers.Barriers {

    public Partner_1(String name){
        super(name);
    }

    public void run(){
        System.out.println("бегает");
    }

    public void sayYouPartners() {
        System.out.println("Участник_1 пробежал");
    }

    public void jump(){
        System.out.println("прыгает");
    }

    public void sayYouPartners() {
        System.out.println("Участник_1 прыгнул");
    }
}


