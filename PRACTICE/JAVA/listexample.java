import java.util.*;

class listexample {

  //change access remove add size
  public static void main(String[] args) {
    List<Integer> ar = new ArrayList<Integer>();
    ar.add(30);
    ar.add(40);
    System.out.println(ar);
    // System.out.println(ar.get(ar.size()-1));
    ar.add(1, 50);
    System.out.println(ar);
    ar.remove(0);
    System.out.println(ar);
    ar.set(0, 60);
    System.out.println(ar);
    Collections.sort(ar, Comparator.reverseOrder());

    // ar.sort(Comparator.naturalOrder()); reverseOrder
    System.out.println(ar.contains(60));
    System.err.println(ar.indexOf(60));
  }
}
