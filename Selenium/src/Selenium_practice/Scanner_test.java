package Selenium_practice;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.WebDriver;

public class Scanner_test {

	public static void main(String[] args) {
		Scanner BB=new Scanner(System.in);
		System.out.println("first digit");
		
		int A=BB.nextInt();
		System.out.println("second digit");
		int B=BB.nextInt();
		System.out.println("total");
		int Sum=A+B;
		System.out.println(Sum);
	}

}
