package org.olmedo.pooclasesabstractas.mamiferos;

public class Lobo extends Canino {
  private int numCamada;
  private String especieLobo;

  public Lobo(int numCamada, String especieLobo, String color, float tamanoColmillos, String habitat, float altura, float largo, float peso){
    super(color, tamanoColmillos, habitat, altura, largo, peso);
    this.numCamada = numCamada;
    this.especieLobo = especieLobo;
  }

    public int getNumCamada(){
      return numCamada;
    }

    public String getEspecieLobo(){
      return especieLobo;
    }

    @Override
    public String comer(){
      return "El Lobo " + especieLobo + " como en " + numCamada + " en el bosque de su " + habitat;
    }

    @Override
    public String dormir(){
      return "El Lobo " + color + " duerme en las montanias de " + habitat;
    }

    @Override
    public String correr(){
      return "El Lobo " + especieLobo + " corre por el bosque de " + habitat;
    }

    @Override
    public String comunicarse(){
      return "El Lobo " + especieLobo + " " + color + "aulla en luna llena";
    }
  
}
