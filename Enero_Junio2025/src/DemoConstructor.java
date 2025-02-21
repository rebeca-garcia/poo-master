//Vamos aagregar un constructor a nuestra clase
//CONSTRUCTOR: Un metodo especial que es invocado
//En el proceso de instanciamiento de la clase.
//Es publico, se lllema igual que la clase y no tiene tipo de retorno.
public class DemoConstructor {
    String atributo1;
    double atributo2;
    String atributo3;
    public DemoConstructor(){//Este es un costructor por default
        System.out.println("Creando el objeto"); // Aunque no lo veías existia
        atributo1="Valor del atributo1";
    }
    public DemoConstructor(String valor){ //(String), huella del constructor
        atributo1=valor;
    }
    public DemoConstructor(double valor1, String valor2){ //(double, String)
        atributo2=valor1;
        atributo1=valor2;
    }
    public DemoConstructor(String valor2, double valor1){ //(double, String)
        atributo2=valor1;
        atributo1=valor2;
    }
    public DemoConstructor(double valor1){ //(double)
        atributo2=valor1;
    }
    public DemoConstructor(String valor, String valor2){
        atributo3=valor;
        atributo1=valor2;
    }
    //No puede haber combinaciones
}
