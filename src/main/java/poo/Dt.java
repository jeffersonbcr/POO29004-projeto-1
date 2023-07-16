package poo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Dt {
    private LocalDateTime data;
    private String tipo;

    public Dt(String tipo){
        this.data = LocalDateTime.now();
        this.tipo = tipo.toUpperCase();
    }
    public Dt(LocalDateTime dt, String tipo) {
        this.data = dt;
        this.tipo = tipo.toUpperCase();
    }
    public void setData(LocalDateTime data) {
        this.data = data;
    }
    @Override
    public String toString() {
        return tipo+ ":" + data.format(DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmmss"));
    }
}
