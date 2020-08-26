package kate;

import java.util.Arrays;
import java.util.Collections;

public class ArrayString {
  public static void main(String[] args) {
      String[] a;

      {
          a = new String[]{"Каждый ", " охотник ", " желает ", " знать ", " где ", " сидит ", " фазан "};
      }
      Arrays.sort(a, Collections.reverseOrder());
      for (int i = a.length - 1; i >= 0; i--) {
          System.out.println(a[i]);
      }
  }
}
