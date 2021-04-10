public class Main {
    public static void main(String[] args) {
        int size = CustomScanner.scanInt();
        double[][] array = new double[size][size];
        Filler.fill(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%f\t", array[i][j]);
            }
            System.out.println();
        }
        System.out.println(Calculator.findCountOfPositives(array));
    }
}
