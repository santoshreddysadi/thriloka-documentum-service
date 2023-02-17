package com.discover.paymentservices.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.discover.paymentservices.model.DownloadFileResponse;
import com.discover.paymentservices.model.UploadFileResponse;
import com.discover.paymentservices.service.DownloadFileService;
import com.discover.paymentservices.service.UploadFileService;

@RestController
public class DocumentumScanController {

	@Autowired
	UploadFileService uploadFileService;

	@Autowired
	DownloadFileService downloadFileService;

	@PostMapping("/uploadToDocumentum")
	public ResponseEntity<UploadFileResponse> uploadDocument(@RequestParam MultipartFile file) throws IOException {

		return null;

	}

	@PostMapping("/downloadFromDocumentum")
	public ResponseEntity<DownloadFileResponse> downloadFromDocumentum(@PathVariable String documentId)
			throws IOException {

		return null;

	}

}
