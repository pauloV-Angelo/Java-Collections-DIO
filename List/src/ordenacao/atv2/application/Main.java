package ordenacao.atv2.application;

import ordenacao.atv2.model.OrdenacaoNumeros;

public class Main {
	public static void main(String[] args) {
	    // Criando uma instância da classe OrdenacaoNumeros
	    OrdenacaoNumeros numeros = new OrdenacaoNumeros();

	    // Adicionando números à lista
	    numeros.adicionarNumero(2);
	    numeros.adicionarNumero(5);
	    numeros.adicionarNumero(4);
	    numeros.adicionarNumero(1);
	    numeros.adicionarNumero(99);

	    // Exibindo a lista de números adicionados
	    numeros.exibirNumeros();

	    // Ordenando e exibindo em ordem ascendente
	   numeros.ordenarAscendente();

	    // Ordenando e exibindo em ordem descendente
	   numeros.ordenarDescendente();
	  }
}
