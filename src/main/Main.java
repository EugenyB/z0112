package main;

import animals.Animal;
import animals.Cat;
import animals.Dog;
import music.Drum;
import music.Instrument;
import music.Piano;

public class Main {
    public static void main1(String[] args) {
//        System.out.println("Hello");
        Animal[] animals = {
                new Cat("Murka"),
                new Dog("Tuzik"),
                new Dog("")
        };
        for (int i = 0; i < animals.length; i++) {
            animals[i].voice();
        }
    }

    public static void main(String[] args) {
        Instrument piano = new Piano();
        piano.play("abcde");

        Instrument drum = new Drum();
        drum.play("abcde");
        drum.play("defg");

        Instrument[] ans = new Instrument[4];
        ans[0] = new Drum();
        ans[1] = new Piano();
        ans[2] = new Piano();
        ans[3] = new Drum();
        for (Instrument instrument : ans) {
            instrument.play("abcdefg");
        }

        int drums = 0;
        for (int i = 0; i < ans.length; i++) {
            if (ans[i] instanceof Drum) drums++;
        }

        int ins = 0;
        for (int i = 0; i < ans.length; i++) {
            if (ans[i] instanceof Instrument) ins++;
        }
        System.out.println(drums);
        System.out.println(ins);
    }
}
