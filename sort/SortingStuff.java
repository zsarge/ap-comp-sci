import java.util.Scanner;

class SortingStuff {
    
  public static void main(String[] args) {
  
    int[] nums = new int[20];
    for(int i = 0; i < 20; i++) {
      nums[i] = randInt(0, 9);
    }
    printArray(nums);
    
    Timer t = new Timer();

    System.out.println();
    printArray( bubbleSort(nums) );

    System.out.println();
    printArray( selectionSort(nums) );
    
    System.out.println();
    printArray( insertionSort(nums) );
    
    System.out.println();
    printArray( mergeSort(nums) );
  }
  
  public static void printArray(int[] arr) {
    System.out.print("{");
    int len = arr.length;
    for(int i = 0; i < len; i++) {
      System.out.print(arr[i]);
      if(i < len - 1) {
        System.out.print(", ");
      }
    }
    System.out.println("}");
  }
  
  public static int randInt(int min, int max) {
    return (int)Math.floor( Math.random() * (max - min + 1) ) + min;
  }

  public static int[] copy(int[] arr) {
    int len = arr.length;
    int[] output = new int[len];
    for(int i = 0; i < len; i++) {
      output[i] = arr[i];
    }
    return output;
  }
  
  public static int[] bubbleSort(int[] arr) {
    int[] output = copy(arr);
    int len = output.length;
    boolean sorted = false;
    while(!sorted) {
      sorted = true;
      if(len > 1) {
        int temp = 0;
        for(int i = 0; i < len - 1; i++) {
          if(output[i] > output[i + 1]) {
            temp = output[i + 1];
            output[i + 1] = output[i];
            output[i] = temp;
            sorted = false;
          }
        }
        //printArray(output);
      }
    }
    return output;
  }
    
  public static int minIndex(int[] arr) {
    int output = 0;
    int len = arr.length;
    for(int i = 1; i < len; i++) {
      if(arr[i] < arr[output]) {
        output = i;
      }
    }
    return output;
  }
  
  public static int[] subArray(int[] arr, int index) {
    int len = arr.length;
    int[] output;
    if(0 <= index && index <= len) {
      output = new int[len - index];
      for(int i = index; i < len; i++) {
        output[i - index] = arr[i];
      }
    }
    else {
      output = new int[0];
    }
    return output;
  }
  
  public static int[] selectionSort(int[] arr) {
    int[] output = copy(arr);
    int len = output.length;
    int temp = 0;
    int mindex = 0;
    if(len > 1) {
      for(int i = 0; i < len - 1; i++) {
        mindex = minIndex( subArray(output, i) );
        temp = output[i];
        output[i] = output[mindex + i];
        output[mindex + i] = temp;
        //printArray(output);
      }
    }
    return output;
  }
  
  //PRE-CONDITION: 0 <= to <= from  < arr.length
  public static int[] insertForward(int[] arr, int to, int from) {
    int len = arr.length;
    int[] output = new int[len];
    for(int i = 0; i < to; i++) {          //part A
      output[i] = arr[i];
    }
    output[to] = arr[from];                //part B
    for(int i = to + 1; i <= from; i++) {  //part C
      output[i] = arr[i  - 1]; 
    }
    for(int i = from + 1; i < len; i++) {  //part D
      output[i] = arr[i]; 
    }
    return output;
  }
  
  public static int[] insertionSort(int[] arr) {
    int[] output = copy(arr);
    int len = output.length;
    int j = 0;
    int temp = 0;
    for(int i = 0; i < len - 1; i++) {
      j = i;
      while(j >= 0 && output[j] > output[j + 1]) {
        temp = output[j];
        output[j] = output[j + 1];
        output[j + 1] = temp;
        j--;
      }
      //printArray(output);
    }
    return output;
  }
    
  public static int[] getFront(int[] arr) {
    int len = arr.length;
    int[] output = new int[len / 2];
    for(int i = 0; i < len / 2; i++) {
        output[i] = arr[i];
    }
    return output;
  }

  public static int[] getBack(int[] arr) {
    int len = arr.length;
    int[] output = new int[len - len / 2];
    for(int i = len / 2; i < len; i++) {
        output[i - len / 2] = arr[i];
    }
    return output;
  }

  //PRE-CONDITION: a, b are both sorted
  public static int[] merge(int[] a, int[] b) {
    int lena = a.length;
    int lenb = b.length;
    int[] output = new int[lena + lenb];
    int i = 0, j = 0;
    while(i < lena && j < lenb) {
      if(a[i] < b[j]) {
        output[i + j] = a[i];
        i++;
      }
      else {
        output[i + j] = b[j];
        j++;
      }
    }
    while(i < lena) {
      output[i + j] = a[i];
      i++;
    }
    while(j < lenb) {
      output[i + j] = b[j];
      j++;
    }
    return output;
  }
  
  public static int[] mergeSort(int[] arr) {
    if(arr.length < 2) {
      return copy(arr); 
    }
    else {
      return merge( mergeSort( getFront(arr) ), mergeSort( getBack(arr) ) );
    }
  }
}