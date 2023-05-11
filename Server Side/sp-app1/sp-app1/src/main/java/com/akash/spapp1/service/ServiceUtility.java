package com.akash.spapp1.service;

public class ServiceUtility {
	public static String getActivationCode() {
		StringBuffer activationCode = new StringBuffer();
		String alphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" +"abcdefghijklmnopqrstuvwxyz";
		int index;
		for(int i = 0; i < 40; i++) {
			index = (int) (alphaNumericString.length() * Math.random());
			activationCode.append(alphaNumericString.charAt(index));
		}
		return activationCode.toString();
	}
}
