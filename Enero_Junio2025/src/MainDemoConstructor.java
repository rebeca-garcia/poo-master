public class MainDemoConstructor {
    public static void main(String[] args) {
        //aqui estas invocando al constructor
        DemoConstructor obj = new DemoConstructor();
        System.out.println(obj.atributo1);
        obj.atributo1="Nuevo valor";
        System.out.println(obj.atributo1);

        DemoConstructor obj2=new DemoConstructor("Este es mi valor");
        System.out.println(obj2.atributo1);
        DemoConstructor obj3= new DemoConstructor("Valor String",200.5542);

        //Alumno r=new Alumno ("Rebeca",18,"E20234567","Segundo");
    }
}
