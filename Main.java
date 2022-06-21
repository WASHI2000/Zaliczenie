public class Main {
  public static void main(String[] args) {
    int[] calkowite = new int[3];
calkowite[0] = 10;
calkowite[1] = 15;
calkowite[2] = 200;
    if (calkowite [0] > calkowite [1])
      {
      System.out.println("Najmniejsza liczba to" + " " + calkowite [1]);
      }
       if (calkowite [1] > calkowite [2])
      {
      System.out.println("Najmniejsza liczba to" + " " + calkowite [1]);
      }  
    else
      System.out.println("Najmniejsza liczba to" + " " + calkowite [0]); 
  }
  }
