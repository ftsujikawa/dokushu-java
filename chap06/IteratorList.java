package chap06;

import java.util.ArrayList;

public class IteratorList {
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

    var ite = data.listIterator(data.size());
    while (ite.hasPrevious()) {
      System.out.println(ite.previous());
    }
  }
}
