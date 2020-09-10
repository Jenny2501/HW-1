package ru.geekbrains.oop.core;

public class Barriers {

    public interface Barriers {

        void sayYouBarriers();
    }
    for (Barriers partnersBarriers : barriers) {
        partnersBarriers.sayYouBarriers();
    }
    Barriers[] barriers = { run, jump};
}
