import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int a;
    double w;
    
    System.out.println("Podaj liczbę");
    Scanner licz = new Scanner(System.in);
    a = licz.nextInt();
    w = a % 2;
    if(w>0)
    {
      w=a%3;
      if(w>0)
      {
      System.out.println("Jest liczbą pierwszą");
      }
      else
      {
        System.out.println("Nie jest liczbą pierwszą");
      }
    }
    else
    {
      System.out.println("Jest liczbą pierwszą");
    }
    
  }
}