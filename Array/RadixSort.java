public class RadixSort {
  public static int sort(int[] arr) {
      int max = arr[0];
      for (int i = 1; i < arr.length; i++) {
          if (arr[i] > max) {
              max = arr[i];
          }
      }

      int exp = 1;
      while (max / exp > 0) {
          countSort(arr, exp);
          exp *= 10;
      }
      return exp;
  }

  private static void countSort(int[] arr, int exp) {
      int[] output = new int[arr.length];
      int[] count = new int[10];

      for (int i = 0; i < arr.length; i++) {
          count[(arr[i] / exp) % 10]++;
      }

      for (int i = 1; i < 10; i++) {
          count[i] += count[i - 1];
      }

      for (int i = arr.length - 1; i >= 0; i--) {
          output[--count[(arr[i] / exp) % 10]] = arr[i];
      }

      for (int i = 0; i < arr.length; i++) {
          arr[i] = output[i];
      }
  }
  public static void main(String[] args) {
    int[] arr={23,34,45,45,6,46,4,454};
  int exp=  sort(arr);
    countSort(arr, exp);
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
  }

}