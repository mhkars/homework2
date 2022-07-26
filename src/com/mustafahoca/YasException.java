package com.mustafahoca;

public class YasException extends RuntimeException {

	String msj;

	public YasException() {
		// TODO Auto-generated constructor stub
	}

	public YasException(String msj) {
		super();
		this.msj = msj;
	}

	public String getMsj() {
		return msj;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return getMsj();
	}

}
