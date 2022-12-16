package at.immanuelehe.examples.cars.objects;

public class Producer {

    private String name;
    private String countryOfOrigin;
    private float percentDiscount;

    public Producer(String name, String countryOfOrigin, float percentDiscount) {
        this.name = name;
        this.countryOfOrigin = countryOfOrigin;
        this.percentDiscount = percentDiscount;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public float getPercentDiscount() {
        return percentDiscount;
    }

    public void setPercentDiscount(float percentDiscount) {
        this.percentDiscount = percentDiscount;
    }
}
