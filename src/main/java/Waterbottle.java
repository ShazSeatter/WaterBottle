public class Waterbottle {
    private int volume;

    public Waterbottle(int volume) {
        this.volume = volume;
    }


    public int getVolume() {
        return volume;
    }

    public int drinkWater() {
        return volume - 10;
    }

    public int empty() {
        volume = 0;
        return volume;
    }


    public int fill() {
        volume = 100;
        return volume;
    }
}
