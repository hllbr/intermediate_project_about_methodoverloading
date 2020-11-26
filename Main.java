

import java.util.Scanner;


public class Main {
    public static void toplama (int a,int b,int c){
        System.out.println("3 değer vererek oluşturduğunuz toplama işleminizin sonucu = "+(a+b+c));
    }
    public static void toplama(int a,int b){
        System.out.println("2 adet değer ile yapmak istediğiniz toplama işleminizin sonucu ) "+(a+b));
    }
      public static double toplama(double a,double b,double c){
        System.out.println("double veri tipi seven kullanıcı seni unuturmuyuz :) "+"\n"+"3 adet double ifade ile yapılan toplama işlemimizin sonucu : "+(a+b+c));
        return 0;
    } 
    public static String toplama(String a,String b,String c){
        System.out.println("demek sende sınırları zorlayanlardansın ne mutlu senin adına ");
        System.out.println("3 String ifademizin toplamı :");
        System.out.println(a+"\t"+b+"\t"+c);
        return null;
       
        
    }
  
    public static void main(String[] args) {
        /*
        Metodlarda overloading(Metodlarda Aşırı Yükleme)
        javada bir methoda methodoverloading yapıtğımız zaman birden garklı şekilde çağırabiliriz.
        Birden farklı şekilde kullanabiliyoruz.
        örnek toplama fonksiyonu 3 değerli oluşturulduysa 2 değer gönderemezsiniz fakat 2 değer için bir toplama fonksiyonu yazablirsiniz aynı isimle tanımlarsanızda herhangi bir sıkıntı ile KARŞILAŞMAZSINIZ.
        
        */
        Scanner scn = new Scanner(System.in);
        
        String islemler = "METODOVERLOADİNG PROGRAMINA HOŞGELDİNİZ\n"
                + "1)3 adet sayı toplama\n"
                + "2)2 adet sayı toplama\n"
                + "3)3 adet double toplama\n"
                + "4)3 adet string toplama\n"
                + "5)çıkış için q veya Q\n"
                + "6)islemleri tekrar görmek için";
        System.out.println(islemler);
               while (true) { 
                   
                   System.out.println("yapmak istediğiniz işlemi seçiniz");
                    String islem = scn.nextLine();
                    if(islem.equals("1")){
                        System.out.println("seçtiğiniz işlem 3 adet sayı toplamadır.");
                        System.out.println("lÜTFEN BEKLEYİNİZ...");
                        System.out.println("Lütfen int bir sayı giriniz");
                        int a = scn.nextInt();
                        System.out.println("Lütfen int bir sayı giriniz");
                        int b = scn.nextInt();
                        System.out.println("Lütfen int bir sayı giriniz");
                        int c = scn.nextInt();
                        toplama(a, b, c);
                       
                    }else if(islem.equals("2")){
                        System.out.println("seçtiğiniz işlem 2 adet sayı toplamadır.");
                        System.out.println("Lütfen int bir sayı giriniz");
                        int a = scn.nextInt();
                        System.out.println("Lütfen int bir sayı giriniz");
                        int b = scn.nextInt();
                        toplama(a, b);
                    
                    }else if(islem.equals("3")){
                        System.out.println("seçtiğiniz işlem 3 adet double ifadeyi toplamadır.");
                        System.out.println("Lütfen double bir sayı giriniz");
                        double a = scn.nextDouble();
                        System.out.println("Lütfen double bir sayı giriniz");
                        double b = scn.nextDouble();
                        System.out.println("Lütfen double bir sayı giriniz");
                        double c = scn.nextDouble();
                        toplama(a, b, c);
                        
                    }else if(islem.equals("4")){
                        System.out.println("seçmiş olduğunuz işlem String 3 ifadenin toplamıdır");
                         System.out.println("Lütfen String bir sayı giriniz");
                        String a = scn.nextLine();
                         System.out.println("Lütfen String bir sayı giriniz");
                        String b = scn.nextLine();
                         System.out.println("Lütfen String bir sayı giriniz");
                        String c = scn.nextLine();
                        toplama(a, b, c);
                        
                    }else if(islem.equals("q") || islem.equals("Q")){
                        System.out.println("SİSTEMDEN ÇIKIŞ YAPILIYOR...");
                        System.out.println("iyi ve sağlıklı günler dileriz");
                        break;
                    }else if(islem.equals("6")){
                        System.out.println("**********************************************************************");
                        System.out.println("işlemleri tekrar görmek istediniz.işlemler gösterilene kadar size for döngüsünü ne kadar iyi bildiğimizi göstermek istedik.:)");
                        for(int i = 0;i<=58;i++){
                            System.out.println("*"+i);
                            System.out.println("-"+i);
                            System.out.println("/"+i);
                        }
                        System.out.println("umarız görsel şölenimiz hoşunuza gitmiştir işte beklediğiniz liste :");
                        System.out.println(islemler);
                        System.out.println("**********************************************************************");

                    }
        }
    
    
    }
}

