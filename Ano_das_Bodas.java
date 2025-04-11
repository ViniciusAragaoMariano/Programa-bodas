package bodas;

import java.util.Scanner;

public class Ano_das_Bodas {

public static void main(String[] args) {

Scanner leia = new Scanner(System.in);
int ano, ano_casamento, boda;

System.out.println("Programa que diz as bodas!!!");

System.out.println("Informe o ano atual: ");
ano = leia.nextInt();

System.out.println("Informe o ano de casamento: ");
ano_casamento = leia.nextInt();

boda = ano - ano_casamento;

if (boda == 25) {
System.out.println("Suas bodas são de prata!");
}else if (boda == 50) {
System.out.println("Suas bodas são de ouro!!");
}else if (boda == 75) {
System.out.println("Suas bodas são de diamante!!!");
}else if (boda > 75) {	
System.out.println("Você está casado há: " + boda + " anos");
}
}
}

