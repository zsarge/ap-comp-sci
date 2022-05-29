import java.util.Scanner;

class SortStuff {
  public static void main(String[] args) {
    int[] nums = linArray(1_000_000);
    Timer t = new Timer();

    t.start();
    System.out.println(linSearch(nums, 200_000));
    t.stop();
  }

  public static void delay(long milliSeconds) {
    long future = System.nanoTime() + milliSeconds * 1000000;
    while( future  > System.nanoTime() ) {
    }
  }
  
  public static void printArr(int[] arr) {
    int output = 0;
    int len = arr.length;
    System.out.print("{");
    for(int i = 0; i < len - 1; i++) {
      System.out.print(arr[i] + ", ");
    }
    if(len > 0) {
      System.out.print(arr[len - 1]);
    }
    System.out.println("}");
  }

  public static int[] copy(int[] arr) {
    //Copy the input array into "output"
    int len = arr.length;
    int[] output = new int[len];
    for(int i = 0; i < len; i++) {
      output[i] = arr[i];
    }
    return output;
  }
  
  public static int randInt(int a, int b) {
    return (int)Math.floor( Math.random() * ( b - a + 1) ) + a;
  }

  public static int[] linArray(int len) {
    int[] output = new int[len];
    for(int i = 0; i < len; i++) {
      output[i] = i;
    }
    return output;
  }
  
  public static int[] shuffle(int[] arr) {
    int[] output = copy(arr);
    int len  = output.length;
    int temp = 0;
    int rand = 0;
    for(int i = 0; i < len; i++) {
      rand = randInt(0, len - 1);
      temp = output[i];
      output[i] = output[rand];
      output[rand] = temp;
    }
    return output;
  }

  public static int[] bubbleSort(int arr[]) {
    int[] output = copy(arr);
    int len = output.length;
    int temp, i = 0;
    //System.out.println("Bubble sort");
    boolean sorted = false;
    while(!sorted) {
      //System.out.print(i + "th pass: ");
      //printArr(output);    //print array in "improved" state
      sorted = true;
      for(int j = 1; j < len - i; j++) {
        if(output[j - 1] > output[j]) {
          temp = output[j - 1];
          output[j - 1] = output[j];
          output[j] = temp;
          sorted = false;
        }
      }
      i++;
    }
    //System.out.print("Sorted: ");
    //printArr(output);    //print array in "improved" state
    return output;
  }

  public static int[] selectionSort(int arr[]) {
    int[] output = copy(arr);
    int len = output.length;
    int minIndex, temp;
    //System.out.println("Selection sort: ");
    for (int i = 0; i < len - 1; i++) {
      //System.out.print(i + "th iteration: ");
      //printArr(output);    //print array in initial state
      minIndex = i;
      for (int j = i + 1; j < len; j++) {  //find index of smallest remaining (after last) element
        if (output[j] < output[minIndex]) {
          minIndex = j;
        }
      }
      temp = output[minIndex];     //swap new smallest element with current element
      output[minIndex] = output[i];
      output[i] = temp;
    }
    //System.out.print("Sorted: ");
    //printArr(output);    //print array in "improved" state
    return output;
  }

  public static int[] insertionSort(int[] arr) {
    int[] output = copy(arr);
    int len = output.length;
    int temp, j;
    //System.out.println("Insertion sort: ");
    for(int i = 1; i < len; i++) {
      //System.out.print( (i - 1) + "th iteration: ");
      //printArr(output);    //print array in initial state
      j = i;
      while(j >= 1 && arr[j - 1] > arr[j]) {
        temp = output[j];
        output[j] = output[j - 1];
        output[j - 1] = temp;
        j--;
      }
    }
    //System.out.print("Sorted: ");
    //printArr(output);    //print array in "improved" state
    return output;
  }
  
  //PRE-CONDITION: a, b must be sorted
  public static int[] mergeSorted(int[] a, int[] b) {
    int lenA = a.length;
    int lenB = b.length;
    int[] output = new int[lenA + lenB];
    int i = 0;
    int j = 0;
    while(i + j < lenA + lenB) {
      if(i >= lenA) {
        output[i + j] = b[j];
        j++;
      }
      else if(j >= lenB) {
        output[i + j] = a[i];
        i++;
      } 
      else {
        if(a[i] <= b[j]) {
          output[i + j] = a[i];
          i++;
        }
        else {
          output[i + j] = b[j];
          j++;
        }
      }      
    }
    return output;
  }
  
  public static int[] mergeSort(int[] arr) {
    int len = arr.length;
    if(len < 2) {
      return copy(arr);
    }
    else {
      int mid = len / 2;
      int[] front = new int[mid];
      int[] back = new int[len - mid];
      for(int i = 0; i < len; i++) {
        if(i < mid) {
          front[i] = arr[i];
        }
        else {
          back[i - mid] = arr[i];
        }
      }
      return mergeSorted( mergeSort(front), mergeSort(back) );
    }
  }
  
  
  public static int linSearch(int[] arr, int target) {
    int len = arr.length;
    for(int i = 0; i < len; i++) {
      if(arr[i] == target) {
        delay(1);
        return i;
      }
    }
    return -1;
  }
  
  public static int binSearch(int[] arr, int target) {
    int count = 0;
    int low = 0;
    int high = arr.length - 1;
    int mid = (low + high) / 2;
    int delta = mid / 2;
    while(low <= high) {
      if(arr[mid] == target) {
        System.out.println("Count = " + count);
        return mid;
      }
      else {
        if(arr[mid] < target) {
          low = mid + 1;
        }
        else {
          high = mid - 1;
        }
        mid = (low + high) / 2;
        count++;
      }
    }
    System.out.println("Count = " + count);
    return -1;
  }

  public static int recurBinSearch(int[] arr, int target) {
    int count = 0;
    int low = 0;
    int high = arr.length - 1;
    int mid = (low + high) / 2;
    int delta = mid / 2;
    while(low <= high) {
      if(arr[mid] == target) {
        System.out.println("Count = " + count);
        return mid;
      }
      else {
        if(arr[mid] < target) {
          low = mid + 1;
        }
        else {
          high = mid - 1;
        }
        mid = (low + high) / 2;
        count++;
      }
    }
    System.out.println("Count = " + count);
    return -1;
  }
}
