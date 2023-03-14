public class Pan {
    private String tipo;
    private int precio;
    private int numeroPanes;

    public Pan() {
        this.tipo="";
        this.precio=0;
        this.numeroPanes = 0;
    }

    public Pan(String tipo, int precio, int np) {
        this.tipo = tipo;
        this.precio = precio;
        this.numeroPanes = np;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getNumeroPanes() {
        return numeroPanes;
    }

    public void setNumeroPanes(int numeroPanes) {
        this.numeroPanes = numeroPanes;
    }

}