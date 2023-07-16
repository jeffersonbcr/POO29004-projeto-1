package poo;

public class Location {
    private String localizacaoDoEvento;
    public Location(String localizacaoDoEvento) {
        this.localizacaoDoEvento = localizacaoDoEvento;
    }
    public void setLocalizacaoDoEvento(String localizacaoDoEvento) {
        this.localizacaoDoEvento = localizacaoDoEvento;
    }
    @Override
    public String toString() {
        return "LOCATION:" + localizacaoDoEvento;
    }
}
