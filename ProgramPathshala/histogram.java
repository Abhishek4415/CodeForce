package ProgramPathshala;

public class histogram {
    public static void main(String[] a){
        int height[] = {0,1,0,2,1,3,0,2};
        int n = height.length;
        

        int[] prefixMax = new int[n];
        int[] suffixMax = new int[n];

        // Prefix max
        prefixMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], height[i]);
        }

        // Suffix max
        suffixMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixMax[i] = Math.max(suffixMax[i + 1], height[i]);
        }

        // Calculate trapped water
        int water = 0;
        for (int i = 0; i < n; i++) {
            water += Math.min(prefixMax[i], suffixMax[i]) - height[i];
        }

        System.out.println(water);

    }
    
}
