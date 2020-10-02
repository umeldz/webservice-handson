package com.handson.operations;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.handson.operations.entity.*;

public class Operations {

	public static String squared_root(int n) {
		SquareRoot square_root = new SquareRoot();
		Gson json = new Gson();
		String result = "";

		square_root.setNumber(n);
		square_root.setRoot(Math.sqrt(n));

		result = json.toJson(square_root);

		return result;
	}

	public static Power power(int n) {
		Power power = new Power();
		double result = 0;
		power.setBase(n);

		result = Math.pow(power.getBase(), power.getPower());
		power.setResult(result);

		return power;
	}

	public static String euler(int n) {
		Euler euler = new Euler();
		Gson json = new Gson();
		String json_result = "";

		euler.setNumber(n);
		euler.setResult(Math.exp(n));

		json_result = json.toJson(euler);

		return json_result;
	}

	public static String fibonacci(int n) {
		String html_fibonnaci = " <!DOCTYPE html>\r\n" + "<html lang=\"en\">\r\n" + "<head>\r\n"
				+ "    <title>Fibonnaci</title>\r\n" + "</head>\r\n" + "<body>\r\n" + "<h1>Fibonnaci</h1>";

		int fibo1 = 1;
		int fibo2 = 1;

		html_fibonnaci += "<p>" + fibo1 + "</p>";
		for (int i = 2; i <= n; i++) {
			html_fibonnaci += "<p>" + fibo2 + "</p>";
			fibo2 = fibo1 + fibo2;
			fibo1 = fibo2 - fibo1;
		}

		html_fibonnaci += "</body>\r\n" + "</html>";

		return html_fibonnaci;
	}

	public static String random_numbers(int n, int min, int max) {

		List<Integer> random_list = new ArrayList<>();
		Gson json = new Gson();
		String json_result = "";

		for (int i = 0; i < n; i++) {
			random_list.add((int) ((Math.random() * (max - min)) + min));
		}

		json_result = json.toJson(random_list);

		return json_result;
	}

	public static boolean isPrime(int n) {

		boolean isItPrime = true;
		
		if (n <= 1) {
			isItPrime = false;
			return isItPrime;
		} else {
			for (int i = 2; i <= n / 2; i++) {
				if ((n % i) == 0) {
					isItPrime = false;
					break;
				}
			}
		}
		
		return isItPrime;
	}
	
	public static String division(int divisor, int dividend) {
		Division division = new Division();
		Gson json = new Gson();
		String division_result = "";
		
		division.setDivisor(divisor);
		division.setDividend(dividend);
		division.setResult(dividend/divisor);
		
		division_result = json.toJson(division);
	
		return division_result;
	}
	
	public static Binary binary(int n) {
		
		Binary binary = new Binary();
		String binary_str = Integer.toBinaryString(n);
		binary.setNumber(n);
		binary.setBinary(binary_str);
		
		
		return binary;
	}
	
	
	
}
