package Modelo;

import java.util.Scanner;

public class MenuProdutos {
	static CadastroDeProdutos novoCadastro = new CadastroDeProdutos();
	static Scanner opMenu = new Scanner(System.in);
	static Scanner entrada = new Scanner(System.in);
	static Integer valorMenu = -1;
	static String produto;
	static float valor;
	static Integer estoque;

	
	public static void main(String[] args) {	
		while (valorMenu != 0) {
			if (valorMenu == 1) {
				receberValores();
				novoCadastro.cadastrar();
				chamarMenu();
			}else if (valorMenu == 2) {
				System.err.println(CadastroDeProdutos.getListaProdutos());
				chamarMenu();
			 }else if (valorMenu == 0) {
				System.exit(0);
			 }else {
				chamarMenu(); 		
			 }

		}
	}
	
	private static void receberValores() {
		System.out.println("INFORME O NOME DO PRODUTO:");
		produto = entrada.next();
		CadastroDeProdutos.setNomeProduto(produto);
		
		System.out.println("INFORME O VALOR UNITÁRIO DO PRODUTO:");
		valor = entrada.nextFloat();
		CadastroDeProdutos.setValorUni(valor);
		
		System.out.println("INFORME A QUANTIDADE DO PRODUTO EM ESTOQUE:");
		estoque = entrada.nextInt();
		CadastroDeProdutos.setQuantEstoque(estoque);
	}
	
	private static void chamarMenu() {
		System.err.println("-------------------");
		System.err.println("MENU");
		System.err.println("1:CADASTRAR PRODUTO");
		System.err.println("2:IMPRIMIR LISTA DE PRODUTOS");
		System.err.println("0:SAIR");
		valorMenu = opMenu.nextInt();
	}
	
}
