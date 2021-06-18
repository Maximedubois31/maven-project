/**
 * This module is about impact of the final keyword on performance
 * <p>
 * This module explores  if there are any performance benefits from
 * using the final keyword in our code. This module examines the performance
 * implications of using final on a variable, method, and class level.
 * </p>
 */
package com.example;

/** class Greeter doc. */
public class Greeter {

 /** greeter java doc. */
  public Greeter() {

  }

  /** Greet method. 
   * @param someone first arg
   * @return String.format("Hello babacar, %s!", someone) */
  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
