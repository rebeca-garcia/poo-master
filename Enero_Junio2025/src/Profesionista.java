public class Profesionista {
    String nombre;
    int edad;
    String profesion;
    int antiguedad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return "Profesionista{" +
                "Nombre='" + nombre + '\'' +
                ", Edad=" + edad +
                ", Profesion='" + profesion + '\'' +
                ", Antiguedad=" + antiguedad +
                '}';
    }
}
