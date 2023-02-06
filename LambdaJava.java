import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaJava{
    public static void main(String[] args) {
        
        ArrayList<Integer> valores = new ArrayList<>();
        ArrayList<Integer> dobro = new ArrayList<>();
        ArrayList<Integer> par = new ArrayList<>();
        ArrayList<Integer> ímpar = new ArrayList<>();

        valores.add(1);
        valores.add(2);
        valores.add(3);
        valores.add(4);
        valores.add(5);
        valores.add(6);

        //Consumer<Integer> dobrar = (v)->{dobro.add(v*2);};
        //valores.forEach(dobrar); //recebe o Consumer (criado) dobrar
        //valores.forEach((v)->{dobro.add(v*2 );});

        valores.forEach((v)->{ //todas as coleções foram preenchidas com o lambda
            
            dobro.add(v*2 );
            if(v%2 == 0){
                par.add(v);
            }else{
                ímpar.add(v);
            }
        
        });


        System.out.println(valores);
        System.out.println(dobro);
        System.out.println(par);
        System.out.println(ímpar);

    }
}