package com.example;


public class Greeter {

  /**
         * Ceci est un commentaire Javadoc. 
         * Il commence par un slash suivis de deux étoiles. 
         * Chaque ligne doit ensuite commencer par une étoile. 
         * Enfin, il fini par une étoile suivie d'un slash.
   */
  public Greeter() {
 
  }

  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
