package leetcode27.main;

public class FlowerbedPlanner {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int len = flowerbed.length;

        for (int i = 0; i < len; i++) {
            if (flowerbed[i] == 0 &&
                (i == 0 || flowerbed[i - 1] == 0) &&
                (i == len - 1 || flowerbed[i + 1] == 0)) {
                
                flowerbed[i] = 1; // Place a flower
                count++;

                if (count >= n) {
                    return true;
                }

                i++; // Skip the next plot
            }
        }

        return count >= n;
    }

    public static void main(String[] args) {
        FlowerbedPlanner planner = new FlowerbedPlanner();
        System.out.println(planner.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1)); // true
        System.out.println(planner.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2)); // false
    }
}
