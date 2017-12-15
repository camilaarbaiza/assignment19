/*
   Author: Camila Arbaiza

   Professor: Tanes Kanchanawanchai

   Problem 19.5

   (Maximum element in an array) Implement the following method that returns the
   maximum element in an array.
   public static <E extends Comparable<E>> E max(E[] list)

 */


public class Assignment19 {

    // Returns the maximum element in an array
    public static <E extends Comparable<E>> E max(E[] list) {

        E max = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i].compareTo(max) > 0)
                max = list[i];
        }
        return max;
    }

}
