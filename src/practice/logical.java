package practice;

import java.util.Arrays;
import java.util.Scanner;

import org.openqa.selenium.devtools.v102.systeminfo.SystemInfo;

public class logical {
	public static void main(String[] args) {

		int no = 13;
		int count = 0;
		for (int i = 2; i < no; i++) {
			if (no % i ==0) {
				count++;
				break;
			}
		}
			if (count == 1) {
				System.out.println("not prime");

			} else {
				System.out.println("prime no");
			}
		}

	}


