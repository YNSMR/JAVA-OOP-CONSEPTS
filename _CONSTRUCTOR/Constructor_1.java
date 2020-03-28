package _CONSTRUCTOR;

/*
 *   yapıcı metotlar ( constructor ) Biz bir sınıf oluşturduktan sonra o sınıfı kullanabilmemiz için gerekli işlemleri 
 * yapmamızı isteyen bir yapı diyebiliriz...
 * 
 */

// Sınıfı oluşturuluyor...
class Ev{    //  Bir ev taslağı hazırlıyoruz....
    //  constructor dediğimiz yapı bir ev alacağımız zaman evde olmasını istediğimiz işleri yapar.
    public Ev(){            //   constructorlar class adı ile aynı olmalıdır...  class Adı Ev olduğu için constructorın adı da Ev dir.
        //  Geriye değer döndürmezler...
        //  diğer metotlarda yaptığımız public int topla() ,  public String oku()  gibi metotlardaki int String gibi geri değer döndürmezler...
        System.out.println("Ev Satın Alındı...");       //  Mesela burda constructor'ı ev satın alırken yaptığımız anlaşma gibi düşünebiliriz...
    }
    //  constructorlar birden fazla olabilir...
    //  Metotlardaki overloading burada da geçerlidir..
    /*
     * OverLoading : Bu kavram metotların parametrelerine bağlı olarak aynı isimle tekrar tekrar yazılabilmesidir.  
     *              
     */
    //  OverLoading yapacak olursak...
    public Ev(String disrenk,String icrenk){    // Mesela bir ev alırken önce iç ve dış tarafını boyatmak isteyebilirsiniz...
        //  Bu constructor sadece evin iç ve dış rengini değiştirerek satın alıyoruz...
        System.out.println("Renkler belli olarak ev satın alındı...");
        renkdis = disrenk ; 
        renkic = icrenk ;
    }
    
    String renkdis , renkic ;
    
}

public class Constructor_1 {
    public static void main(String[] args) {
        
        //  Nesne oluşturuluyor...
        Ev Ali_Ev = new Ev() ;   //  Burada ilk tercih kullnaılmış yani ali evi olduğu gibi almış...
        //  Alinin evinin rengi belli değil şuan çünkğ belirtmedik...
        //  Alinin evinin renkleri belirleniyor...
        Ali_Ev.renkdis = "Siyah" ;
        Ali_Ev.renkic = "Beyaz" ;
        //  2. Nesne oluşturuluyor...
        Ev Su_Ev = new Ev("Kırmızı", "Sarı");  //  Burada ise 2. tercih kullanılmış yani Su evi aldıktan sonra boyamış...
        //  şuan Su nun evinin dışı kırmızı içi sarı renkte...
        System.out.println("Alinin Evinin Dışı : " + Ali_Ev.renkdis);
        System.out.println("Alinin Evinin İçi : " + Ali_Ev.renkic);
        System.out.println("------------------------------------------------------------------");
        System.out.println("Su nun Evinin Dışı : " + Su_Ev.renkdis);
        System.out.println("Su nun Evinin İçi : " + Su_Ev.renkic);


    }
}
