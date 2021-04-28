package Hitss.Treinamento.Repositorios;

import java.util.Arrays;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class DadoPesquisaRepositorio {
	
	public void CalcularMediaSalarial() {
		
		int[] Idade = new int[5];
		Idade[1] = 26;
		Idade[2] = 36;
		Idade[3] = 30;
		Idade[4] = 28;
		
		String[] Sexo = new String[5];
		Sexo[1] = "M";
		Sexo[2] = "M";
		Sexo[3] = "F";
		Sexo[4] = "F";
		
		double[] Salario = new double[5];
		Salario[1] = 2000.00;
		Salario[2] = 4000.00;
		Salario[3] = 1200.00;
		Salario[4] = 1600.00;
		

		
		
		
		
		Arrays.sort(Idade);
		int maior = Idade[4]; 
		int menor = Idade[1];
		System.out.println("Menor Idade é : " + menor); 	
		  System.out.println("Maior Idade é : " + maior);
		 int media = 0;
	        for(int i = 0; i<Salario.length; i++)
	            media += Salario[i];
	        
	        float total = (float)media / (Salario.length - 1);
	        System.out.println("A média é: "+total);
	    }
		
		//double mediaSalarial = (Salario[1] + Salario[2] + Salario[3] + Salario[4])/4; 
		 /*
		System.out.println("");
		System.out.println("A média salarial é de R$ " + mediaSalarial);

	}*/
}
