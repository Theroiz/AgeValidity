import java.util.Scanner;

public class AgeValidity {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Insira sua idade");
        int idade = entrada.nextInt();
        
        if(idade < 18)
        {
            System.out.println("Voce nao pode dirigir !!");
        }else
        {
            System.out.println("Voce pode dirigir !!");
        }
       
    }
}
