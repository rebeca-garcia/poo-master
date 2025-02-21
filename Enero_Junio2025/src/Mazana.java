public class Mazana {
    String color;
    int tamanio;
    String tipo;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Mazana{" +
                "color='" + color + '\'' +
                ", tamanio=" + tamanio +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
