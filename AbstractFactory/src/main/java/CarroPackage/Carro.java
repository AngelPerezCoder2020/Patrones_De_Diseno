package CarroPackage;

public class Carro {
    private String Modelo;
    private String Color;

    public Carro(String Modelo, String Color) {
        this.Modelo = Modelo;
        this.Color = Color;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }
    
}
