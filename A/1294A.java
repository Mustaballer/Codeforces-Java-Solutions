import java.util.*;
 
public class Main {  
  public static void main(String args[]) { 
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    s.nextLine();
    String[] ans = new String[t];
 
    for (int i = 0; i < t; i++) {
      int a = s.nextInt();
      int b = s.nextInt();
      int c = s.nextInt();
      int n = s.nextInt();
 
      int max = Math.max(a, Math.max(b, c));
      int m = a + b + c + n;
 
      if (m%3 == 0 && m/3 >= max) {
        ans[i] = "YES";
      } else {
        ans[i] = "NO";
      }
      
    }
 
 
    for (int i = 0; i < t; i++) {
      System.out.println(ans[i]);
    }
    
  } 
}
