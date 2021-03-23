import java.util.HashMap;
import java.util.Scanner;

public class Kutuphane {
  //deger: kitap adı, yazarı,yayınlanma tarihi;
    static int id;
    static String ad;
    static String yazar;
    static String yayınTarihi;

    static HashMap<Integer,String> kitaplar=new HashMap<>();
    public static void main(String args[]){
        kitaplar.put(id,"Beyaz Gemi-Cengiz-2000");
        id++;
        kitaplar.put(id,"1984-GeorgeOrwel-1945");
        id++;
        menu();

    }
    public static void menu(){
        Scanner scan=new Scanner(System.in);
        System.out.println("1-Kitap eklemek\n2-Listeleme\n3-Kitap Silme\4-Bilgiye göre Kitap Arama\n5-Id ile Kitap Arama");
        byte secenek= scan.nextByte();

        switch (secenek){
            case 1:ekle();break;
            case 2:Listele();break;
            case 3:bulBy_Id();break;
            case 4:sil();break;
        }
    }
    public static void bulBy_Id(){
        int istenenid=0;
        String bulunanKitap="";
        Scanner scan=new Scanner(System.in);
        System.out.println("Bulunması istenen id gir: ");
        istenenid=scan.nextByte();

        if(kitaplar.isEmpty()){
            System.out.println("Hic kitap yok.");
        }else if(kitaplar.containsKey(istenenid)){
            bulunanKitap=kitaplar.get(istenenid);
            System.out.println("Aradıgınız Kitap: "+bulunanKitap);
        }else{
            System.out.println("Aradıgınız id bilgisine sahip kitap bulunmamaktadır.");
        }
        menu();
    }

    //Ekleme fonksiyonu yapıyor String degerler alacagız ve hashMape ekleyecegiz.
    public static void ekle() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Kitabın ismi: ");
         ad= scan.nextLine();

        System.out.println("Kitabın Yazarı: ");
         yazar= scan.nextLine();

        System.out.println("Kitabın Yayınlanma Tarihi: ");
        yayınTarihi=scan.nextLine();

        String kitabİnfo=ad+" -"+yazar+"-"+yayınTarihi;
        kitaplar.put(id,kitabİnfo);

        menu();
    }
    public static void sil(){
        int istenenid=0;
        String silinenKitap="";
        Scanner scan=new Scanner(System.in);
        System.out.println("Bulunması istenen id gir: ");
        istenenid=scan.nextByte();

        if(kitaplar.isEmpty()){
            System.out.println("Hic kitap yok.");
        }else if(kitaplar.containsKey(istenenid)){
            silinenKitap=kitaplar.remove(istenenid);
            System.out.println("Silinecek Kitap: "+silinenKitap);
        }else{
            System.out.println("Aradıgınız id bilgisine sahip kitap bulunmamaktadır.");
        }
        menu();
    }

    //Var olan kitablar hashMap yazdıralım
    public static void Listele(){
        for (Integer key :kitaplar.keySet())
        {
          System.out.println(key+":"+kitaplar.get(key));
        }
        menu();
    }




}

