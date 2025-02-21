public class MainBalon {
    public static void main(String[] args) {
        Balon obj1=new Balon();
        obj1.setMarca("Adidas");
        obj1.setTipo("Futbol americano");
        obj1.setMaterial("Cuero");
        obj1.setTamanio(5);
        System.out.println(obj1);

        Balon obj2=new Balon();
        obj2.setMarca("Wilson");
        obj2.setTipo("Futbol");
        obj2.setMaterial("plastico");
        obj2.setTamanio(2);
        System.out.println(obj2);
    }
}
