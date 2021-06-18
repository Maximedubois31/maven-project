/**
 * Domain classes used to produce the JSON and XML output for the RESTful services. 
 * <p>
 * These classes contain the JAXB annotations.
 *
 * @since 1.0
 * @author jwhite
 * @version 1.1
 */
package com.example;

/** class Greeter doc. */
public class Greeter {

 /** greeter java doc. */
  public Greeter() {

  }

  /** Greet method. @param someone first arg
   * @return String.format("Hello babacar, %s!", someone) */
  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
