public class MainComputadora {
    public static void main(String[] args) {
        Computadora obj1=new Computadora();
        obj1.setMarca("Acer");
        obj1.setMemoria("8 RAM");
        obj1.setPeso("4 Kg");
        System.out.println(obj1);

        Computadora obj2=new Computadora();
        obj2.setMarca("Dell");
        obj2.setMemoria("8 RAM");
        obj2.setPeso("3 Kg");
        System.out.println(obj2);
    }
}
