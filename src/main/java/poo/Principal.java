package poo;

import java.time.LocalDateTime;

public class Principal {
    public static void main(String[] args) {
        Icalendar c = new Icalendar();
        LocalDateTime localDateTimeUm = LocalDateTime.of(2020, 04, 22, 13, 30, 00);
        LocalDateTime localDateTimeDois = LocalDateTime.of(2020, 04, 22, 15, 20, 00);
        LocalDateTime localDateTimeTres = LocalDateTime.of(2020, 04, 25, 15, 40, 00);
        LocalDateTime localDateTimeQuatro = LocalDateTime.of(2020, 04, 25, 17, 30, 00);
        LocalDateTime localDateTimeCinco = LocalDateTime.of(2020, 06, 22, 17, 30, 00);
        LocalDateTime localDateTimeSeis = LocalDateTime.of(2020, 05, 25, 15, 40, 00);
        LocalDateTime localDateTimeSete = LocalDateTime.of(2020, 05, 14, 7, 30, 00);
        LocalDateTime localDateTimeOito = LocalDateTime.of(2020, 05, 14, 9, 40, 00);
        System.out.println("adicionando um evento:");
        c.adicionarEvento("Aula de poo",localDateTimeUm,localDateTimeDois,"laboratorio de redes 1");
        System.out.println(c.toString());
        c.alterarDtstart("Aula de poo" , localDateTimeTres);
        c.alterarDtend("Aula de poo" , localDateTimeQuatro);
        System.out.println("alterando DSTART e DTEND do ultimo evento adicionado");
        System.out.println(c.toString());
        System.out.println("Adicionando um RRULE e EXDATE ao ultimo evento adicionado");
        c.alterarRrule("Aula de poo" , "daily",1,localDateTimeCinco,"fr");
        c.setExdates("Aula de poo",localDateTimeSeis);
        System.out.println(c.toString());
        System.out.println("adicionando um novo evento:");
        c.adicionarEvento("aula de sinais",localDateTimeSete,localDateTimeOito,"CAD 3");
        System.out.println(c.toString());
    }
}
