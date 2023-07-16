package poo;

public class Summary {
    private String assuntoDoEvento;

    public Summary(String assuntoDoEvento) {
        this.assuntoDoEvento = assuntoDoEvento;
    }
    public void setAssuntoDoEvento(String assuntoDoEvento) {
        this.assuntoDoEvento = assuntoDoEvento;
    }
    public String getAssuntoDoEvento() {
        return assuntoDoEvento;
    }
    @Override
    public String toString() {
        return "SUMMARY:" + assuntoDoEvento;
    }
}
