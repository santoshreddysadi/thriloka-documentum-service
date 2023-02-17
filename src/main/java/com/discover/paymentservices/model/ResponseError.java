package com.discover.paymentservices.model;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ResponseError {

	public ResponseError(LocalDateTime timestamp, String message, List<String> errors) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.errors = errors;
	}

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
	private LocalDateTime timestamp;
	private String message;
	private List<String> errors;

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<String> getErrors() {
		return errors;
	}

	public void setErros(List<String> errors) {
		this.errors = errors;
	}

}
