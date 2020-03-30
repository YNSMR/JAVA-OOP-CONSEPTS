package _ENCAPSULATION;


class Insan{
    private String tcno ;           //  Insanların tc kimlik numraları kendilerine özeldir. bu yüzden private olması lazım...
    private String kimlikSeriNo ;   //  KimlikSeriNo su da gizli olmalıdır...
    private String ad , soyad ;      // Ad ve Soyad herkes tarafından bilinebilir.
    private int yas;                        // Yaşını herkes bilebilir...
    public Insan(String tcno,String kimlikSeriNo,String ad,String soyad,int yas){   
        
        //   İlk oluştururken tüm bilgiler alınır.  Ve daha sonra bazı bilgiler değiştirilemez....    Ve bazı bilgilerin değiştirilmesi
        //   için izin gereklidir.  Oyle direkt olarak değiştirilmemesi lazım...
        //  İşte biz bunlar için Getter Setter Metotlarını kullanırız...
        
        this.tcno = tcno ;
        this.kimlikSeriNo = kimlikSeriNo ;
        this.ad = ad ;
        this.soyad = soyad ;
        this.yas = yas ;
    }
    
    //   --------------------------------------------------------------------------------------  ==>
    
    // TC no sonradan değiştirilemez ve sadece kendisi tarafondan bilinir kimse ulaşamaz...
    //Yani Tc no nun get ve set metodu olmaz kimse ulaşmasın diye...
    
    //   --------------------------------------------------------------------------------------  <==
    //*********************************************************************************************************
    //   --------------------------------------------------------------------------------------  ==>
    
    //Kimlik Seri No değiştirilemez ve sadece kendisi tarafından bilinir...
    //Kimlik Seri No nun get ve set metodu olamaz kimsenin ulaşmaması için...
    
    //   --------------------------------------------------------------------------------------  <==
    //*********************************************************************************************************
    //   --------------------------------------------------------------------------------------  ==>
    
    //Ad herkes tarafından bilinir ve izin ile değiştirilebilir...
    
    // Get Metodu öğrenmek için kullanılır...
    
    public String getAd(){
        return ad;
    }
    
    //Set Metodu değer atamak için kullanılır...
    
    public void setAd(String ad){
        this.ad = ad ;
    }
    
    //   --------------------------------------------------------------------------------------  <==
    //*********************************************************************************************************
    // -----------------------------------------------------------------------------------------  ==>
    
    //Soyad herkes tarafından bilinir ve izin ile değiştirilebilir...
    
    //  Get Metodu
    
    public String getSoyAd(){
        return soyad ;
    }
    
    //  Set Metodu
    
    public void setSoyad(String soyad){
        this.soyad = soyad ;
    }
    
    //   --------------------------------------------------------------------------------------  <==
    //*********************************************************************************************************
    // -----------------------------------------------------------------------------------------  ==>
    
    // yaş herkes tarafından bilinir ama değiştirilemez...
    
    //  Get Metodu
    
    public int getYas(){
        return yas ;
    }
    
    // Set Metodu
    // Set Metodu yoktur.  Çünkü yaş değiştirilemez...
    
    //   --------------------------------------------------------------------------------------  <==
    //*********************************************************************************************************
}


public class GETTER_SETTER {
    public static void main(String[] args) {
        Insan ali = new Insan("156516551651651", "564s5ads6", "yunus emre", "demirdağ", 20) ;
        System.out.println("Ad : "+ali.getAd());
        System.out.println("***************");
        System.out.println("Soyad : "+ali.getSoyAd());
        System.out.println("***************");
        System.out.println("Yas : "+ali.getYas());
        ali.setAd("Ali");
        ali.setSoyad("Çelik");
        System.out.println("------------------------------------------------------");
        System.out.println("Ad : "+ali.getAd());
        System.out.println("***************");
        System.out.println("Soyad : "+ali.getSoyAd());
    }
}
