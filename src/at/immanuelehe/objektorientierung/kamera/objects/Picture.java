package at.immanuelehe.objektorientierung.kamera.objects;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Picture {

    private String name;
    private final Date date;
    private final int size;

    public Picture(Date date, int size) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        this.name = ("pic" + dtf.format(LocalDateTime.now()));
        this.date = date;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public int getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

}
