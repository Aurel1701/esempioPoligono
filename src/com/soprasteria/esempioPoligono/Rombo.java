package com.soprasteria.esempioPoligono;

public class Rombo implements Poligono{
	private float base;
	private float altezza;
	
	public Rombo(float base, float altezza) {
		this.setBase(base);
		this.setAltezza(altezza);
		System.out.println("Area Rombo: " + calcoloArea(base, altezza));
	}

	private float calcoloArea(float base,float altezza) {
		return base * altezza;
	}
	/**
	 * @return the altezza
	 */
	public float getAltezza() {
		return altezza;
	}

	/**
	 * @param altezza the altezza to set
	 */
	public void setAltezza(float altezza) {
		this.altezza = altezza;
	}

	/**
	 * @return the base
	 */
	public float getBase() {
		return base;
	}

	/**
	 * @param base the base to set
	 */
	public void setBase(float base) {
		this.base = base;
	}
}
