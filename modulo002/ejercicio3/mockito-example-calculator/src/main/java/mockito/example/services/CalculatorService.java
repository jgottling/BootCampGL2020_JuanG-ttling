/**
 * 
 */
package mockito.example.services;

import mockito.example.customExceptions.CustomException;

public interface CalculatorService {

	double calculateSum(int a, int b);
	double calculateSubstraction(int a, int b);
	double calculateDivision(int a, int b) throws CustomException;
	double calculateMultiplication(int a, int b);
	double calculateAverage();
	boolean isOdd(int a);
	String printResult(double result);
}
