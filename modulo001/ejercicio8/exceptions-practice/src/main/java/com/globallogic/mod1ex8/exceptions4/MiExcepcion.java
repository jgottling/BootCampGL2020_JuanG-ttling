package com.globallogic.mod1ex8.exceptions4;

public class MiExcepcion extends Exception {
	private static final long serialVersionUID = 3038497708495323755L;
	private String errorMessage = "mi excepción";
		
	private String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	public void showErrorMessage() {
		System.out.println(this.getErrorMessage());
	}

}
