package com.jdbc.exception;

public class RecordNotFoundException extends Exception {
	public RecordNotFoundException() {
		this("삭제 대상이 존재하지 않습니다.");
	}
	public RecordNotFoundException(String message) {
		super(message);
	}
}
