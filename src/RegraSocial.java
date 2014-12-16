public class RegraSocial {

	public MictoriosDisponiveis getMictoriosDisponiveis(
			Mictorio[] mictoriosBanheiro) {

		Mictorio[] mictorios = mictoriosBanheiro.clone();
		int quantidadeDisponiveis = 0;

		for (int index = 0; index < mictorios.length - 1; index++) {
			if (mictorios[index].isDisponivel() && mictorios[index + 1].isDisponivel()) {
				mictorios[index+1] = new Mictorio(true);
				quantidadeDisponiveis++;
				index++;
			}
		}

		return new MictoriosDisponiveis(quantidadeDisponiveis, mictorios);
	}

}
