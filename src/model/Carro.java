package model;

import java.util.concurrent.SynchronousQueue;

/*
 * File name: Carro
 * Description: 
 * 	Criar uma classe que simule os componentes de um carro
 * Created: 26/10/2020 15:36
 * @Author: Fabricio Jose Barrozo
 * @Version 1.0 
 * 
 * */

public class Carro {
	// atributos
	public String marca;
	public int ano;
	/* a marcha somente pode ser mudada por um metodo para
		que nao mude, por exemplo da marcha 1 para a 4 direto, sem passar pela 2 e 3 */
	private int marcha;
	public int velocidade;
	
	// por padrao o carro comeca freiado
	public boolean freio = true;
	// por padrao o carro comeca desligado
	public boolean ligado;

	
	// metodos
	public void ligar () {
		if (this.ligado == false) {
			this.ligado = true;
			System.out.println("O carro ligado!");
		} else {
			System.out.println("O carro já está ligado!");
		}
		
	}
	public void desligar () {
		if(this.ligado == true ) {
			this.ligado = false;
			System.out.println("O carro foi desligado!");
		} else {
			System.out.println("O carro não  está ligado! ");
		}
		this.ligado = false;
		
			
	}
	public void trocarMarcha () {
		this.marcha = this.marcha + 1;
		System.out.println("trocou marcha para " + this.marcha + "ª");
	}
	public void acelerar (int velocidade) {
		
		if (this.ligado == true && this.freio == false ) {
			
			if (this.marcha == 1) {
				if (velocidade < 20) {
					this.velocidade = velocidade;
					System.out.println("carro com velocidade "  + this.velocidade + " Km/hora.");
				} else {
					System.out.println("marcha desproporcional para a aceleracao");
				}
			} else if (this.marcha == 2) {
				if (velocidade < 40) {
					this.velocidade = velocidade;
					System.out.println("carro com velocidade "  + this.velocidade + " Km/hora.");
				} else {
				System.out.println("marcha desproporcional para a aceleracao");
			}
			} else if (this.marcha == 3) {
				if (velocidade < 60) {
					this.velocidade = velocidade;
					System.out.println("carro com velocidade "  + this.velocidade + " Km/hora.");
				} else {
					System.out.println("marcha desproporcional para a aceleracao");
				}
			} else {
				if (velocidade < 80) {
					this.velocidade = velocidade;
					System.out.println("carro com velocidade "  + this.velocidade + " Km/hora.");
				} else {
					System.out.println("marcha desproporcional para a aceleracao");
				}
			} 
			
		}
		
	}

	 
}
