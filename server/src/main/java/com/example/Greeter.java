package com.example;

/**
* @param  someone  c'est un objet "qui donne une personne"
* @return String Hello babaca avec l'objet someone
*/
public class Greeter {

  
  public Greeter() {

  }

  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
