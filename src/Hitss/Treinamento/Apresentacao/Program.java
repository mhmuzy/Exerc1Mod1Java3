package Hitss.Treinamento.Apresentacao;

import Hitss.Treinamento.Repositorios.*;

public class Program {
	public static void main(String[] args) {
		System.out.println("");
		System.out.println("Hitss Treinamento:");
		System.out.println("");
		System.out.println("              Resultado das Pesquisas:");
		System.out.println("-----------------------------------------------------------------------------");
		DadoPesquisaRepositorio rep = new DadoPesquisaRepositorio();
		rep.CalcularMediaSalarial();
		System.out.println("-----------------------------------------------------------------------------");
	}
}
