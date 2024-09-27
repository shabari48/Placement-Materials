import java.util.*;

class mostrepeatdigitinprime {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int count = 0;
    int arr[] = new int[y - x + 1];

    for (int i = x; i <= y; i++) {
      if (isPrime(i)) {
        arr[count++] = i;
        System.out.println(i);
      }
    }

    String s = "";
    for (int i = 0; i < count; i++) s += Integer.toString(arr[i]);

    
    
    HashMap<Character, Integer> map = new HashMap<>();

    for(char ch:s.toCharArray()){
      if(map.containsKey(ch)){
        map.put(ch, map.get(ch)+1);
      }else{
        map.put(ch, 1);
      }
    }
    int maxcount=0;
    for(Map.Entry<Character, Integer> entry:map.entrySet()){
      System.out.println(entry.getKey()+" "+entry.getValue());
      if(entry.getValue()>maxcount){
        maxcount=entry.getValue();
      }
    }
    count=0;
    for(Map.Entry<Character, Integer> entry:map.entrySet()){
      if(entry.getValue()==maxcount){
         count++;
      }
    }

    char maxdigit='0';
    for(Map.Entry<Character, Integer> entry:map.entrySet()){
      if(entry.getValue()==maxcount && entry.getKey()>maxdigit){
        maxdigit=entry.getKey();
      }
    }


    if(count>1) System.out.println(maxdigit);
    else{
      for(Map.Entry<Character, Integer> entry:map.entrySet()){
        if(entry.getValue()==maxcount){
          System.out.println(entry.getKey());
        }
      }
    }


  }

  public static boolean isPrime(int n) {
    if (n == 1) return false;
    for (int i = 2; i <=n/2; i++) {
      if (n % i == 0) return false;
    }
    return true;
  }
}

//convert to python