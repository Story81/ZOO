public class Kotic {

    private String name;
    private String voice;
    private int satiety;
    private int weight;
    private static int count;
   protected final int METHODS = 5;



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
        if (satiety > 0) {
            System.out.println("Сытость котика = " + satiety);
            satiety--;
            return true;
        }
        return false;

    }


}
