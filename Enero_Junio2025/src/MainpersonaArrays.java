import java.util.ArrayList;
import java.util.Scanner;

public class MainpersonaArrays {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList();
        Scanner teclado=new Scanner(System.in);
        //String frase="Feliz San Valentin";
        String frase="";
        System.out.println("Escribe quit para salir");
        while (true){
            System.out.println("Dame una frase");
            frase=teclado.nextLine();
            if (frase.equals("quit"))
                break;
            lista.add(frase);
        }
        for (String s: lista){ //Iterador
            System.out.println(s);
        }
        /*lista.add(frase);//Agregar al Arraylist

        frase="Que reciban muchos apapachos";
        lista.add(frase);
        frase="Hoy sera un día maravilloso... para otros";

        System.out.println(frase);
        System.out.println(lista.get(0));
        System.out.println(lista.get(1));

        if (lista.contains(frase)){
            System.out.println("Tistemente así será");
        }else{
            System.out.println("Eres afortunado");
        }

        System.out.println(lista.size());*/

    }
}
