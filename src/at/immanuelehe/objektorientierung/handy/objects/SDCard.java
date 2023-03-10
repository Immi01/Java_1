package at.immanuelehe.objektorientierung.handy.objects;

import java.util.ArrayList;
import java.util.List;

public class SDCard {

    private int capacity;
    private List<PhoneFile> saved = new ArrayList<>();

    public SDCard(int capacity) {
        this.capacity = capacity;
    }

    public void saveFile(PhoneFile phoneFile) throws Exception {
        Exception tooLarge = new Exception("File to save is to big");

        if (capacity > phoneFile.getSize()) {
            saved.add(phoneFile);
            capacity -= phoneFile.getSize();
            System.out.println("Saved file " + phoneFile.getInfo());
        } else {
            throw tooLarge;
        }
    }

    public int getFreeSpace() {
        return capacity;
    }

    public List<PhoneFile> getAllFiles() {
        return saved;
    }

}
