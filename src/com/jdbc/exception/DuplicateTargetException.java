package com.jdbc.exception;

public class DuplicateTargetException extends Exception{
	public DuplicateTargetException() {
		this("이미 존재하는 대상입니다.");
	}
	
	public DuplicateTargetException(String message) {
		super(message);
	}
}
