package main_class;

import java.util.Scanner;

public class CRUD_Calling {

	public static void main(String[] args) {
		CRUD_Codeing cod = new CRUD_Codeing();

		Scanner s = new Scanner(System.in);

		while (true) {

			System.out.println("                 1      Insert Data");
			System.out.println("                 2      Update Data");
			System.out.println("                 3      delete Data");
			System.out.println("                 4      view one");
			System.out.println("                 5      view All");
			System.out.println("                 0      Exit app ");
			System.out.println("---------------------------------------------------------");

			switch (s.nextInt()) {

			case 1:
				cod.insert();
				break;
			case 2:
				cod.update();
				break;
			case 3:
				cod.delete();
				break;
			case 4:
				cod.view1();
				break;
			case 5:
				cod.viewAll();
				break;
			case 0:
				cod.Exit();
				s.close();
				return;

			default:
				System.out.println("Default Value.....");

			}

		}

	}
}
