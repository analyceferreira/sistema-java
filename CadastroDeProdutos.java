package Modelo;

import java.util.ArrayList;
import java.util.List;

public class CadastroDeProdutos {
	private static String NomeProduto;
	private static float valorUni;
	private static Integer quantEstoque;
	private static float valorTotal;
	private static List<String> listaProdutos = new ArrayList<String>();
	
	public static String getNomeProduto() {
		return NomeProduto;
	}

	public static void setNomeProduto(String nomeProduto) {
		NomeProduto = nomeProduto;
	}

	public static float getValorUni() {
		return valorUni;
	}

	public static void setValorUni(float valorUni) {
		CadastroDeProdutos.valorUni = valorUni;
	}

	public static Integer getQuantEstoque() {
		return quantEstoque;
	}

	public static void setQuantEstoque(Integer quantEstoque) {
		CadastroDeProdutos.quantEstoque = quantEstoque;
	}

	public static float getValorTotal() {
		return valorTotal;
	}

	public static void setValorTotal(float valorTotal) {
		CadastroDeProdutos.valorTotal = valorTotal;
	}

	public static List<String> getListaProdutos() {
		return listaProdutos;
	}

	public static void setListaProdutos(List<String> listaProdutos) {
		CadastroDeProdutos.listaProdutos = listaProdutos;
	}

	
	
	
	private static void calcularValorTotal() {
		valorTotal = (quantEstoque * valorUni);
	}
	
	public static void cadastrar() {
		calcularValorTotal();
		listaProdutos.add("\nProduto:" + NomeProduto + "\nValor Unitário:" + valorUni + "\nQuatidade em Estoque: "
				+ quantEstoque + "\nValor total:" + valorTotal + "\n*****************************************");
	}

}
