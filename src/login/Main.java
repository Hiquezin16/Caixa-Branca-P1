package login;

public class Main {

        public static void main(String[] args)
        {
            User u = new User();
            boolean ok = u.verificarUsuario("henrique", "123");
            if (ok)
            {
                System.out.println("Usuário encontrado! nome: " + u.nome);
            }
            else
            {
                System.out.println("Falha na autenticação");
            }
        }
    }

