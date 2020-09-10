package ru.geekbrains.oop.core;

public class Partners {
    public static void Partners(){

        protected String name;
        protected int maxRun;
        protected double maxJump;
        public Random random = new Random();

    public Partners(String name){
            this.name = name;

    }
        public void run(int dist) {
            if (this.maxRun >= dist) System.out.println( this.name + " run " + dist + " m.");
            else System.out.println( this.name + " can't run so far.");
        }
        public void jump(double height) {
            if (this.maxJump >= height)
                System.out.println( this.name + " jump " + height + " m.");
            else System.out.println( this.name + " can't jump so hi.");
        }
        public void info() {
            System.out.println(this.name + " Run: " + this.maxRun + " m., Jump: " + this.maxJump + " m.");
        }
}

Partners[] partners = { Partner_1, Partner_2};


}
