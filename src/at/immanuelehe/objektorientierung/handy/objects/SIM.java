package at.immanuelehe.objektorientierung.handy.objects;

public class SIM {

    private int id;
    private String number;

    public SIM(int id, String number) {
        this.id = id;
        this.number = number;
    }

    public void doCall(String number) {
        System.out.println("Calling " + number);
    }

    public int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

}
