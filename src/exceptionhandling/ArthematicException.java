
package exceptionhandling;

public class ArthematicException {

	public static void main(String[] args) {

		double result = 10.0 / 0;

		System.out.println("result" + result);
	}
}

// but in place of int we have float then the code is executed but in int it

// raised the exception this is

// beaCAUSE OF ieee 754DESIGN this makes floating point predictable across

// hardware and alows continuous calculations even e=when unsusal result occur