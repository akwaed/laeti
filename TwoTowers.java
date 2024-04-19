import java.util.Arrays;

public class TwoTowers {
    
    public static double[] buildTowers(int[] squares) {
        // Sort squares in descending order of area
        Arrays.sort(squares);
        reverseArray(squares);
        
        // Initialize two empty towers
        double tower1Height = 0;
        double tower2Height = 0;
        
        // Iterate over the squares
        for (int square : squares) {
            // Place the current square in the tower with the currently smaller total height
            if (tower1Height <= tower2Height) {
                tower1Height += Math.sqrt(square);
            } else {
                tower2Height += Math.sqrt(square);
            }
        }
        
        return new double[]{tower1Height, tower2Height};
    }
    
    // Helper method to reverse an array
    private static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] squares = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] towerHeights = buildTowers(squares);
        System.out.println("Tower 1 Height: " + towerHeights[0]);
        System.out.println("Tower 2 Height: " + towerHeights[1]);
        System.out.println("Diffrence " + Math.abs(towerHeights[0] - towerHeights[1]));
    }
}
