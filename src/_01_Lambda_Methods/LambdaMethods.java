package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.

		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s) -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");

		// 2. Call the printCustonMessage method using a lambda so that the String
		// prints backwards.
		printCustomMessage((s) -> {
			char[] c = s.toCharArray();
			String s1 = "";
			for (int i = c.length - 1; i >= 0; i--) {
				s1 += c[i];
			}
			System.out.println(s1);
		}, "whoopee");

		// 3. Call the printCustonMessage method using a lambda so that the String
		// prints with a mix between upper an lower case characters.
		printCustomMessage((s) -> {
			s.toLowerCase();
			char[] c = s.toCharArray();
			String s1 = "";
			for (int i = 0; i < c.length; i += 2) {
				c[i] = Character.toUpperCase(c[i]);
			}
			for (int i = 0; i < c.length; i++) {
				s1 += c[i];
			}
			System.out.println(s1);
		}, "whoopee");
		// 4. Call the printCustonMessage method using a lambda so that the String
		// prints with a period in between each character.
		printCustomMessage((s) -> {
			char[] c = s.toCharArray();
			String s1 = "";
			for (int i = 0; i < c.length; i++) {
				s1 += c[i] + ".";
			}
			System.out.println(s1);
		}, "whoopee");
		// 5. Call the printCustonMessage method using a lambda so that the String
		// prints without any vowels.
		printCustomMessage((s) ->{
			char[] c = s.toCharArray();
			String s1 = "";
			for (int i = 0; i < c.length; i++) {
				if(!(c[i] == 'a' || c[i] == 'i'|| c[i] == 'o'|| c[i] == 'u'|| c[i] == 'e')) {
				s1 += c[i] + ".";
				}
			}
			System.out.println(s1);
		}, "whoopee");
	}

	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
