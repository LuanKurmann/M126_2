package Kompetenz_1_4;

import java.util.ArrayList;
import java.util.List;

public class Bibliothek {
    private List<Medium> katalog = new ArrayList<>();

    public void showMedium() {
        for (Medium m : katalog) {
            m.showSample();
        }
    }

    public void addMedium(Medium m) {
        katalog.add(m);
    }
}

abstract class Medium {
    abstract void showSample();
}

class Buch extends Medium {
    String sample;

    public Buch(String sample) {
        this.sample = sample;
    }

    @Override
    void showSample() {
        System.out.println(sample);
    }
}

class CD extends Medium {
    Sound sample;
    Player p = new Player();

    @Override
    void showSample() {
        p.playSound(sample);
    }
}

class MC extends Medium {
    Sound sample;
    Player p = new Player();

    @Override
    void showSample() {
        p.playSound(sample);
    }
}

class DVD extends Medium {
    Video sample;
    Player p = new Player();

    @Override
    void showSample() {
        p.playVideo(sample);
    }
}

class Sound {
    // ...
}

class Video {
    // ...
}

class Player {
    public void playVideo(Video v) {
        // Video anzeigen ...
    }

    public void playSound(Sound s) {
        // Sound spielen ...
    }
}

class main {
    public static void main(String[] args) {
        Bibliothek bibliothek = new Bibliothek();
        bibliothek.addMedium(new Buch("Testbuch"));
        bibliothek.addMedium(new DVD());

        bibliothek.showMedium();
    }
}