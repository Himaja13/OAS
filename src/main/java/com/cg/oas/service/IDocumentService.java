package com.cg.oas.service;

import java.util.ArrayList;

import com.cg.oas.entities.Branch;
import com.cg.oas.entities.Document;

public interface IDocumentService {

	public Document addDocument( Document document);
	public ArrayList<Document> viewAllDocumentDetails();
	public int deleteDocumentById(int documentId);
	public Document getDocumentById(int docId);
	//public Document getDocumentByApplicantId(int applicationId);
	//public Document getDocumentByEmailId(String emailId);
	//public int deleteDocumentByEmail(String email);
	//public int deleteDocumentByApplicationId(int applicationId);
	public int  updateDocument(Document docs);
}
