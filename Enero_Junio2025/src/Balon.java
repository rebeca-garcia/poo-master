public class Balon {
    String marca;
    String tipo;
    int tamanio;
    String material;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Balon{" +
                "marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", tamanio=" + tamanio +
                ", material='" + material + '\'' +
                '}';
    }
}
