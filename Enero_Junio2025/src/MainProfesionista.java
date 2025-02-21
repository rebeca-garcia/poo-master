public class MainProfesionista {
    public static void main(String[] args) {
        Profesionista obj1=new Profesionista();
        obj1.setNombre("Heber");
        obj1.setEdad(21);
        obj1.setProfesion("Maestro");
        obj1.setAntiguedad(14);
        System.out.println(obj1);

        Profesionista obj2=new Profesionista();
        obj2.setNombre("Richard");
        obj2.setEdad(21);
        obj2.setProfesion("Ingeniero");
        obj2.setAntiguedad(4);
        System.out.println(obj2);
    }
}
