package javaoop;


/*
 Nesneye Yönelik Programlamanın mantığı aslında Programı parçalara bölmektir.
 * Böylece oluşacak hatalar daha kolay çözülebilir ve karmaşıklık azalır.
 */

/*
 * Javada class dediğimiz yapı bir iş yeridir.   Object dediğimiz sey iş yerinin çalışanıdır.   
 * Nesneye yönelik programlama ise çalışanların iletişimi ve etkileşimidir.
 */

//Sınıf Olusşturma

class Insan {    //  Insan adında bir class oluşturduk...
    double boy ;
    String cinsiyet ;           //   Bu 3 satırda Insan classına bazı özellikler yüklenmiş
    int yas ;                   
}                        //  Bu yapıda Bir taslak oluşturduk diyebiliriz.  Yani biz eğer insan olursa boyle özellikleri olmalı dedik.

//   Bir dosya içerisinde en fazla 1 tane public class olabilir diğer classlar public olamaz ve public olan class Dosyanın adı olmalıdır.
//   Dosya adı olan _Class_Object bizim public class ımız...    Diğer oluşturulacak class lar Insan class ı gibi public olmadan tanımlanmalıdır.

public class _Class_Object {
    
    public static void main(String[] args) {
        
        //  NESNE OLUŞTURMA
        // Oluşturduğumuz Insan classına taslak demiştik...   Yani şimdi biz bir insan oluşturacağız   ve bu insanın 3 tane özelliği olacak
        Insan ali = new Insan() ;
        //   İlk olarak Insan yazdık bu bize ali nin ne olacağını belirtiyor yani bir insanmı arabamı bisiklet mi vs.  
        //  =  den sonra new anahtar sözcüğü Taslak dediğimiz Insan classını artık aliye ait olmasını sağlıyor. 
        //  Insan() dediğimiz ise ali ye Insan classında belirttiğimiz özellikleri yüklüyor.
        // ali artık bir Insan  Eğer insan ise insana ait özellikleri var olmalı 
        //  Biz bu özelliklere ulaşmak için  '.' işareti kullanırız.
        ali.boy = 175 ;   //   '.' işareti kendinden önce yazılan classın içine girmeyi sağlıyor...  Burada ali nin boyuna 175 değerini atmış yani 
                        //     ali artık 175 cm boyunda... 
        ali.cinsiyet = "Erkek" ; //  alinin erkek olduğunu belirttik...
        ali.yas = 20 ;      // Alinin 20 yaşında olduğunu söyledik...
        //  yani ali 175 boyunda 20 yaşında erkek olan bir insan...
        
        
    }
    
}

