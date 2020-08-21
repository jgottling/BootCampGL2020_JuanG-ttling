package com.globallogic.bootcampgl.vehiculo.exceptions;

public class EmptyValueException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3132915112889533634L;

	public EmptyValueException(String valueName) {
		super("\n " + valueName + "cannot be empty" );
	}
}
