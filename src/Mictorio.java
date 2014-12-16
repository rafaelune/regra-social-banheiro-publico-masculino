
public class Mictorio {
	private boolean disponivel;
	
	public Mictorio(boolean temGente) {
		this.disponivel = !temGente;
	}

	public boolean isDisponivel() {
		return disponivel;
	}
}
