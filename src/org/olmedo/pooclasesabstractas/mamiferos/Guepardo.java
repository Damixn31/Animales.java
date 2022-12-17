package org.olmedo.pooclasesabstractas.mamiferos;

public class Guepardo extends Felino {

  public Guepardo(float tamanoGarras, Integer velocidad, String habitat, float altura, float largo, float peso){
    super(tamanoGarras,velocidad, habitat, altura, largo, peso);
  }

  @Override 
  public String comer(){
    return "El Guepardo come animales de cualquier tamanio";
  }

  @Override
  public String dormir(){
    return "El Guepardo duerme en las noches";
  }
  
  @Override
  public String correr(){
    return "El Guepardo corre a " + velocidad + "km/hr";
  }

  @Override
  public String comunicarse(){
    return "El Guepardo no muy fuerte";
  }
}
