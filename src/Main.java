public class Main {
    public static void main(String[] args) {
        int[] sales = {1,12,3,2,232,12,13,777};
        Manager sm = new Manager(sales);
        System.out.println(sm.max());
    }
}

