package poo;

import java.util.ArrayList;
import java.time.LocalDateTime;

public class Icalendar {
    private ArrayList<Vevent> eventos;
    private final String version = "2.0";
    private final String prodid = "-//IFSC//POO29004//PT";

    public Icalendar() {
        this.eventos = new ArrayList<>();
    }
    public Boolean adicionarEvento(String summary, LocalDateTime dtstart, LocalDateTime dtend , String location){
        Vevent evento = new Vevent(summary,dtstart,dtend,location);
        this.eventos.add(evento);
        return true;

    }
    public Boolean removerEvento(String nomeEvento){
        for(Vevent evento: eventos){
            if(evento.getSummary().matches(nomeEvento)){
                eventos.remove(evento);
                return true;
            }
        }
        return false;
    }
    public Boolean alterarSummary(String nomeEvento,String novoSummary){
        for(Vevent evento: eventos){
            if(evento.getSummary().matches(nomeEvento)){
                evento.setSummary(novoSummary);
                return true;
            }
        }
        return false;
    }
    public Boolean alterarDtstart(String nomeEvento,LocalDateTime novoDtstart){
        for(Vevent evento: eventos){
            if(evento.getSummary().matches(nomeEvento)){
                evento.setDtstart(novoDtstart);
                return true;
            }
        }
        return false;
    }
    public Boolean alterarDtend(String nomeEvento , LocalDateTime novoDtend){
        for(Vevent evento: eventos){
            if(evento.getSummary().matches(nomeEvento)){
                evento.setDtend(novoDtend);
                return true;
            }
        }
        return false;
    }
    public Boolean alterarLocation(String nomeEvento,String novaLocation){
        for(Vevent evento: eventos){
            if(evento.getSummary().matches(nomeEvento)){
                evento.setLocation(novaLocation);
                return true;
            }
        }
        return false;
    }
    public Boolean alterarRrule(String nomeEvento,String freq,int interval,LocalDateTime until , String byday){
        for(Vevent evento: eventos){
            if(evento.getSummary().matches(nomeEvento)){
                evento.setRrule(freq,interval,until,byday);
                return true;
            }
        }
        return false;
    }
    public Boolean setExdates(String nomeEvento,LocalDateTime exdate){
        for(Vevent evento: eventos){
            if(evento.getSummary().matches(nomeEvento)){
                evento.setExdate(exdate);
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        String aux="";
        for(Vevent ev : eventos){
            aux = aux + ev.toString();
        }
        return "BEGIN:VCALENDAR " +"\n"+ "VERSION:" + this.version + "\n" +"PRODID:"+  this.prodid + "\n" + aux  + "END:VCALENDAR";
    }
}
