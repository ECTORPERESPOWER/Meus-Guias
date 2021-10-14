import java.util.Scanner;
public class SwimmingTournament {
    public static void main(String[] args) {
        // ainda não faço ideia de como funciona a instancia
        Scanner receive = new Scanner(System.in);
        System.out.println("name: ");
        String name = receive.next();
        // reset do buffer
        receive.nextLine();
        System.out.println("age: ");
        int age = receive.nextInt();
    if (age <= 10){
        System.out.println(name + " will participate in the children's category");
        }else if (age >= 11 && age <= 15){
        System.out.println(name + " will participate in the youth category");
    }else if (age >= 16 && age <= 19){
        System.out.println(name + " will participate in the young adult category");
        }else{
        System.out.println(name + " will participate in the adult category");
    }
    }
}



/*
Eu como usuario gostaria de ter o nome e a idade de participantes de um torneio de natação e que o sistema
imprimisse da seguinte forma menor que 10 anos: <Nome> participara da categoria infantil
entre 11 e 15 anos: <Nome> participara da categoria Juvenil
entre 16 e 19 anos: <Nome> participara da categoria Pré-adulto
ACima de  20 anos: <Nome> participara da categoria Adulto
Para que eu possa rapidamente classificar todos os participantes

SLH Q CAR**** e esse embaixo
Leitura complementar
Processos de desenvolvimento de software
Metodologias ágeis
SCRUM
//////
Algo que parei pra perceber agora depois do receive que é o nome que dei pro scanner vem algo chamado metodo
 */
