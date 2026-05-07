import java.util.Scanner;

public class Systemcourse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Olá " + nome + " Cadastre sua senha: ");
        int senhaCadastro = scanner.nextInt();

        System.out.println("Senha cadastrada. Digite sua senha!");
        int senha = scanner.nextInt();

        while (senhaCadastro != senha) {
            System.out.println("Senha errada, tente novamente: ");
            senha = scanner.nextInt();
        }

        System.out.println("Acesso liberado!");

            System.out.println("Digite o curso/faculdade que você vai fazer");
            System.out.println("1 - Python");
            System.out.println("2 - Java");
            System.out.println("3 - (Faculdade)Engenharia de software");
            int opcoes = scanner.nextInt();


                switch (opcoes) {
                    case 1:
                        System.out.println("Curso de Python escolhido!");
                        break;
                    case 2:
                        System.out.println("Curso de Java escolhido!");
                        break;
                    case 3:
                        System.out.println("Faculdade de Engenharia de software escolhido!");
                        break;
                    default:
                        System.out.println("Somente os cursos/faculdade acima");
                }

        System.out.println("O que você quer agora?");
        System.out.println("1 - Começar o curso/faculdade");
        System.out.println("2 - Ver dados do curso/faculdade");
        System.out.println("3 - Terminar por hoje");
        int dadosOpcoes = scanner.nextInt();

        if (opcoes == 1){
            switch (dadosOpcoes){
                case 1:
                    System.out.println("Iniciando curso de Python!");
                    break;
                case 2:
                    System.out.println("Dados do curso de Python: ");
                    System.out.println("Curso de Python:\nDuração: 3 meses\nConteúdo: lógica, automação, projetos\nNível: iniciante");
                    break;
                case 3:
                    System.out.println("Fechando...");
            }
        } else if (opcoes == 2){
            switch (dadosOpcoes){
                case 1:
                    System.out.println("Iniciando curso de Java!");
                    break;
                case 2:
                    System.out.println("Dados do curso de Java: ");
                    System.out.println("Curso de Java:\nDuração: 100 horas\nConteúdo: POO, sistemas, banco de dados\nNível: iniciante a intermediário");
                    break;
                case 3:
                    System.out.println("Fechando...");
            }
        } else if (opcoes == 3){
            switch (dadosOpcoes){
                case 1:
                    System.out.println("Iniciando faculdade de Engenharia de Software!");
                    break;

                case 2:
                    System.out.println("Dados da faculdade Engenharia de Software: ");
                    System.out.println("Engenharia de Software:\nDuração: 4 anos (faculdade)\nConteúdo: algoritmos, testes, projetos grandes\nNível: intermediário a avançado");
                    break;
                case 3:
                    System.out.println("Fechando...");
            }
        }

        scanner.close();
    }
}
