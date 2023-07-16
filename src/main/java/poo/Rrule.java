package poo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Rrule {
    private String rrule;
    private ArrayList<LocalDateTime> exdates;
    private String aux;

    public Rrule(String rrule) {
        this.rrule = rrule;
        this.exdates = new ArrayList<>();
        this.aux = "";
    }
    public void setRrule(String freq,int interval , LocalDateTime until, String byday) {
        this.rrule = "FREQ=" + freq.toUpperCase() + ";" + "INTERVAL=" + interval + ";" + "UNTIL=" + until.format(DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmmss")).toUpperCase() + ";" + "BYDAY=" + byday.toUpperCase();
    }
    public void setExdates(LocalDateTime exdate) {
        this.exdates.add(exdate);
    }

    public String getRrule() {
        return rrule;
    }

    @Override
    public String toString() {
        for(LocalDateTime data : exdates){
            this.aux = this.aux + "EXDATE:" + data.format(DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmmss")) + "\n";
        }
        return "RRULE:" +rrule + "\n" + aux ;
    }

}
