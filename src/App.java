import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        // -- ENTRADA DE DADOS -- //

        // Nome completo. - String
        System.out.println("Nome Completo: ");
        String nome = input.nextLine();

        // Nome do curso. - String
        System.out.println("Nome do Curso: ");
        String curso = input.nextLine();

        // Periodo que está cursando. - Int
        System.out.println("[numerico] Período do curso: ");
        Integer periodo = input.nextInt();

        // Quantidade de faltas - Int
        System.out.println("[numerico] Quantidade de Faltas: ");
        Integer faltas = input.nextInt();

        // Primeira nota. - Float
        System.out.println("[numerico] Primeira Nota: ");
        Float nota1 = input.nextFloat();

        // Segunda nota. - Float
        System.out.println("[numerico] Segunda Nota: ");
        Float nota2 = input.nextFloat();

        // -- SAIDA -- //

        // Media das notas
        Float media = (nota1 + nota2)/2;

        // Criando string para saída
        String out = String.format("Olá, %s!\nVocê está cursando o %dº período de %s\nQuantidade de faltas: %d\nMédia de notas: %.2f", nome, periodo, curso, faltas, media);
        
        // Saida
        System.out.println(out);

        // Fechando o Scanner
        input.close();
    }
}
