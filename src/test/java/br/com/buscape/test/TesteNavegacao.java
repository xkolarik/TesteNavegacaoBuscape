package br.com.buscape.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.buscape.controller.ControllerSubmarino;
import br.com.buscape.model.Submarino;
import br.com.buscape.util.Direcao;

public class TesteNavegacao {

	@Test
	public void test() {

		ControllerSubmarino navegacao = new ControllerSubmarino();
		Submarino result = navegacao.comandosEntrada("RMMLMMMDDLL");
		Submarino submarino = new Submarino();

		submarino.setX(2);
		submarino.setY(3);
		submarino.setZ(-2);
		submarino.setDirecao(Direcao.SUL);

		// System.out.println(submarino);
		// System.out.println(result);

		Assert.assertEquals(submarino, result);
	}
}
