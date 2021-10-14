import java.util.Scanner;
public class EvenOrOdd {

    public static void main(String[] args) {
        //não faço ideia do que e instancia mas achei legal botar isso
        Scanner receive = new Scanner(System.in);
        int number;
        number = receive.nextInt();
        if(number % 2 == 0){
            System.out.println("is even");
        }else {
            System.out.println("is odd");
        }
    }
}

// caso eu va ler outro e bom eu esvaziar o buffer do teclado
// receive.nextLine();
