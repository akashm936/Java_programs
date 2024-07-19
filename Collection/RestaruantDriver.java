//package com.CollectionSet;

import java.util.*;


public class RestaurantDriver {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Restaurant restaurant = new Restaurant();
		for (;;) {
			System.out.println(" ***** Welcome ***** ");
			System.out.println("1. Add Bill");
			System.out.println("2. Update Bill");
			System.out.println("3. Display All Bills ");
			System.out.println("4. Delete a Bill ");
			System.out.println("5. Exit ");

			System.out.println();
			System.out.println("Enter an Option ");
			int option = sc.nextInt();
			switch (option) {
			case 1: {
				restaurant.addBill();
				break;
			}
			case 2: {
				restaurant.updateBill();
				break;
			}
			case 3: {
				restaurant.displayBills();
				break;
			}
			case 4: {
				restaurant.deleteBill();
				break;
			}
			case 5: {
				System.exit(0);
			}
			default: {
				System.out.println("Wrong Option ");
			}
			}
		}
	}

}


class CustomerBill {

	static int custId = 1;
	static String custName;
	static long contactNumber;
	static ArrayList<String> food;
	double bill;
    
	public CustomerBill(String custName, long contactNumber, ArrayList<String> food, double bill) {
		super();
		this.custName = custName;
		this.contactNumber = contactNumber;
		this.food = food;
		this.bill = bill;
		
		custId++;
	}

	//@Override
//	public String toString() {
//		
//		return "";
//	}
	public String toString() {

		System.out.println("***** Customer Bill ");
		System.out.println();
		//System.out.println("Bill Number : "+ billNumber);
		System.out.println("Customer ID : "+ custId);
		System.out.println("Customer Name : " + custName);
		System.out.println("Contact Number : "+ contactNumber);
		System.out.println("Food Order : "+ food);
		System.out.println("total Bill : "+ bill + " rupaye");
//		return " ****** CustomerBill *****  \n [ custName = " + custName + "\n ContactNumber = " + contactNumber + "\n food = " + food
//				+ " ,\n bill = " + bill + " ] ";
		
		return " ";
	}

}

class Restaurant {
	List<CustomerBill> list = new ArrayList<>();

	Scanner sc = new Scanner(System.in);

	// creation of bill
	void addBill() {

		System.out.println();
		System.out.println(" ADD NEW  BILL");
		// (string custName, long constructor, String[] food, double bill)
		System.out.println(" Enter a customer Name : ");
		String custName = sc.nextLine();
		System.out.println("Contact Number");
		long contactNumber = sc.nextLong();
		System.out.println("Enter the Quantity of food ");

		ArrayList<String> food = new ArrayList<>();
		int qnty = sc.nextInt();

		sc.nextLine();

		for (int i = 1; i <= qnty; i++) {
			System.out.println("Enter the " + i + " Food and Price ");
			String item = sc.nextLine();
			food.add(item);
		}

		// bill generation logic

		double bill = 1;
		double[] bills = new double[food.size()];
		int indx = 0;

		for (String string : food) {
			String[] arr = string.split(" ");
			bills[indx++] = Double.parseDouble(arr[1]);
		}
		for (double d : bills) {

			bill += d;
		}
		CustomerBill bill2 = new CustomerBill(custName, contactNumber, food, bill);
		list.add(bill2);

		// display all the bills from the list
	}

	

	void displayBills() {
		ListIterator<CustomerBill> iterator = list.listIterator();

		System.out.println();
		// System.out.println(" ***** Customer Details List ****");
		// System.out.println();
		while (iterator.hasNext()) {
			CustomerBill bill = iterator.next();
			System.out.println();
			System.out.println(bill);
		}

	}

	// updation of bill from the list

	void updateBill() {
//		ListIterator<CustomerBill> iterator = list.listIterator();
//		System.out.println("Enter a bill Number : ");
//		int billNumber = sc.nextInt();
//		while (iterator.hasNext()) {
//			CustomerBill bill = iterator.next();
//			if (billNumber == (bill.billNumber)) {
//				// write a logic to update the bill
//				System.out.println(bill);
//			}
			System.out.println("What your want to updated ");
			System.out.println("1. Customer Name  ");
			System.out.println("2. Contact Number  ");
			System.out.println("3. Food Order ");
			
			int option1 = sc.nextInt();
			switch(option1)
			{
			case 1:{
				System.out.println("Enter new Customer Name :");
				sc.nextLine();
				String newName = sc.nextLine();
			    
//				System.out.println("Customer Name :" + newName);
				CustomerBill.custName = newName;
				break;
			}
			case 2:{
				System.out.println("Enter Contact No : ");
				long NewNum = sc.nextLong();
				
				CustomerBill.contactNumber = NewNum; 
				break;
			}
			case 3:{
				System.out.println("Update Food list :");
				//ArrayList<String> NewFood = new ArrayList<>();
				
				System.out.println("Enter the Quantity of food ");

				ArrayList<String> newfood = new ArrayList<>();
				int newqnty = sc.nextInt();

				sc.nextLine();
				
				for(int i=0;i<=newqnty;i++) {
					System.out.println("Enter "+ i +"Food");
					String newItem = sc.nextLine(); 
					newfood.add(newItem);
				}
				
				//this is remaining
//				double newbills = new double[newfood.size()];
//				int newindx = 0;
//
//				for (String string : newfood) {
//					String[] arr = string.split(" ");
//					newbills[newindx++] = Double.parseDouble(arr[1]);
//				}
//				for (double d : newbills) {
//
//					newbills += d;
//				}
//                
				CustomerBill.food.addAll(newfood);
				
				break;
			  }
		      default:{

		      	System.out.println("Wrong Option!!!! ");
			
		      }
		}
	}
	// remove a bill from the list
	 ListIterator<CustomerBill> iterator = list.listIterator();

	void deleteBill() {

		System.out.println("Enter a bill Number to Delete a Bill ");
		int billNumber = sc.nextInt();

		// while (iterator.hasNext()) {
		// 	CustomerBill bill = iterator.next();
		// 	if (billNumber == (bill.billNumber)) {

		// 		iterator.remove();
		// 	}
		// }
	}

}
