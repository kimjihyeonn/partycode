package com.company.Spring_Annotation_Board.common;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordEncryptUtil {
	//암호화 시키는 메소드구현
	
	public static String encryptSHA256(String plainText)
	throws NoSuchAlgorithmException, UnsupportedEncodingException{
		
		String sha256 = "";
		try {
			MessageDigest mdSHA256 = MessageDigest.getInstance("SHA-256");
			mdSHA256.update(plainText.getBytes("EUC-KR"));
			
			byte[] sha256Hash = mdSHA256.digest();
			
			StringBuffer hexSHA256hash = new StringBuffer();
			
			for(byte b: sha256Hash) {
				String hexString = String.format("%02x", b);
				hexSHA256hash.append(hexString);
			}
			sha256 = hexSHA256hash.toString();
			
		}catch(NoSuchAlgorithmException e) {e.printStackTrace();}
	catch(UnsupportedEncodingException ex) {ex.printStackTrace();}
		
		
	 return sha256;
	}
}


