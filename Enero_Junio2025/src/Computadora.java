public class Computadora {
    String marca;
    String peso;
    String memoria;
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String setPeso() {
        return peso;
    }

    public void setPeso (String peso) {
        this.peso = peso;
    }
    public String getMemoria() {
        return memoria;
    }


    public void setMemoria(String memoria) {
        this.memoria = memoria;

    }
    @Override
    public String toString() {
        return "Computadora{" +
                "Marca='" + marca + '\'' +
                ", Peso=" + peso +
                ", Memoria='" + memoria + '\'' +
                '}';
    }

}
