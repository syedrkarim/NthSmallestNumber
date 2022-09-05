package smallestnumber;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class NthSmallest {
	public static void nthSmallestNumber(int n) {

		Set<Integer> set = new HashSet<Integer>();
		Random rand = new Random();

		while (set.size() < 500) {
			set.add(1 + rand.nextInt((1000)));
		}
		int x = set.size();
		int[] number = new int[x];

		int temp;
		int k = 0;
		for (int a : set)
			number[k++] = a;
		System.out.println("Total Number: " + number.length);

		for (int p : number) {
			System.out.println(p);
		}

		for (int i = 0; i < number.length; i++) {
			for (int j = i + 1; j < number.length; j++) {
				if (number[i] > number[j]) {
					temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}
		}
		System.out.println("Smallest number of that position is: " + number[n - 1]);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Nth position to get smallest number: ");
		int position = sc.nextInt();
		NthSmallest.nthSmallestNumber(position);
		sc.close();
	}
}
