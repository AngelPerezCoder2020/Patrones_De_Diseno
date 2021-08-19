package PizzasPackage;

public abstract class Pizza {
    private String Nombre;
    private int Precio;
    private String[] Ingredientes;
    public Pizza(String Nombre, int Precio, String[] Ingredientes){
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.Ingredientes = Ingredientes;
    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public String[] getIngredientes() {
        return Ingredientes;
    }

    public void setIngredientes(String[] Ingredientes) {
        this.Ingredientes = Ingredientes;
    }
}