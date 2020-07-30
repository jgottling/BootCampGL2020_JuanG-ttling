/**
 * 
 */
package mockito.example.services;

public interface CalculatorService {

	double calculateSum(int a, int b);
	double calculateSubstraction(int a, int b);
	double calculateDivision(int a, int b);
	double calculateMultiplication(int a, int b);
	double calculateAverage();
	boolean isOdd(int a);
	String printResult(double result);
}
