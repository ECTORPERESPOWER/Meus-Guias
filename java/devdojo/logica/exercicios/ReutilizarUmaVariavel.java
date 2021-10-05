public class ReutilizarUmaVariavel {
    public static void main(String[] args){
        double salary = 5000;
        double result = salary * 0.3D;
        System.out.println(result);
        result = salary * 0.15D;
        System.out.println(result);
        result = salary * 0.05D;
        System.out.println(result);



    }

}

/*
Crie uma variável que irá guardar o valor de um salário
Calcule a porcentagem desse salário,sendo os valores da porcentagem:
*30%
*15%
*5%

A cada vez que você calcular guarde o resultado em uma variável Imprima o resultado e reutilize
a variavel que guarda o resultado para o novo cálculo, repetindo o processo
 */
