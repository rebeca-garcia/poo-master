import java.util.Scanner; //Sirve para meter datos por teclado
public class FastTrackFundamentos {
    public static void main(String[] args){
      /*  //Variable de java
        int a;
        double b;
        String d;
        boolean e;

        a=3;
        b=20.5;
        d="Esto es una cadena";
        e=true;
        String nombre= "Jorge Estudillo";

        //Constantes
        final double PI=3.141516; //Con final no se podra cambiar el valor de la variable

        Scanner intro=new Scanner(System.in);
        System.out.println(b);
        b=intro.nextDouble(); //Lee el dato
        System.out.println(b); //Imprime el dato*/

       /* //condicionales <,>,<=,>=,!=,=,==
        //Operadores logicos &&, ||,!
        int valor=21;
        int calif=82;
        if (!(valor >= 20 || calif>80)) {
            if(valor==20){
                System.out.println("ES EXACTAMENTE 20");
            }else{
                System.out.println("ES SUPERIOR A 20");
            }
        }
        else{
            System.out.println("ES MENOR O IGUAL");
        }
        System.out.println("FIN DEL PROGRAMA");

        //Condiconeales multiples "switch"
        //enteros, cadenas, carateres
        int opcion;
        opcion=4;
        switch (opcion){
            case 1:
                System.out.println("Vale 1");
                break;
            case 2:
                System.out.println("Vale 2");
                break;
            case 3:
                System.out.println("Vale 3");
                break;
            default:
                System.out.println("Valor no permitido");
                break;
        }
        */
        //Ciclos for y while
        /*for (int i=10, j=0; i!=j; i--,j++){ //Valor inicial, condicion, incremento o decremento
            if (i==9){
                continue; //Pasa la siguiente vuelta
            }
            System.out.println(i);
            if (i==7){
                break;
            }
        }
        Scanner teclado=new Scanner(System.in);
        int opcion=-1;
        for(;;){
            System.out.println("ESCRIBE UN 0 PARA SALIR");
            opcion=teclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("tecleaste 1");
                    break;
                case 2:
                    System.out.println("tecleaste 2");
                    break;
                case 3:
                    System.out.println("tecleaste 3");
                default:
                    break;
            }
            if (opcion==0){
                break;
            }
        }
        int opcion=20;
        while (!(opcion<10)){
            System.out.println(opcion);
            opcion-=1;
        }
        int centinela=0;
        while (centinela!=0){
            System.out.println("Centinela en while");
        }
        centinela=0;
        do{
            System.out.println("centinela en do while");
        }while (centinela!=0);
        System.out.println(suma(3,5));
        multiplica(6,10);*/

        //Arreglos
        //int[] edades={18,20,21,25,19,22};
        //String nombres[]={"Leo","Abraham","Rebeca"};
        /*int[]edades= new int[10];
        edades[6]=16;
        edades[1]=20;
        System.out.println(edades[6]);
        System.out.println(edades[1]);
        System.out.println(edades[0]);

        String[] paises=new String[5];
        paises[0]="México";
        System.out.println(paises[0]);
        /*System.out.println(edades[1]);
        System.out.println(nombres[nombres.length-1]);
        for(int i=0; i<nombres.length;i++){
            System.out.println(nombres[i]);
        }*/
        int [][]calificaciones={{1,2,3},
                                {4,5,6},
                                {7,8,9}}; //Matriz
        System.out.println(calificaciones[0][2]);
        for(int i=0; i<calificaciones.length;i++){
            for (int j=0; j<calificaciones.length; j++){
                System.out.println(calificaciones[i][j]);
            }
        }
        double [][]calif_poo=new double[27][6];
        calif_poo[6][0]=99;
        System.out.println(calif_poo[6][0]);
    }//Fin del main
    public static int suma(int a, int b){
        return a+b;
    }
    public static void multiplica(int x, int y){ //Se pone void debido a queno retona nada
        int res;
        res=x*y;
        System.out.println(res);
    }

}
