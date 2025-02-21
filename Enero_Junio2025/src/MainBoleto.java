public class MainBoleto {
    public static void main(String[] args) {
        Boleto obj1=new Boleto();
        obj1.setTipo("Adulto");
        obj1.setPrecio(80);
        obj1.setHora_partida ("4:30 p.m.");
        System.out.println(obj1);

        Boleto obj2=new Boleto();
        obj2.setTipo("Adulto mayor");
        obj2.setPrecio(50);
        obj2.setHora_partida ("8:00 a.m.");
        System.out.println(obj2);
    }
}
