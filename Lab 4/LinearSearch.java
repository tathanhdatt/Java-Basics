public class LinearSearch {
  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5, 6};
    int key = 2;
    System.out.println(linearSearch(array, key));
    System.out.println(linearSearchIndex(array, key));
  }

  public static boolean linearSearch(int[] array, int key) {
    for (int element : array) {
      if (key == element) {
        return true;
      }
    }
    return false;
  }

  public static int linearSearchIndex(int[] array, int key) {
    for (int idx = 0; idx < array.length; idx++) {
      if (key == array[idx]) {
        return idx;
      }
    }
    return 0;
  }

}
