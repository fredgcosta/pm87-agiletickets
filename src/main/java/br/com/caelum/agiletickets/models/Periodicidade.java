package br.com.caelum.agiletickets.models;


public enum Periodicidade {

	DIARIA(1), SEMANAL(7);
	private int divisor;

	Periodicidade(int pDivisor) {
		divisor = pDivisor;
	}

	public int getDivisor() {
		return divisor;
	}

}
