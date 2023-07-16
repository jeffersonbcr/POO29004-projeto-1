package poo;
import java.time.LocalDateTime;

public class Vevent {
    private Summary summary;
    private Uid uid;
    private Dt dtstart,dtend,dtstamp;
    private Location location;
    private Rrule rrule;
    private final String start = "dtstart";
    private final String end = "dtend";
    private final String stamp = "dtstamp";

    public Vevent(String summary,LocalDateTime dtstart, LocalDateTime dtend, String location) {
        this.summary = new Summary(summary);
        this.uid = new Uid();
        this.dtstart = new Dt(dtstart,start);
        this.dtend = new Dt(dtend,end);
        this.location = new Location(location);
        this.dtstamp = new Dt(stamp);
        this.rrule = new Rrule("");
    }
    public String getSummary() {
        return summary.getAssuntoDoEvento();
    }
    public void setSummary(String summary) {
        this.summary.setAssuntoDoEvento(summary);
    }
    public void setDtstart(LocalDateTime novoDtstart) {
        this.dtstart.setData(novoDtstart);
    }
    public void setDtend(LocalDateTime novoDtend) {
        this.dtend.setData(novoDtend);
    }
    public void setLocation(String location) {
        this.location.setLocalizacaoDoEvento(location);
    }
    public void setRrule(String freq,int interval,LocalDateTime until , String byday) {
        this.rrule.setRrule(freq,interval,until,byday);
    }
    public void setExdate(LocalDateTime exdata){
        this.rrule.setExdates(exdata);
    }
    @Override
    public String toString() {
        if(rrule.getRrule().length() == 0){
            return "BEGIN:VEVENT" + "\n" + this.summary.toString() + "\n" + this.uid.toString() + "\n"+ this.dtstamp.toString()+"\n" + this.dtstart.toString() + "\n" +
                    this.dtend.toString() + "\n" + "END:VEVENT" + "\n";
        }
        return "BEGIN:VEVENT" + "\n" + this.summary.toString() + "\n" + this.uid.toString() + "\n"+ this.dtstamp.toString()+"\n" + this.dtstart.toString() + "\n" +
                this.dtend.toString() + "\n"+rrule.toString() + "END:VEVENT" + "\n";
    }
}
