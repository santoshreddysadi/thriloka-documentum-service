package com.discover.paymentservices.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.discover.paymentservices.exception.ScanFailedException;

public interface UploadFileService {
	
	public String uploadFile(MultipartFile file) throws IOException, ScanFailedException;
	
}
