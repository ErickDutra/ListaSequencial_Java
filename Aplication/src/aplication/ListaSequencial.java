package aplication;

public class ListaSequencial {

	private Aluno[] vetor = new Aluno[10];
	private int totalElementos = 0;
	
	//adiciona elementos ao vetor utilizando a variável totalElementos como índice.
	public void adiciona(Aluno aluno) {
		garanteEspaco();
		vetor[totalElementos] = aluno;
		//totalElementos = totalElementos + 1;
		totalElementos++;
	}
	
	private void garanteEspaco() {
		if (totalElementos == vetor.length) {
			Aluno[] novoVetor = new Aluno[vetor.length*2];
			for (int i = 0; i < vetor.length; i++) {
				novoVetor[i] = vetor[i];
			}
			vetor = novoVetor;
		}
		
	}
	//retorna o tamanho da lista
	public int tamanho() {
		return totalElementos;
	}
	
	//retorna um valor da lista, recebendo a posição como parâmetro.
	public Aluno retornaValor(int posicao) {
		if (posicao < tamanho()) {
			return vetor[posicao];
		}
		System.out.printf("Posição maior que o tamanho do vetor!\n");
		return null;
	}
	
	//verifica se a lista contem um valor passado como parâmetro
	public boolean contem(Aluno aluno) {
		for (int i = 0; i < tamanho(); i++) {
			if(aluno.equals(vetor[i])) {
				return true;
			}
		}
		return false;
	}
	
	public void remove(int posicao) {
		for (int i = posicao; i < tamanho(); i++) {
			vetor[i] = vetor[i+1];
		}
		totalElementos--;
	}
	

/*
 	//adiciona elementos ao vetor, porém tem custo computacional maior à medida que o vetor aumenta.
	public void adiciona(int valor) {
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == 0) {
				vetor[i] = valor;
				break;
			}
		}
	}
*/	
	
	public void mostra() {
		for (int i = 0; i < tamanho(); i++) {
			System.out.printf("%d ", vetor[i]);
		}
		System.out.println();
	}
	
}
