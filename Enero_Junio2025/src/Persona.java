public class Persona {
    String nombre;
    int edad;
    double estatura;
    double peso;
    String genero;

    double calcular_imc(){
        return peso/(estatura*estatura);
    }
    String obtenerDatos(){
        String cadena="";
        cadena=cadena+"Persona{ Nombre: "+nombre+"; ";
        cadena=cadena+"Edad: "+edad+"; ";
        cadena=cadena+"Estatura: "+estatura+"; ";
        cadena=cadena+"Peso "+peso+"; ";
        cadena=cadena+"Genero: "+genero+"}";
        return cadena;
    }

}
