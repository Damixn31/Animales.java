package org.olmedo.pooclasesabstractas.mamiferos;

public class Leon extends Felino {
  private int numManada;
  private double potenciaRugidoDecibel;

  public Leon(int numManada, double potenciaRugidoDecibel, float tamanoGarras, int velocidad, String habitat, float altura, float largo, float peso){
    super(tamanoGarras, velocidad, habitat, altura, largo, peso);
    this.numManada = numManada;
    this.potenciaRugidoDecibel = potenciaRugidoDecibel;
  }

  public int getNumManada(){
    return numManada;
  }

  public double getPotenciaRugidoDecibel(){
    return potenciaRugidoDecibel;
  }

  @Override
  public String comer(){
    return "El Leon come junto a su " + numManada;
  }

  @Override
  public String dormir(){
    return "El Leon duerme muchas horas";
  }

  @Override
  public String correr(){
    return "El leon corre a " + velocidad + " km/hr";
  }

  @Override
  public String comunicarse(){
    return "El Leon ruge a " + potenciaRugidoDecibel;
  }
}
