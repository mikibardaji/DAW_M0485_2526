import java.util.Scanner;

public class Ex5 {
    /*
     * 5.	Programa 
     * que llegeix dos números i 
     * els visualitza en ordre ascendent.
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int v1, v2;
      
      System.out.print("Pon valor 1 ");
      v1 = sc.nextInt();
      System.out.print("Pon valor 2 ");
      v2 = sc.nextInt();

      if (v1>v2) //el mas grande es v1
      {
        System.out.println(v2 + "- " + v1);
      }
      else if (v1 < v2) //rl mas grande es v2 
      {
        System.out.println(v1 + " - " + v2);
      }
      else //son iguales
      {
        System.out.println(v1);
      }




    }
}
