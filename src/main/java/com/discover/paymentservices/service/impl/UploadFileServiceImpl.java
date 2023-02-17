package com.discover.paymentservices.service.impl;

import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.discover.paymentservices.exception.ScanFailedException;
import com.discover.paymentservices.service.UploadFileService;

@Service
public class UploadFileServiceImpl implements UploadFileService {

	@Override
	public String uploadFile(MultipartFile file) throws IOException, ScanFailedException {
		
		byte[] fileInBytes = file.getBytes();
		String fileName = file.getName();
		Object config = null;
		
		
		String scanResult = invokeScanService(fileInBytes, fileName, null);
		
		if(!scanResult.equalsIgnoreCase("")) {
			return saveDocument(fileName, scanResult, config, fileInBytes);
		}else {
			throw new ScanFailedException();
		}
		
	}
	
	private String invokeScanService(byte[] fileInBytes, String fileName, Object object) {
		// Invoke Scan Service
		return null;
	}
	
	private String saveDocument(String fileName, String scanResult, Object config, byte[] fileInBytes) {
		// call wrapper to get the document Id
		return null;
	}

}
