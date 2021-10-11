public class CalculadoraImpostoComCondicional {
    public static void main(String[] args) {
        float salary = 6480;
        if (salary >= 4500){
            System.out.println("imposto cobrado de 30% do seu salario: " + salary * 0.30);
        }else{
            System.out.println("imposto cobrado de 15% do seu salario: " + salary * 0.15);
        }
    }
}

/*
Dado um determinado salário
se o salário for maior que 4500 imprima 30% do valor
senão imprima 15% do valor
 */
