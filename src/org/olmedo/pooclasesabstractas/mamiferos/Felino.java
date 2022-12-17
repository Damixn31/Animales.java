package org.olmedo.pooclasesabstractas.mamiferos;

abstract public class Felino extends Mamifero {
  protected float tamanoGarras;
  protected Integer velocidad;


  public Felino(float tamanoGarras, Integer velocidad, String habitat, float altura, float largo, float peso){
    super(habitat, altura, largo, peso);
    this.tamanoGarras = tamanoGarras;
    this.velocidad = velocidad;
  }

  public float getTamanoGarras(){
    return tamanoGarras;
  }

  public Integer getVelocidad(){
    return velocidad;
  }
}
