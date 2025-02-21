public class Mainmanzana {
    public static void main(String[] args) {
        Mazana obj1=new Mazana();
        obj1.setTamanio (8);
        obj1.setTipo("Mexicana");
        obj1.setColor("Amarillo");
        obj1.setTamanio(5);
        System.out.println(obj1);

        Mazana obj2=new Mazana();
        obj2.setTamanio(5);
        obj2.setTipo("Colombiana");
        obj2.setColor("Rojo");
        obj2.setTamanio(2);
        System.out.println(obj2);
    }
}
