import java.util.Scanner;
public class AlistamentoMilitar {
    public static void main(String[] args) {


        Scanner reader = new Scanner(System.in);
        System.out.println("Type u gender between M for 'Male' and F for 'Female'\nType: ");
        char gender = reader.next().charAt(0);
        System.out.println("enter your age\nType: ");
        int age = reader.nextInt();
        if (gender == 'M' || gender == 'm' && age >= 18){
            System.out.println("in Brazil, military conscription is mandatory for young men over 18 years of age");
        }else if (gender == 'F' || gender == 'f' && age >= 18){
            System.out.println("Would you like to join the army?\n");
            String question = reader.next();
            if (question.equalsIgnoreCase("Yes") ){
                System.out.println("you can introduce yourself tomorrow");
            }
            else if (gender == 'M' || gender == 'm' && age <= 17){
                System.out.println("you can't join the army at this age");
            }
            else if (gender == 'F' || gender == 'f' && age <= 17 ){
                System.out.println("you can't join the army at this age");
            }else {
                System.out.println("Error");
            }

        }

        }

    }

/*
Como secretario de alistamento militar eu gostaria que meu sistema aceitasse os seguintes parametros
para que eu possa agilizar o processo de cadastramento:
sexo, sendo valido apenas M ou F e idade.
Se o sexo for masculino e a idade for maior ou igual a 18 o sistema deve imprimir alistamento obrigatorio
Se o sexo for masculino e a idade for menor que 18 o sistema deve imprimir, alistamento não permitido
Se o sexo for feminino e a idade for maior igual a 18 o sistema deve perguntar se a pessoa desseja se alistar
Se o sexo for feminio e a idade for menor que 18 o sistema deve imprimir, alistamento não permitido
 */
