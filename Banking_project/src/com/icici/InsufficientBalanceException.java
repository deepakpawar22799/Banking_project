package com.icici;

public class InsufficientBalanceException extends RuntimeException {
	private String message;
	public InsufficientBalanceException(String message) {
		this.message=message;
	}
	@Override
		public String getMessage() {
			return message;
	}
}
