/**
 * This is the first Java in this 
 ----------------------------------------------------------------------------------------------------------------------------
 |   Keywords used in this Code      -    Description                                                                        |
 ----------------------------------------------------------------------------------------------------------------------------
    Class                           -    Defines a blueprint for creating objects
    public                          -    Access modifier that allows other classes to access this code
    static                          -    Keyword that allows a method to be called without creating an instance of the class
    void                            -    Specifies that a method does not have a return value
    main                            -    The entry point for any Java program
    String[]                        -    An array of string objects
    args                            -    Argument passed to the main method
    
-----------------------------------------------------------------------------------------------------------------------------
|    Built-in method used in this code  -   Description                                                                     |
-----------------------------------------------------------------------------------------------------------------------------
    System.out.println()                -    A method used to print a line of text to the console
    System                              - A built-in class providing access to system resources.
    out                                 - A static member field of System class, typically used to output data to the console.
    println                             - A method of the PrintStream class that prints a line of text to the console.
    */

    /* Basic things to remember
     * every class name should start with Capital letter by convention i.e: Hello
     * use all capital letters for Constant variable
     */

class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
/*
    In Java, the public class name and its file name must match due to:
        *Convention: 
            It is a standard practice in Java.
        *Identification: 
            The Java compiler uses the file name to identify the public class during compilation.
        *Error Prevention:
            Mismatched names result in a compilation error.
 */
    // Comments were used for documentation purpose and to increase code readability for future reference 
    // this is single line comments

    /* this is multiline comments
     */

    /**
     * this doc strings
     * @param args
     */