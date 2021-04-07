package Hitss.Treinamento.Apresentacao;

import Hitss.Treinamento.Repositorios.*;

public class Program {
	public static void main(String[] args) {
		System.out.println("");
		System.out.println("Hitss Treinamento:");
		System.out.println("");
		System.out.println("Prezado(a) Usuário(a), estamos em Desenvolvimento no momento.");
		
		DadoPesquisaRepositorio rep = new DadoPesquisaRepositorio();
		rep.CalcularMediaSalarial();
		
	}
}
