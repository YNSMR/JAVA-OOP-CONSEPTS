package javaoop;

//  Once Insan oluşturmuştuk şimdi Araba oluşturalım...
class Araba { 
    String marka,renk ;    // Arabanın olması gereken özelliklerini belirledik...  Bunlar arttırılabilir...
    
    void gazaBas() {     //  Bu ise Arabanın biz söylediğimiz zaman yapabilmesi gereken bir davranış şekli...
        System.out.println("Gaza Basıldı...");   //   Eğer herhangi bir Araba gaza basarsa ekrana Gaza Basıldı yazılacak...
    }
    
    void freneBas() {
        System.out.println("Frene Basıldı...");  //   Eğer herhangi bir Araba frene basarsa ekrana frene Basıldı yazılacak...
    }
    
}

public class _Class_Object_2 {
    
    public static void main(String[] args) {
        
        // Şimdi Bir Araba oluşturalım...
        Araba car = new Araba() ;
        //  car adında bir Araba oluşturduk...
        car.marka = "audi" ;                //  Arabamızın olması gereken özelliklerini belirttik...
        car.renk = "Mavi" ;
        car.gazaBas();          //   Arabaya gaza basmasını söyledik...
        car.freneBas();         //   Arabaya frene basmasını söyledik...
        
    }
    
}
