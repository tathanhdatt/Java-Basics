public class BinarySearch {
  public static void main(String[] args) {
    int[] array = {11, 14, 16, 18, 20, 25, 28, 30, 34, 40, 45};
    System.out.println(binarySearch(array, 13));
  }

  public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
    if (fromIdx == toIdx - 1) {
      return key == array[fromIdx];
    } else {
      int middleIdx = (fromIdx + toIdx) / 2;
      if (key == array[middleIdx]) {
        return true;
      } else if (key < array[middleIdx]) {
        toIdx = middleIdx;
      } else {
        fromIdx = middleIdx - 1;
      }
      return binarySearch(array, key, fromIdx, toIdx);
    }
  }

  public static boolean binarySearch(int[] array, int key) {
    return binarySearch(array, key, 0, array.length - 1);
  }
}
