import static junit.framework.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RegraSocialBanheiroTest {

	private RegraSocial regraSocial = null;

	@Before
	public void setUp() throws Exception {
		regraSocial = new RegraSocial();
	}

	@Test
	public void deveRetornarUmMictorioDisponivel() {
		Mictorio[] mictoriosBanheiro = new Mictorio[] { new Mictorio(true),
				new Mictorio(false), new Mictorio(false) };

		MictoriosDisponiveis mictorios = regraSocial.getMictoriosDisponiveis(mictoriosBanheiro);

		assertEquals(1, mictorios.getMictoriosDisponiveis());
		assertEquals(false, mictorios.getDisposicaoIdealMictorios()[0].isDisponivel());
		assertEquals(true, mictorios.getDisposicaoIdealMictorios()[1].isDisponivel());
		assertEquals(false, mictorios.getDisposicaoIdealMictorios()[2].isDisponivel());
	}

	@Test
	public void deveRetornarNenhumMictorioDisponivel() {
		Mictorio[] mictoriosBanheiro = new Mictorio[] { new Mictorio(false),
				new Mictorio(true), new Mictorio(false) };

		MictoriosDisponiveis mictorios = regraSocial.getMictoriosDisponiveis(mictoriosBanheiro);

		assertEquals(0, mictorios.getMictoriosDisponiveis());
		assertEquals(true, mictorios.getDisposicaoIdealMictorios()[0].isDisponivel());
		assertEquals(false, mictorios.getDisposicaoIdealMictorios()[1].isDisponivel());
		assertEquals(true, mictorios.getDisposicaoIdealMictorios()[2].isDisponivel());
	}

	@Test
	public void deveRetornarDoisMictoriosDisponiveis() {
		Mictorio[] mictoriosBanheiro = new Mictorio[] { new Mictorio(true),
				new Mictorio(false), new Mictorio(false), new Mictorio(false),
				new Mictorio(false) };

		MictoriosDisponiveis mictorios = regraSocial.getMictoriosDisponiveis(mictoriosBanheiro);

		assertEquals(2, mictorios.getMictoriosDisponiveis());
		assertEquals(false, mictorios.getDisposicaoIdealMictorios()[0].isDisponivel());
		assertEquals(true, mictorios.getDisposicaoIdealMictorios()[1].isDisponivel());
		assertEquals(false, mictorios.getDisposicaoIdealMictorios()[2].isDisponivel());
		assertEquals(true, mictorios.getDisposicaoIdealMictorios()[3].isDisponivel());
		assertEquals(false, mictorios.getDisposicaoIdealMictorios()[4].isDisponivel());
	}
}
