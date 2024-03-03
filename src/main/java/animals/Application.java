package animals;

public class Application {
    public static void main(String[] args) {
        Kotic kotic = new Kotic("Барсик", "мяу", 3, 3);

        Kotic kotic2 = new Kotic();
        kotic2.setName("Васька");
        kotic2.setVoice("мя");
        kotic2.setSatiety(5);
        kotic2.setWeight(2);

        kotic.liveAnotherDay();

        System.out.println("Вес котика "+ kotic2.getName() + " равен " + kotic2.getWeight());

        System.out.println("Число созданных объектов: " + Kotic.getCount());

        System.out.println("Котики мяукуют одинаково? " + Kotic.compareVoice(kotic, kotic2));
    }
}
