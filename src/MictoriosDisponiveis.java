public class MictoriosDisponiveis {

	private int mictoriosDisponiveis = 0;
	private Mictorio[] disposicaoMictorios;
	
	public MictoriosDisponiveis(int mictoriosDisponiveis, Mictorio[] disposicao) {
		this.mictoriosDisponiveis = mictoriosDisponiveis;
		this.disposicaoMictorios = disposicao;
	}

	public int getMictoriosDisponiveis() {
		return this.mictoriosDisponiveis;
	}

	public Mictorio[] getDisposicaoIdealMictorios() {
		return this.disposicaoMictorios;
	}

}
