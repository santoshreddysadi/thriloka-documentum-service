package com.discover.paymentservices.model;

import java.time.LocalDateTime;

public class DownloadFileResponse extends FileServiceResponse {

	public DownloadFileResponse(LocalDateTime timestamp, String message) {
		super(timestamp, message);
	}

}
