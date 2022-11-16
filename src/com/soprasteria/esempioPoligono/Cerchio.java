package com.soprasteria.esempioPoligono;

public class Cerchio implements Poligono {
	
   private float raggio;
   private static final float p = 3.14f;
	
	
	public Cerchio (float raggio) {
		this.raggio = raggio;
		
	}


	public float getRaggio() {
		return raggio;
	}


	public void setRaggio(float raggio) {
		this.raggio = raggio;
	}


	public static float getP() {
		return p;
	}
	
	public float calcoloArea() {
		return (float) (raggio*raggio*p);
	}
	
	public float calcoloPerimetro() {
		return (float) (raggio*2*p);
	}
	

}
