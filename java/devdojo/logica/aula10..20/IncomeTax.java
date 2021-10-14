import java.util.Scanner;
public class IncomeTax {
    public static void main(String[] args) {
        //não faço ideia do que e instancia mas achei legal botar isso pra receber os numeros
        Scanner receive = new Scanner(System.in);
        double salary;
        salary = receive.nextDouble();
        if (salary <= 1903.98) {
            System.out.println("free of tax");
        }else if(salary >= 1903.99 && salary <= 2826.65){
            System.out.println("7.5% tax: " + (salary * 0.075));
        } else if(salary >= 2826.66 && salary <= 37510.05){
            System.out.println("15% tax: " + (salary * 0.15));
        }else if(salary >= 37510.06 && salary <= 4664.68){
            System.out.println("22.5% tax: " + (salary * 0.225));
        } else{
            System.out.println("27.5% tax: " + (salary * 0.275));
        }

    }
}
