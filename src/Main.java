class Main {
  public static void main(String[] args) {
    
    // An Easy Sudoku
    int[][] easy =    {{5, 0, 0, 4, 6, 7, 3, 0, 9},
                       {9, 0, 3, 8, 1, 0, 4, 2, 7},
                       {1, 7, 4, 2, 0, 3, 0, 0, 0},
                       {2, 3, 1, 9, 7, 6, 8, 5, 4},
                       {8, 5, 0, 1, 2, 4, 0, 9, 0},
                       {4, 9, 6, 3, 0, 8, 1, 7, 2},
                       {0, 0, 0, 0, 8, 9, 2, 6, 0},
                       {0, 8, 2, 6, 4, 1, 0, 0, 5},
                       {0, 1, 0, 0, 0, 0, 7, 0, 8}
                      };
    
    // A Medium Sudoku
    int[][] medium =  {{8, 7, 1, 3, 4, 5, 9, 2, 6},
                       {0, 0, 0, 7, 2, 6, 0, 5, 1},
                       {2, 5, 6, 0, 0, 0, 4, 7, 3},
                       {0, 0, 2, 4, 0, 0, 6, 0, 5},
                       {0, 0, 0, 1, 6, 2, 7, 0, 0},
                       {7, 6, 4, 5, 0, 8, 2, 0, 0},
                       {0, 0, 0, 6, 0, 0, 3, 4, 2},
                       {4, 2, 0, 0, 0, 0, 5, 6, 0},
                       {6, 0, 3, 2, 5, 4, 1, 0, 7}};
 
    // A Hard Sudoku
    int[][] hard =  {{0, 4, 0, 8, 0, 0, 2, 0, 0},
                     {5, 3, 0, 0, 0, 0, 0, 0, 4},
                     {8, 0, 0, 5, 0, 9, 0, 1, 0},
                     {2, 0, 8, 0, 0, 0, 0, 4, 5},
                     {4, 9, 0, 0, 0, 0, 8, 3, 0},
                     {0, 0, 0, 0, 0, 0, 1, 0, 6},
                     {3, 0, 0, 0, 2, 0, 5, 0, 0},
                     {1, 0, 0, 0, 6, 0, 0, 2, 0},
                     {0, 6, 0, 0, 0, 5, 3, 0, 0}};
    
    // A Solved Sudoku
    int[][] solved =  {{9, 6, 3, 1, 7, 4, 2, 5, 8},
                       {1, 7, 8, 3, 2, 5, 6, 4, 9},
                       {2, 5, 4, 6, 8, 9, 7, 3, 1},
                       {8, 2, 1, 4, 3, 7, 5, 9, 6},
                       {4, 9, 6, 8, 5, 2, 3, 1, 7},
                       {7, 3, 5, 9, 6, 1, 8, 2, 4},
                       {5, 8, 9, 7, 1, 3, 4, 6, 2},
                       {3, 1, 7, 2, 4, 6, 9, 8, 5},
                       {6, 4, 2, 5, 9, 8, 1, 7, 3}};
    
    Sudoku mySudoku = new Sudoku(medium);
    System.out.println(mySudoku);
    mySudoku.solve();
    System.out.print(mySudoku);
  }
}