import java.util.*;



public class Main {
    public static void main(String[] args) {
   
      int n = 5;

      recNum(n);

    }

    static void recNum(int n) {

        if(n < 0) return;

        System.out.println(n);
        recNum(n-1);


    }
}










