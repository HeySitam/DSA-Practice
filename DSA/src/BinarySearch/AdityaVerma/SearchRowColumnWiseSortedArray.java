package BinarySearch.AdityaVerma;

public class SearchRowColumnWiseSortedArray {
    public static void main(String[] args) {
        int[][] arr = {{10, 15, 27, 32}, {20, 25, 29, 33}, {30, 35, 37, 39}, {40, 45, 48, 50}};
        int row = 4;
        int col = 4;
        ArrayPos pos = getPos(arr, row, col, 23);
        if (pos != null)
            System.out.println("pos is (" + pos.row + ", " + pos.col + ")");
        else
            System.out.println("Not Found!!");
    }

    // T.C -> O(row + col)
    public static ArrayPos getPos(int[][] arr, int row, int col, int key) {
        ArrayPos mid = new ArrayPos();
        int i = 0;
        int j = col - 1;
        while (i >= 0 && i < row && j >= 0 && j < col) {
            mid.setPos(i, j);
            if (arr[i][j] == key)
                return mid;
            else if (arr[i][j] > key)
                j--;
            else if (arr[i][j] < key)
                i++;
        }

        return null;
    }

}

class ArrayPos {
    int row;
    int col;

    ArrayPos setPos(int row, int col) {
        this.row = row;
        this.col = col;
        return this;
    }
}
