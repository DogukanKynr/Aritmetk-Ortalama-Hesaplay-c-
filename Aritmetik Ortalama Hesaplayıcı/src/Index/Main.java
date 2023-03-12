package Index;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double fzk,kmy,trk,trh,mzk,mat; //değişkenleri baştan ayarladım
        Scanner abc = new Scanner(System.in); //veri girebilmek için

        System.out.print("Fizik notunuzu giriniz : "); //hepsinde bundan var kullanıcı ne girdiğini bilsin diye
        fzk = abc.nextDouble(); //veri girişi burdan yapılıyor hepsinde var

        System.out.print("Kimya notunuzu giriniz : ");
        kmy = abc.nextDouble();

        System.out.print("Türkçe notunuzu giriniz : ");
        trk = abc.nextDouble();

        System.out.print("Tarih notunuzu giriniz : ");
        trh = abc.nextDouble();

        System.out.print("Müzik notunuzu giriniz : ");
        mzk = abc.nextDouble();

        System.out.print("Matematik notunuzu giriniz : ");
        mat = abc.nextDouble();

        double ortalama = (fzk + kmy + trk + trh + mzk +mat)/6.0; //aritmatik ortalamanın bulunduğu kısım
        System.out.print("Ortalamanız : ");
        System.out.println(ortalama);

        boolean kosul1 = ortalama >= 50; //ortalama 50 den büyük ise geçiyorsun

        String str = (kosul1) ? "Geçtiniz" : "Kaldınız";
        System.out.println(str);
    }
}
