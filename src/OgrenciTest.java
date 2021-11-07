public class OgrenciTest {
    public static void main(String[] args) {
        //Java'da obje oluşturma bu şekilde
        Ogrenci ogr = new Ogrenci();

        ogr.setNo(1);
        ogr.setAd("furkan");
        ogr.setSoyad("cömert");
        ogr.setDogumYeri("Rize");
        ogr.setHarc(1500);

        System.out.println(ogr.getNo() + "-" +ogr.getAd() + " "+ ogr.getSoyad()+ " "+ogr.getHarc());

        ogr.setHarc(2000);

        System.out.println(ogr.getNo()+ "-"+ ogr.getAd()+ " "+ ogr.getSoyad()+ " "+ ogr.getHarc());

        ogr.setHarc(-1000);

        System.out.println(ogr.getNo()+ "-"+ ogr.getAd()+ " "+ ogr.getSoyad()+ " "+ ogr.getHarc());

        Ogrenci org2 = new Ogrenci( 2,  "Uğur", "Coşkun", " Türkiye", 5000 );



    }
}
