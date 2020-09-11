package mockito.example.services.impl;

import mockito.example.services.BasicOperationsService;

public class BasicOperationsServiceImpl implements BasicOperationsService {

	@Override
	public double add(double input1, double input2) {
		return input1 + input2;
	}

	@Override
	public double substract(double input1, double input2) {
		return input1 - input2;
	}

	@Override
	public double multiply(double input1, double input2) {
		return input1 * input2;
	}

	@Override
	public double divide(double input1, double input2) {
		return input1 / input2;
	}

}
