
/**
 * Compilation: javac UseArgument.java
 * Execution: java UseArgument Alice
 * 
 * Prints "Hi, Bob. how are you?" where Bob 
 * is replaced by the command line argument
 * 
 * % java UseArguments Bob
 * % Hi Bib, how are you?
 * 
 * %java UseArgument Alice
 * % Hi Alice, how are you?
 *
 */
public class UseArgument {

	public static void main(String[] args) {
		System.out.println("Hi, ");
		System.out.println(args[0]);
		System.out.println(", how are you?");
	}

}
