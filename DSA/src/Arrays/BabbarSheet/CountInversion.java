package Arrays.BabbarSheet;

public class CountInversion {
}
class CountInversionSolution {

    /**
     * Brute Force
     * TC -> O(n^2)
     * SC -> O(1)
     */
    static int arr[] = new int[] { 1, 20, 6, 4, 5 };

    static int getInvCount(int n)
    {
        int inv_count = 0;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr[i] > arr[j])
                    inv_count++;

        return inv_count;
    }
}