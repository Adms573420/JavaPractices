import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir rakam giriniz.");
        int sayı = scan.nextInt();
      if(sayı>=0 && sayı<10){
          switch (sayı) {
              case 0:
                  System.out.println("sıfır");

              case 1:
                  System.out.println("Bir");
                  break;

              case 2:
                  System.out.println("iki");
                  break;
              case 3:
                  System.out.println("uc");
                  break;
              case 4:
                  System.out.println("Dort");
                  break;
              case 5:
                  System.out.println("Bes");
                  break;
              case 6:
                  System.out.println("Altı");
                  break;
              case 7:
                  System.out.println("Yedi");
                  break;
              case 8:
                  System.out.println("Sekiz");
                  break;
              case 9:
                  System.out.println("Dokuz");
                  break;

          }
      }else{
          System.out.println("Girilen sayı bir rakam degildir.");
      }



    }
}

