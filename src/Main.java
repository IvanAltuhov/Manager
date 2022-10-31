public class Main {
    public static void main(String[] args) {
        int[] sales = {1,12,3,2,232,12,13,777};
        Manager sm = new Manager(sales);
        System.out.println(sm.max());
        int max = sales[0], min = sales[0];
        for(int i = 0; i < sales.length; i++) {
            if(sales[i] > max)
                max = sales[i];

            if(sales[i] < min)
                min = sales[i];
        }
        int result = 0;
        for (int m : sales) {
            result += m;
        }
        System.out.println("Значение среднего арифметического равно: " + (result - max - min)/sales.length);

    }
}

