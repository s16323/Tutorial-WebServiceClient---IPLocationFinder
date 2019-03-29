package iplocation;
import com.lavasoft.GeoIPService;   //jedna z wygenerowanych przez wsimport klas
import com.lavasoft.GeoIPServiceSoap;

public class IPLocationFinder {

    public static void main(String[] args) {                                           //main(String[] args)


        //1.accept IP address as arg, make a cal to the Web Service - WS will return the country name
        //2.Print country name into the console
        System.out.println("Your IP is: " + args[0]);
        if (args.length != 1) {                                                     // Sprawdza czy podano dokladnie 1 argument
            System.out.println("You need to pass only one IP address");
        } else {
//            String ipAddress = args[0];                                             // Wez arg [0] (jedyny możliwy w tej chwili) i utworz zmienną ipAddress
            GeoIPService ipService = new GeoIPService();                            // Nowa instancja wygenerowanej klasy GeoIPService
            GeoIPServiceSoap geoIPServiceSoap =  ipService.getGeoIPServiceSoap();   // Wsrod metod klasy znalazla sie taka, ktora tworzy instancje (interfejsu) GeoIPServiceSoap, tworzymy wiec instancje i nazywamy ja: geoIPServiceSoap
//            String ipLocation = geoIPServiceSoap.getIpLocation(args[0]);          // pominiete: String ipAddress = args[0];  // Wsrod metod dostepnych w geoIPServiceSoap jest taka ktora zwraca lokaizacje IP jako string (i przyjmuje numer IP jako string) ... tego trzeba poszukac...
//            System.out.println(ipLocation);                                         // koniec klienta.. powino wyswietlac Loakalizacje

            System.out.println(geoIPServiceSoap.getIpLocation(args[0]));            // lub w jednej linijce.. bez tworzenia niepotrebnie zmiennej String ipLocation

//            Inne dostepne metody z geoIPServiceSoap:

//            String ipLocation2 = geoIPServiceSoap.getLocation();                    //Podaje tylko wlasne IP
//            System.out.println(ipLocation2);

//            String ipLocation3 = geoIPServiceSoap.getIpLocation20(args[0]);
//            System.out.println(ipLocation3);
        }
    }

}
