package com.soprasteria.esempioPoligono;

public class Parallelogramma {
	private float base;
	private float altezza;
	
	public Parallelogramma(float base, float altezza) {
		this.base = base;
		this.altezza = altezza;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltezza() {
		return altezza;
	}

	public void setAltezza(float altezza) {
		this.altezza = altezza;
	}
	
	
	public float calcoloArea() {
		
		return (float) (base*altezza);
	}
	
	public float calcoloPerimetro() {
		return (base * 2) + (altezza * 2);
	}
	

}
