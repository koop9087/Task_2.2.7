public class Filler {
    public static void filler(double[][] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                array[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / array.length);
            }
        }
    }

    public static int positiveCount(double[][] array) {
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
