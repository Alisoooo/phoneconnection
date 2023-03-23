public class Main {
    public static void main(String[] args) {
        int startScore = 100;
        int replenishment = 300;
        int bonus;

        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Счет клиента:" + (replenishment + startScore + bonus));
    }
}