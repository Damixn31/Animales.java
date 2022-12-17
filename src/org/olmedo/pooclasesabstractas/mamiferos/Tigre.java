package org.olmedo.pooclasesabstractas.mamiferos;

public class Tigre extends Felino {
  private String especieTigre;


  public Tigre(String especieTigre, float tamanoGarras, Integer velocidad, String habitat, float altura, float largo, float peso){
    super(tamanoGarras, velocidad, habitat, altura, largo, peso);
    this.especieTigre = especieTigre;
  }

    public String getEspecieTigre(){
      return especieTigre;
    }

    @Override
    public String comer(){
      return "El Tigre " + especieTigre + " Come todo lo que encuentre en el lugar de " + habitat;
    }

    @Override
    public String dormir(){
      return "El Tigre " + especieTigre + " duerme muchas horas en el lugar de " + habitat;
    }

    @Override
    public String correr(){
      return "El Tigre " + especieTigre + " corre a " + velocidad + " km/hr";
    }

    @Override
    public String comunicarse(){
      return "El Tigre ruge"; 
    }
}
