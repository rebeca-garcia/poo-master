public class Boleta_calificaciones {
    String nombre;
    int num_control;
    double cal1;
    double cal2;
    double cal3;
    double cal4;
    double cal5;
    double cal6;
    double cal7;

    double calcular_calificaciones(){
        double total=(cal1+cal2+cal3+cal4+cal5+cal6+cal7)/7;
        return total;
    }
    String obtenerDatos(){
        String cadena="";
        cadena=cadena+"Persona{ Nombre: "+nombre+"; ";
        cadena=cadena+"Numero de control: "+num_control+"; ";
        cadena=cadena+"Calificación 1: "+cal1+"; ";
        cadena=cadena+"Calicicación 2: "+cal2+"; ";
        cadena=cadena+"Calificación 3 "+cal3+"; ";
        cadena=cadena+"Calificación 4 "+cal4+"; ";
        cadena=cadena+"Calificación 5 "+cal5+"; ";
        cadena=cadena+"Calificación 6 "+cal6+"; ";
        cadena=cadena+"Calificación 7: "+cal7+"}";
        return cadena;
    }
}
