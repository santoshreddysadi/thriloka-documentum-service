package com.discover.paymentservices.controller;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.discover.paymentservices.model.UploadFileResponse;
import com.discover.paymentservices.service.UploadFileService;

@RestController
public class DocumentumScanController {
	
	@Autowired
	UploadFileService uploadFileService;
	
	@PostMapping
	public ResponseEntity<UploadFileResponse> uploadDocument(@RequestParam MultipartFile file) throws IOException{
		
		return null;
		
	}
}
