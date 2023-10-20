package oop_exe_2;

public class UsePlaying {

    static Playing[] players = {
            new Kid(),
            new Actor(),
            new Musician(),
    };

    public static void main(String[] args) {
        for (Playing each: players) {
            each.play();
        }
    }

}

interface Playing {
    public void play();
}

class Kid implements Playing {

    @Override
    public void play() {
        System.out.println("Play with toys or running and playing in the playground.");
    }
}

class Actor implements Playing {

    @Override
    public void play() {
        System.out.println("Play actions for movie in shooting with crew's members.");
    }
}

class Musician implements Playing {

    @Override
    public void play() {
        System.out.println("Play musical instruments with hands and kicks to make sweet sounds.");
    }
}
