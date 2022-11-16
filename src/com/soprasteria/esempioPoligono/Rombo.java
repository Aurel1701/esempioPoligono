package com.soprasteria.esempioPoligono;

public class Rombo implements Poligono{
	private float base;
	private float altezza;
	private float lato;
	
	public Rombo(float base, float altezza,float lato) {
		this.setBase(base);
		this.setAltezza(altezza);
		this.setLato(lato);
		System.out.println("Area Rombo: " + 1);
	}

	
	public float getLato() {
		return lato;
	}


	public void setLato(float lato) {
		this.lato = lato;
	}


	public float calcoloArea() {
		return getBase() * getAltezza();
	}
	

	
	public float calcoloPerimetro() {
		return getLato() * 4;
	}
	
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
