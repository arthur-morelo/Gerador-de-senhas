import java.security.SecureRandom;
import java.util.Scanner;

public class Main {
    // Bancos de caracteres fundamentais
    private static final String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    private static final String MAIUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMEROS = "0123456789";
    private static final String ESPECIAIS = "!@#$%^&*()-_=+[{]};:',<.>/?";


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SecureRandom random = new SecureRandom();



        System.out.println("=========================");
        System.out.println("=== Gerador de senhas ===");
        System.out.println("=========================");

        int tamanho = 0;
        while (true) {
            System.out.println("Digite o tamanho da senha entre 4 a 32: ");

            tamanho = sc.nextInt();
            if (tamanho >= 4 && tamanho <= 32) {
                break;
            } else {
                sc.next();
            }
            System.out.println("❌ Erro: O tamaho está errado, escreva um número entre 4 e 32");
        }
        StringBuilder bancoCaracteres = new StringBuilder();
        System.out.println("Digite quais são as condições da senha.");
        System.out.println("Deseja que haja números? (S/N): ");
        if (sc.next().equalsIgnoreCase("s")){
            bancoCaracteres.append(NUMEROS);
        }
        System.out.println("Como deseja as letras? (1 - Apenas Minúsculas, 2 - Apenas Maiúsculas, 3 - Ambas, 4 - Nenhuma): ");
        int letras = sc.nextInt();
        switch (letras) {
            case 1 -> bancoCaracteres.append(MINUSCULAS);
            case 2 -> bancoCaracteres.append(MAIUSCULAS);
            case 3 -> bancoCaracteres.append(MINUSCULAS).append(MAIUSCULAS);
            default -> {}
        }
        System.out.println("Deseja que incluir carcteres especiais? (S/N): ");
        if (sc.next().equalsIgnoreCase("s")){
            bancoCaracteres.append(ESPECIAIS);
        }
        if (bancoCaracteres.length() == 0) {
            System.out.println("❌ Erro: Você precisa escolher pelo menos um tipo de caractere!");
            return;
        }
        String conjuntoFinal = bancoCaracteres.toString();
        StringBuilder senhaDefinitiva = new StringBuilder();

        for (int i = 0; i < tamanho; i++) {
            int indiceAleatorio = random.nextInt(conjuntoFinal.length());
            senhaDefinitiva.append(conjuntoFinal.charAt(indiceAleatorio));
        }
        System.out.println("========================================================================");
        System.out.println(" Senha gerada com sucesso: " + senhaDefinitiva.toString());
        System.out.println("========================================================================");

        sc.close();

    }
}