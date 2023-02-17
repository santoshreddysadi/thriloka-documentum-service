package com.discover.paymentservices.service.impl;

import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.discover.paymentservices.constants.Constants;
import com.discover.paymentservices.exception.ScanFailedException;
import com.discover.paymentservices.service.UploadFileService;

@Service
public class UploadFileServiceImpl implements UploadFileService {

	@Override
	public String uploadFile(MultipartFile file) throws IOException, ScanFailedException {

		byte[] fileInBytes = file.getBytes();
		String fileName = file.getOriginalFilename();
		String scanResult = invokeScanService(fileInBytes, fileName);
		if (!Constants.SCAN_NVF.equalsIgnoreCase(scanResult)) {
			return saveDocument(fileName, scanResult, fileInBytes);
		} else {
			throw new ScanFailedException();
		}

	}

	private String invokeScanService(byte[] fileInBytes, String fileName) {
		// Invoke Scan Service
		return null;
	}

	private String saveDocument(String fileName, String scanResult, byte[] fileInBytes) {
		// call wrapper to get the document Id
		return null;
	}

}
