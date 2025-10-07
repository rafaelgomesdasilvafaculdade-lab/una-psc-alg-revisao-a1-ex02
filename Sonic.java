package Exercicio01;
import java.util.Scanner;

public class Sonic{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

    int esperanca = 0;
    int medo = 0;
    int confianca = 0;
    int desanimo = 0;
    int determinacao = 0;
    int incerteza = 0;

    System.out.println("=== SONIC ===\n");

    
    System.out.print("Quantos novos aliados Sonic, Knuckles e Tails conseguiram? ");
    int aliados = input.nextInt();

    if (aliados > 0) {
        esperanca = aliados * 15;
        System.out.println("A Esperança aumenta em " + esperanca + " pontos.");
    } else {
        medo = 40;
        System.out.println("Nenhum aliado encontrado! O Medo aumenta em 40 pontos.");
    }

    
    System.out.println("\nAgora, avalie os três confrontos contra Shadow (0 a 10):");
    System.out.print("Desafio 1: ");
    double d1 = input.nextDouble();
    System.out.print("Desafio 2: ");
    double d2 = input.nextDouble();
    System.out.print("Desafio 3: ");
    double d3 = input.nextDouble();

    double media = (d1 + d2 + d3) / 3.0;
    System.out.printf("Média dos desafios: %.2f\n", media);

    if (media >= 7) {
        confianca = 60;
        System.out.println("A Confiança da equipe aumenta em 60 pontos!");
    } else {
        desanimo = 60;
        System.out.println("A equipe ficou desanimada. Desânimo aumenta em 60 pontos.");
    }

    
    System.out.print("\nQuantas das 12 estratégias foram completamente analisadas? ");
    int estrategiasAnalisadas = input.nextInt();

    if (estrategiasAnalisadas > 12) estrategiasAnalisadas = 12;
    if (estrategiasAnalisadas < 0) estrategiasAnalisadas = 0;

    determinacao = estrategiasAnalisadas * 10;
    incerteza = (12 - estrategiasAnalisadas) * 10;

    System.out.println("Determinação: +" + determinacao + " pontos");
    System.out.println("Incerteza: +" + incerteza + " pontos");

   
    int positivas = esperanca + confianca + determinacao;
    int negativas = medo + desanimo + incerteza;

    System.out.println("\n=== RESULTADOS FINAIS ===");
    System.out.println("Emoções Positivas:");
    System.out.println("  Esperança: " + esperanca);
    System.out.println("  Confiança: " + confianca);
    System.out.println("  Determinação: " + determinacao);

    System.out.println("\nEmoções Negativas:");
    System.out.println("  Medo: " + medo);
    System.out.println("  Desânimo: " + desanimo);
    System.out.println("  Incerteza: " + incerteza);

    System.out.println("\nSoma das Emoções Positivas: " + positivas);
    System.out.println("Soma das Emoções Negativas: " + negativas);

    if (positivas > negativas) {
        System.out.println("\n🎉 O Shadow foi derrotado! A equipe de Sonic triunfou!");
    } else {
        System.out.println("\n💀 O Shadow venceu o time do Sonic desta vez...");
    }

    input.close();
}


}
