package com.discover.paymentservices.model;

import java.time.LocalDateTime;

public class UploadFileResponse extends FileServiceResponse {

	public UploadFileResponse(LocalDateTime timestamp, String message) {
		super(timestamp, message);
	}

}
