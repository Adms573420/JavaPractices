import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        // Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:
        // 1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 gibi.
        //         Ancak bu kuralın iki istisnası vardır:
        // 1. 100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:
        // Örneğin 1200, 1600, 2000 yılları artık yıldır ancak 1700, 1800 ve 1900 artık yıl değildir.
        //         Sadece 400'e tam olarak bölünebilenlerin artık yıl kabul edilmesinin nedeni,
        //         bir astronomik yılın 365,25 gün değil, yaklaşık olarak 365,242 gün olmasından kaynaklanan hatayı gidermektir.
        // 2. Hesabı daha da hassas hâle getirmek için -400'e kalansız bölünebildiği halde
        // -4000'e kalansız olarak bölünebilen yıllar artık yıl kabul edilmez
        // Örneğin 4000, 8000, 12000, 16000, 24000, 32000 ve 48000 yılları 400'e tam bölünebildiği halde artık yıl kabul edilmeyecektir.
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir yıl giriniz.");
        int yıl = scan.nextInt();
        System.out.println(leapYear());


    }

    public static boolean leapYear() {
        return false;
    }

    public static boolean leapYear(int yil) {
        boolean leapYear = false;
        if (yil % 4 == 0 && yil % 100 != 0) {
            System.out.println("Artik yil");
        } else if (yil % 100 == 0 && yil % 400 == 0) {
            System.out.println("Artik yil");
        } else {
            System.out.println("Artik yil degil");
        }
        return leapYear;
    }


}



