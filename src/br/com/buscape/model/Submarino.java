package br.com.buscape.model;

import br.com.buscape.util.Direcao;

public class Submarino {

	private int x, y, z;
	private Direcao direcao;

	public Submarino() {
		this.direcao = Direcao.NORTE;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public Direcao getDirecao() {
		return direcao;
	}

	public void setDirecao(Direcao direcao) {
		this.direcao = direcao;
	}

	@Override
	public String toString() {
		return x + " " + y + " " + z + " " + direcao.name();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Submarino other = (Submarino) obj;
		if (direcao != other.direcao)
			return false;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		if (z != other.z)
			return false;
		return true;
	}
}
