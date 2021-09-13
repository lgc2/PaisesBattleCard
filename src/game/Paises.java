package game;

public class Paises {

    private String pais;
    private int id;
    private double area; // em km²
    private int numeroHabitantes; //
    private double ocupacao; // numeroHabitantes / area
    private double rendaPerCapta; // em US dólar

    public Paises(String pais, int id, double area, int numHabitantes,
                       double ocupacao, double rendaPerCapta) {
        this.setPais(pais);
        this.setId(id);
        this.setArea(area);
        this.setNumeroHabitantes(numHabitantes);
        this.setOcupacao(ocupacao);
        this.setRendaPerCapta(rendaPerCapta);
    }



    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }

    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }

    public double getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(double ocupacao) {
        this.ocupacao = ocupacao;
    }

    public double getRendaPerCapta() {
        return rendaPerCapta;
    }

    public void setRendaPerCapta(double rendaPerCapta) {
        this.rendaPerCapta = rendaPerCapta;
    }
}
