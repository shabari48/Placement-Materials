import java.util.*;

public class countchandarg {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    //	String str=sc.nextLine();
    String str = "SkillRack"; //"AAAbbbbccccccdddEEE";
    char arr[] = str.toCharArray();

    HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();

    for (char c : arr) {
      if (hmap.containsKey(c)) 
      hmap.put(c, hmap.get(c) + 1); 
      else hmap.put(c,1  );
    }


    int max = 0;
    char key = ' ';
    while (!hmap.isEmpty()) {
      for (Map.Entry entry : hmap.entrySet()) {
        if ((int) entry.getValue() > max) {
          key = (char) entry.getKey();
          max = (int) entry.getValue();
        } else if ((int) entry.getValue() == max) {
          if ((char) entry.getKey() < key) {
            key = (char) entry.getKey();
            max = (int) entry.getValue();
          }
        }
      }
      System.out.print(key);
      hmap.remove(key);
      max = 0;
    }
  }
}
