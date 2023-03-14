package at.immanuelehe.objektorientierung.kamera.objects;

public class Manufacturer {

    private final String name;
    private final String country;

    public Manufacturer(String name, String country) {
        this.name = name;
        this.country = country;
    }


    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

}
