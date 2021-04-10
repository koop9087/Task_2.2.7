public class Calculator {
    public static int findCountOfPositives(double[][] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] > 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
