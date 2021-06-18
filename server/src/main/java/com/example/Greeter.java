package com.example;


public class Greeter {

 /** @greeter java doc. */
  public Greeter() {

  }

  /** @greeter java doc 
 
 * @param string somone
 * @return string
   
  */
  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
