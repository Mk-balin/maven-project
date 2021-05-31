/* ceci est le @package */
package com.example;

public class Greeter {
/** ceci est la class greeter */
  public Greeter() {
/** ceci est un constructeur*/
  }
  public final String greet(final String someone) {
    /** ceci est la methode greet 
    * @param someone c'est le nom de la personne
    * @return c'est la phrase de retour
    */
    return String.format("Hello babacar, %s!", someone);
  }
}
