package org.olmedo.pooclasesabstractas.mamiferos;

public class Perro extends Canino {
  private int fuerzaMordida;

  public Perro(int fuerzaMordida, String color, float tamanoColmillos, String habitat, float altura, float largo, float peso){
    super(color, tamanoColmillos, habitat, altura, largo, peso);
    this.fuerzaMordida = fuerzaMordida;
  }

  public int getFuerzaMordida(){
    return fuerzaMordida;
  }

  @Override
  public String comer(){
    return "El Perro come con una mordida de " + fuerzaMordida;
  }

  public String dormir(){
    return "El Perro duerme en el sofa";
  }

  public String correr(){
    return "El Perro corre por el patio"; 
  }

  public String comunicarse(){
    return "El Perro ladra en todo el dia cuando escuchar ruidos";
  }
}
