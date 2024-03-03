package animals;

import java.util.Scanner;

public class Kotic {

    private String name;
    private String voice;
    private int satiety;
    private int weight;
    private static int count;
   private final int METHODS = 5;




    public Kotic() {
        count++;
    }

    public Kotic(String name, String voice, int satiety, int weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
        count++;
    }


    protected boolean play() {
        if (satiety>0) {
            System.out.println(" играл");
            satiety--;
            System.out.println("(сытость "+ satiety+ ")");
            return true;
        } else {
            return eat();
        }
    }

    protected boolean sleep() {
        if (satiety>0) {
            System.out.println(" спал");
            satiety--;
            System.out.println("(сытость "+ satiety+ ")");
            return true;
        } else {
            return eat();
        }
    }
    protected boolean wash() {
        if (satiety>0) {
            System.out.println(" умывался");
            satiety--;
            System.out.println("(сытость "+ satiety+ ")");
            return true;
        } else {
            return eat();
        }
    }
    protected boolean walk() {
        if (satiety>0) {
            System.out.println(" гулял");
            satiety--;
            System.out.println("(сытость "+ satiety+ ")");
            return true;
        } else {
            return eat();
        }
    }
    public boolean hunt() {
        if (satiety>0) {
            System.out.println(" охотился");
            satiety--;
            System.out.println("(сытость "+ satiety+ ")");
            return true;
        } else {
            return eat();
        }
    }


//Сделать три перегрузки метода eat(), одна из них будет принимать только количество условных единиц сытости и увеличивать на них соответствующую переменную экземпляра,
//    другая единицы сытости и название еды, третья не принимает параметров, но содержит внутри себя вызов перегрузки, принимающей единицы сытости и название еды.
    public boolean eat() {
        System.out.print("Котик хочет есть.\n Введите количество еды - ");
        Scanner scanner = new Scanner(System.in);
        int satiety = scanner.nextInt();
        System.out.print(" Введите название еды - ");
        Scanner scanner2 = new Scanner(System.in);
        String foodName = scanner2.nextLine();
        return eat(satiety,foodName);

    }
    public boolean eat(int food) {
        System.out.println("Введите количество еды - ");
        Scanner scanner = new Scanner(System.in);
        food = scanner.nextInt();
        this.satiety=satiety+food;
        System.out.println("котик ел");

        return true;
    }
    public boolean eat(int food, String foodName) {
        this.satiety=satiety+food;
        System.out.println("котик поел ");
        return true;
    }

//    Сделать три перегрузки метода eat(), одна из них будет принимать только количество условных единиц сытости и
//    увеличивать на них соответствующую переменную экземпляра, другая единицы сытости и название еды, третья не принимает
//    параметров, но содержит внутри себя вызов перегрузки, принимающей единицы сытости и название еды.

public void liveAnotherDay() {
    for (int i =1; i < 25; i++) {
        final int hour = (int) (Math.random() * METHODS) + 1;
        switch (hour) {
            case (1):
                System.out.print(i + "-");
                play();
        }
        switch (hour) {
            case (2):
                System.out.print(i + "-");
                sleep();
        }
        switch (hour) {
            case (3):
                System.out.print(i + "-");
                wash();
        }
        switch (hour) {
            case (4):
                System.out.print(i + "-");
                walk();
        }
        switch (hour) {
            case (5):
                System.out.print(i + "-");
                hunt();
        }
    }
}

    public static boolean compareVoice(Kotic kotic1, Kotic kotic2) {
        if (!kotic1.getVoice().equals(kotic2.getVoice())) {

            return false;
        }
        return true;
    }


    public String getName() {
        return name;
    }

    public String getVoice() {
        return voice;
    }

    public int getSatiety() {
        return satiety;
    }

    public int getWeight() {
        return weight;
    }

    public static int getCount() {
        return count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
