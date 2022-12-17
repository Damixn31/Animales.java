package org.olmedo.pooclasesabstractas.mamiferos;

public class EjemploMamiferos {
  public static void main(String[] args){

     Mamifero[] mamiferos = new Mamifero[6];

     Mamifero tigre = new Tigre("Siberiano", 5.4f, 59, "Selva", 100, 200, 170);
     Mamifero perro = new Perro(30, "Marron", 2.5f, "Casa", 100, 92, 35);
     Mamifero leon = new Leon(120, 6, 5.4f, 69, "Selva", 200, 220, 500);
     Mamifero lobo = new Lobo(90, "Siberiano", "Negro", 3.6f, "Bosque", 300, 90, 30);
     Mamifero guepardo = new Guepardo(3.3f, 300, "Selva", 200, 160, 190);
     Mamifero tigreBengala = new Tigre("Bengala", 5.6f, 45, "Selva", 90, 109, 200);

     mamiferos[0] = tigre;
     mamiferos[1] = perro;
     mamiferos[2] = leon;
     mamiferos[3] = lobo;
     mamiferos[4] = guepardo;
     mamiferos[5] = tigreBengala;


     for(Mamifero m: mamiferos) {
       System.out.println(" ========================= " + m.getClass().getSimpleName() + " ====================== ");
       System.out.println("Habitat:" + m.getHabitat());
       System.out.println("Altura:" + m.getAltura());
       System.out.println("Largo:" + m.getLargo());
       System.out.println("Peso:" + m.getPeso());
       
       if(m instanceof Canino){
         System.out.println("Colmillos:" + ((Canino) m).getTamanoColmillos());
         System.out.println("Color:" + ((Canino) m).getColor());

         if(m instanceof Lobo){
           System.out.println("Especie Lobo:" + ((Lobo)m).getEspecieLobo());
           System.out.println("Numero Integrantes:" + ((Lobo) m).getNumCamada());
         }
         if(m instanceof Perro){
           System.out.println("Fuerza mordida:" + ((Perro)m).getFuerzaMordida());
         }
       }

       if(m instanceof Felino){
          System.out.println("Tamanio Garras:" + ((Felino) m).getTamanoGarras());
          System.out.println("Velocidad:" + ((Felino)m).getVelocidad());

          if(m instanceof Leon){

          System.out.println("Potencia Rugido:" + ((Leon) m).getPotenciaRugidoDecibel());
          System.out.println("Numero Integrantes:" + ((Leon) m).getNumManada());
          }
          if(m instanceof Tigre){

          System.out.println("Especie Tigre:" + ((Tigre) m).getEspecieTigre());
          }
       }

          System.out.println(m.comer());
          System.out.println(m.dormir());
          System.out.println(m.correr());
          System.out.println(m.comunicarse());

     }
  }
}
