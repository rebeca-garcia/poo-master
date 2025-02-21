public class Boleto {
    double precio;
    String tipo;
    String hora_partida;
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setHora_partida(String hora_partida) {
        this.hora_partida = hora_partida;
    }

    public String getHora_partida() {
        return hora_partida;
    }

    @Override
    public String toString() {
        return "Boleto{" +
                "precio=" + precio +
                ", tipo='" + tipo + '\'' +
                ", hora de partida='" + hora_partida + '\'' +
                '}';
    }
}
