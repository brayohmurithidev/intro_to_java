public class MultidimensionalArrays {
    public static void main(String[] args) {
        int[][] sample = {{1, 2, 3}, {4, 5, 6}};

        //access - two index-first for the array, second for the element itself
        System.out.println(sample[1][0]);

//        EXAMPLE 2
        int[][] grid = {{1, 2,}, {3, 4}, {5, 6}};

        System.out.println(grid[2][1]);

//        The two indexes are called row index and column index.
        int[][] sample1 = {
                {1, 2, 3}, //row - it's also an item.
                {4, 5, 6}
        };

        for (int[] ints : sample1) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
        }

    }
}
