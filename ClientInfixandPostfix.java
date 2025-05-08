package infixandPostfix;

import java.util.Scanner;

public class ClientInfixandPostfix {

	public static void main(String[] args) {
		String infix, postfix;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Enter Infix Expression: ");
			infix = sc.next();

			InfixandPostfix s = new InfixandPostfix(infix.length());
			postfix = s.Infix_Postfix(infix);
			if (postfix != null) {
				System.out.println("\n Postfix:: " + postfix);
			} else {
				System.out.println("Null");
			}

			System.out.println("\n new expression?(yes/no)");
			infix = sc.next();
		} while (!infix.equals("no"));

	}

}
