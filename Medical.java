import java.util.*;

public class Medical {

	int choice;
	Scanner s = new Scanner(System.in);
	int c1, c2, c3, c4;

	void calc() {

		float total;
		int q;

		while (true) {
			System.out.println("\t**WELCOME TO SAI MEDICAL/t");
			System.out.println("Please select your order from the Menu  :   ");
			System.out.println("1)Tablet");
			System.out.println("2)Syrup");
			System.out.println("3)Pet Food");
			System.out.println("4)Ayurvedic");
			System.out.println("5)Exit");
			choice = s.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Section you have selected is TABLET SECTION");
				System.out.println("Please select from below : ");
				System.out.println("1)Headache Tablets");
				System.out.println("2)Body-ache  Tablets");
				System.out.println("3)Stomach-ache Tablets");
				c1 = s.nextInt();
				switch (c1) {
				case 1:
					System.out.println("Selected item is :");
					System.out.println("Headache Tablets");
					System.out.println("Price = Rs 100/-");
					System.out.println("Please enter the quantity");
					q = s.nextInt();
					System.out.println("Quantity is :  " + q);
					total = q * 100;
					System.out.println("Total bill is : " + total);
					break;

				case 2:
					System.out.println("Selected item is :");
					System.out.println("Body-ache  Tablets");
					System.out.println("Price = Rs 100/-");
					System.out.println("Please enter the quantity");
					q = s.nextInt();
					System.out.println("Quantity is :  " + q);
					total = q * 100;
					System.out.println("Total bill is : " + total);
					break;

				case 3:
					System.out.println("Selected item is :");
					System.out.println("Stomach-ache  Tablets");
					System.out.println("Price = Rs 100/-");
					System.out.println("Please enter the quantity");
					q = s.nextInt();
					System.out.println("Quantity is :  " + q);
					total = q * 100;
					System.out.println("Total bill is : " + total);
					break;

				}
				break;

			case 2:
				System.out.println("Section you have selected is SYRUP SECTION");
				System.out.println("Please select from below : ");
				System.out.println("1)Cough Syrup");
				System.out.println("2)Acidity Liquid");
				c1 = s.nextInt();

				switch (c1) {
				case 1:
					System.out.println("Selected item is :");
					System.out.println("Cough syrup");
					System.out.println("Price = Rs 150/-");
					System.out.println("Please enter the quantity");
					q = s.nextInt();
					System.out.println("Quantity is :  " + q);
					total = q * 150;
					System.out.println("Total bill is : " + total);
					break;
				case 2:
					System.out.println("Selected item is :");
					System.out.println("Acidity Syrup");
					System.out.println("Price = Rs 150/-");
					System.out.println("Please enter the quantity");
					q = s.nextInt();
					System.out.println("Quantity is :  " + q);
					total = q * 150;
					System.out.println("Total bill is : " + total);
					break;
				}
				break;

			case 3:
				System.out.println("Section you have selected is PET SECTION");
				System.out.println("Please select from below : ");
				System.out.println("1)Pedigree");
				System.out.println("2)Pet Wash");
				c1 = s.nextInt();

				switch (c1) {
				case 1:
					System.out.println("Selected item is :");
					System.out.println("Pedigree");
					System.out.println("Price = Rs 200/-");
					System.out.println("Please enter the quantity");
					q = s.nextInt();
					System.out.println("Quantity is :  " + q);
					total = q * 200;
					System.out.println("Total bill is : " + total);
					break;
				case 2:
					System.out.println("Selected item is :");
					System.out.println("Pet Wash");
					System.out.println("Price = Rs 200/-");
					System.out.println("Please enter the quantity");
					q = s.nextInt();
					System.out.println("Quantity is :  " + q);
					total = q * 200;
					System.out.println("Total bill is : " + total);
					break;
				}
				break;

			case 4:
				System.out.println("Section you have selected is AYURVEDA");
				System.out.println("Please select from below : ");
				System.out.println("1)Ayurvedic Khada");
				System.out.println("2)Ayurvedic Soap");
				c1 = s.nextInt();
				switch (c1) {
				case 1:
					System.out.println("Selected item is :");
					System.out.println("Ayurvedic Kadha");
					System.out.println("Price = Rs 150/-");
					System.out.println("Please enter the quantity");
					q = s.nextInt();
					System.out.println("Quantity is :  " + q);
					total = q * 150;
					System.out.println("Total bill is : " + total);
				case 2:
					System.out.println("Selected item is :");
					System.out.println("Ayurvedic soap");
					System.out.println("Price = Rs 150/-");
					System.out.println("Please enter the quantity");
					q = s.nextInt();
					System.out.println("Quantity is :  " + q);
					total = q * 150;
					System.out.println("Total bill is : " + total);
					break;
				}
				break;

			case 5:
				System.out.println("\t**THANK YOU\t");
				System.exit(0);

			default:
				System.out.println("Wrong Choice");

			}
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Medical m = new Medical();
		m.calc();
	}
