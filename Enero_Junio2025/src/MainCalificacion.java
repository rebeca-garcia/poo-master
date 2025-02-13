public class MainCalificacion {
    public static void main(String[] args) {
        Boleta_calificaciones b1=new Boleta_calificaciones();
        b1.nombre="Rebeca";
        b1.num_control=28020245;
        b1.cal1=90.5;
        b1.cal2=100;
        b1.cal3=90;
        b1.cal4=80;
        b1.cal5=100;
        b1.cal6=90.50;
        b1.cal7=75.80;
        System.out.println(b1.obtenerDatos());
        System.out.println(b1.calcular_calificaciones());

        Boleta_calificaciones b2=new Boleta_calificaciones();
        b2.nombre="Heber";
        b2.num_control=28020350;
        b2.cal1=80.5;
        b2.cal2=90.50;
        b2.cal3=90.80;
        b2.cal4=85;
        b2.cal5=90;
        b2.cal6=90.50;
        b2.cal7=85.80;
        System.out.println(b2.obtenerDatos());
        System.out.println(b2.calcular_calificaciones());

        Boleta_calificaciones b3=new Boleta_calificaciones();
        b3.nombre="Richard";
        b3.num_control=28020247;
        b3.cal1=100;
        b3.cal2=100;
        b3.cal3=100;
        b3.cal4=80;
        b3.cal5=100;
        b3.cal6=100;
        b3.cal7=100;
        System.out.println(b3.obtenerDatos());
        System.out.println(b3.calcular_calificaciones());
    }
}
