package br.com.buscape.controller;

import br.com.buscape.model.Submarino;
import br.com.buscape.util.*;

public class ControllerSubmarino {

	public ControllerSubmarino() {
		super();
	}

	public Submarino comandosEntrada(String linhaComandos) {
		char[] comandos = linhaComandos.toCharArray();
		Submarino submarino = new Submarino();
		for (char c : comandos) {
			navegar(c, submarino);
		}
		// System.out.println(submarino.toString());
		return submarino;
	}

	public void navegar(char c, Submarino submarino) {
		switch (c) {
		case Comandos.RIGHT:
			moveRight(submarino);
			break;
		case Comandos.LEFT:
			moveLeft(submarino);
			break;
		case Comandos.UP:
			submarino.setZ(submarino.getZ() + 1);
			break;
		case Comandos.DOWN:
			submarino.setZ(submarino.getZ() - 1);
			break;
		case Comandos.MOVE:
			mover(submarino);
			break;
		default:
			// System.out.print("Erro");
		}
	}

	public void moveRight(Submarino submarino) {

		if (submarino.getDirecao().equals(Direcao.NORTE)) {
			submarino.setDirecao(Direcao.LESTE);
		} else if (submarino.getDirecao().equals(Direcao.LESTE)) {
			submarino.setDirecao(Direcao.SUL);
		} else if (submarino.getDirecao().equals(Direcao.SUL)) {
			submarino.setDirecao(Direcao.OESTE);
		} else {
			submarino.setDirecao(Direcao.NORTE);
		}
	}

	public void moveLeft(Submarino submarino) {

		if (submarino.getDirecao().equals(Direcao.NORTE)) {
			submarino.setDirecao(Direcao.OESTE);
		} else if (submarino.getDirecao().equals(Direcao.OESTE)) {
			submarino.setDirecao(Direcao.SUL);
		} else if (submarino.getDirecao().equals(Direcao.SUL)) {
			submarino.setDirecao(Direcao.LESTE);
		} else {
			submarino.setDirecao(Direcao.NORTE);
		}
	}

	public void mover(Submarino submarino) {

		if (submarino.getDirecao().equals(Direcao.NORTE)) {
			submarino.setY(submarino.getY() + 1);
		} else if (submarino.getDirecao().equals(Direcao.LESTE)) {
			submarino.setX(submarino.getX() + 1);
		} else if (submarino.getDirecao().equals(Direcao.OESTE)) {
			submarino.setX(submarino.getX() + 1);
		} else {
			submarino.setY(submarino.getY() - 1);
		}
	}
}
