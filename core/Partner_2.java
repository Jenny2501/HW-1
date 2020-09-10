package ru.geekbrains.oop.core;


public Partner_2(String name) {
        super(name);
        this.maxJump = 4;
        this.maxRun = 70;
    }
    public void run(){
        System.out.println("Пробежал");
    }
    public void jump(){
        System.out.println("Прыгает");
    }


public class Partner_2 extends Partners implements Barriers.Barriers {

    public Partner_2(String name){
        super(name);
    }

    public void run(){
        System.out.println("бегает");
    }

    public void sayYouPartners() {
        System.out.println("Участник_2 пробежал");
    }
    public void jump(){
        System.out.println("прыгает");
    }

    public void sayYouPartners() {
        System.out.println("Участник_2 прыгнул");
    }
}

