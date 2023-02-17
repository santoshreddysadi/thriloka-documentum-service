package com.discover.paymentservices.exception;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.discover.paymentservices.model.ResponseError;

@ControllerAdvice
public class FileServiceExceptionAdvisor extends ResponseEntityExceptionHandler {

	@ExceptionHandler(ScanFailedException.class)
	public ResponseEntity<Object> handleScanFailedException(ScanFailedException exception) {
		List<String> details = new ArrayList<>();
		details.add(exception.getMessage());
		// Need to customize according to the structure of the response being provided
		ResponseError responseError = new ResponseError(LocalDateTime.now(), "File Not Found", details);
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(responseError);
	}

}
