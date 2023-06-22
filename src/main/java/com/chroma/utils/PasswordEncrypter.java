package com.chroma.utils;

public class PasswordEncrypter {
    
    public static void main(String[] args) {
		String pwd = "123456";
		System.out.println(EncryptionUtils.encrypt(pwd));
	}

}
