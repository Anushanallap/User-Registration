package UserRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationMain {

		static Scanner scan = new Scanner(System.in);
		public static boolean firstname() throws InvalidUserInputException {
			System.out.println("Enter first name : ");
			String name = scan.next();
			String regex = "[A-Z]{1}[a-z]{2,8}";
			Pattern pattern = Pattern.compile(regex);
			Matcher ma = pattern.matcher(name);
			
			if (name != null) {
				if (ma.matches() == true) {
					System.out.println("The given first name is : " +name + "->" + ma.matches());
					return ma.matches();
				}
			}
			throw new InvalidUserInputException();
		}
		
		
		public static boolean lastname() throws InvalidUserInputException {
			
			System.out.println("Enter last name : ");
			String name = scan.next();
			String regex = "[A-Z]{1}[a-z]{2,8}";
			Pattern  pattern= Pattern.compile(regex);
			Matcher ma = pattern.matcher(name);
			if (name != null) {
				if (ma.matches() == true) {
					System.out.println("The given last name is : " +name + "->" + ma.matches());
					return ma.matches();
				}
			}
			throw new InvalidUserInputException();
		}
		
		public static boolean email(String email) throws InvalidUserInputException {
//			System.out.println("Enter email address : ");
//			String email = scan.next();
			String regex = "^[A-Za-z0-9.+-]+@[a-z0-9]+[.][a-z]+$";
			Pattern pattern = Pattern.compile(regex);
			Matcher ma = pattern.matcher(email);
			if (email != null) {
				if (ma.matches() == true) {
					System.out.println("The given email is : " +email + "->" + ma.matches());
					return ma.matches();
				}
			}
			throw new InvalidUserInputException();
		}
		
		public static boolean mobilenumber() throws InvalidUserInputException {
			System.out.println("Enter mobile number : ");
			String number = scan.next();
			String regex = "(91)?[6-9][0-9]{9}";
			Pattern pattern = Pattern.compile(regex);
			Matcher ma = pattern.matcher(number);
			
			if (number != null) {
				if (ma.matches() == true) {
					System.out.println("The enter mobile number is : " +number + "->" + ma.matches());
					return ma.matches();
				}
			}
			throw new InvalidUserInputException();
		}
		
		public static boolean Rule1() throws InvalidUserInputException {
			System.out.println("Enter the minimum 8 character password : ");
			String ch = scan.next();
			String regex = "[A-Za-z]{8,}";
			Pattern pattern = Pattern.compile(regex);
			Matcher ma = pattern.matcher(ch);
			System.out.println("The character password is : " +ch + "->" + ma.matches());
			if (ch != null) {
				if (ma.matches() == true) {
					System.out.println("The character password is : " +ch + "->" + ma.matches());
					return ma.matches();
				}
			}
			throw new InvalidUserInputException();
		}
		
		public static boolean Rule2() throws InvalidUserInputException {
			System.out.println("Enter the at least 1 Upper case : ");
			String uc = scan.next();
			String regex = "(?=.*[a-z])(?=.*[A-Z]){8,}.*";
			Pattern pattern = Pattern.compile(regex);
			Matcher ma = pattern.matcher(uc);
			System.out.println("The Upper case is : " +uc + "->" + ma.matches());
			if (uc != null) {
				if (ma.matches() == true) {
					System.out.println("The Upper case is : " +uc + "->" + ma.matches());
					return ma.matches();
				}
			}
			throw new InvalidUserInputException();
		}
		
		public static boolean Rule3() throws InvalidUserInputException {
			System.out.println("Enter the at least 1 numeric number in password : ");
			String numeric = scan.next();
			final String regex = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]){8,}.*";
			Pattern pattern = Pattern.compile(regex);
			Matcher ma = pattern.matcher(numeric);
			
			if (numeric != null) {
				if (ma.matches() == true) {
					System.out.println("The numeric number is: " +numeric + "->" + ma.matches());
					return ma.matches();
				}
			}
			throw new InvalidUserInputException();
		}
		
		public static boolean Rule4() throws InvalidUserInputException {
			System.out.println("Enter the 1 special character : ");
			String specialchar = scan.next();
			final String regex = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[-+(){}_!@#$%^&*., ?]){8,}.*";
			Pattern pattern = Pattern.compile(regex);
			Matcher ma = pattern.matcher(specialchar);
			
			if (specialchar != null) {
				if (ma.matches() == true) {
					System.out.println("special character : " +specialchar + "->" + ma.matches());
					return ma.matches();
				}
			}
			throw new InvalidUserInputException();
		}
		
		

	}


