public class ArrayResizer {
  
  public static boolean isNonZeroRow(int[][] array2D, int r) {
    int cols = array2D[r].length;
    for(int j = 0; j < cols; j++) {
      if(array2D[r][j] == 0) {
        return false;
      }
    }
    return true;
  }
  
  public static int[][] resize(int[][] array2D) {
    int nonZeroRows = 0, rows = array2D.length, cols = array2D[0].length;
    for(int i = 0; i < rows; i++) {
      if( !isNonZeroRow(array2D, i) ) {
        nonZeroRows++;
      }
    }
    int[][] output = new int[nonZeroRows][cols];
    int k = 0;
    for(int i = 0; i < rows; i++) {
      if( isNonZeroRow(array2D, i) ) {
        for(int j = 0; j < cols; j++) {
          output[k][j] = array2D[i][j];
        }
        k++;
      }
    }
    return output;
  }
  
  public static void printArray(int[][] arr) {
    int rows = arr.length, cols;
    if(rows > 0) {
      cols = arr[0].length;
    }
    else {
      cols = 0;
    }
    System.out.print("{");
    for(int i = 0; i < rows; i++) {
      System.out.print("{");
      for(int j = 0; j < cols - 1; j++) {
        System.out.print(arr[i][j] + ", ");
      }
      System.out.print(arr[i][cols - 1] + "}");
      if(i < rows - 1) {
        System.out.print(", ");
      }
    }
    System.out.println("}");
  }
  
  public static void main(String[] args) {
    int[][] arr = {{2, 1, 0},
                   {1, 3, 2},
                   {0, 0, 0},
                   {4, 5, 6}};
    int[][] smaller  = ArrayResizer.resize(arr);
    printArray(smaller);
    
  }
}