import java.util.Scanner;
public class LoginSystem {
    public static void main(String[] args) {
        Scanner receive = new Scanner(System.in);
        System.out.println("Login: ");
    String user = receive.nextLine();
    if (user.isBlank() || user == null || user.equals("admin") || user.equals("administrator") || user.equals("adm")){
        System.out.println("invalid user");
    }else {
        System.out.println(user + " logged with Sucess");
    }

    }
}

/* Eu, como administrador do sistema, gostaria de permitir que os próprios usuários cadastrassem
o nome de usuário (login) no sistema para agilizar o processo de migração do sistema antigo para o novo.

O usuário não pode deixar o login vazio "", ou criar um usuário com login "admin" ou "administrador".
se o valor entrador for válido, o sistema deverá exibir uma mensagem "<nome do usuário> cadastrado com sucesso"
Senão o sistema deverá mostrar o erro "Usuário inválido"

*/

/*
Site usado para consulta:
http://www.softblue.com.br/blog/java-strings-nao-use-operador-de-igualdade/

isBlank peguei dos comentarios do video
 */
