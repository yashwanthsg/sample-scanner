package scan;

import java.util.Scanner;

public class Scan {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int empId = sc.nextInt();
	System.out.println("Enter ur ID num" +empId);
	System.out.println("Pls Enter ur Name");
	String empName = sc.nextLine();
	System.out.println("yashwanth"+empName);
	System.out.println("Enter ur Salary");
	float empSal = sc.nextFloat();
	System.out.println("15,000"+empSal);
	
	}

}
