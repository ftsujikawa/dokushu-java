package chap06;

import java.util.ArrayList;

public class IteratorRemove {
  public static void main(String... args) {
    var data = new ArrayList<String>() {
      /**
       *
       */
      private static final long serialVersionUID = 1L;

      {
        add("バラ");
        add("ひまわり");
        add("あさがお");
      }
    };

    var ite = data.iterator();
    while (ite.hasNext()) {
      System.out.println(ite.next());
      ite.remove();
    }
    System.out.println(data);
  }
}
