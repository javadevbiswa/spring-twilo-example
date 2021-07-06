package com.example.demo.service;

import java.util.Random;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

/**
 * 
 * @author biswa
 *
 */

public class SmsService {

	private static final String SID = "ACf162368661e739209667875f0177e5ea";

	private static final String AUTH_TOKEN = "555786f7dc6241cdba44ee4e597f96eb";

	static {
		Twilio.init(SID, AUTH_TOKEN);
	}

	public static int sendOtp(String toMobileNumber, String message) {
		Random random = new Random();
		int otp = random.nextInt(1000);

		Message messsage = Message.creator(new PhoneNumber(toMobileNumber), new PhoneNumber("+15406666355"),
				message + String.valueOf(otp)).create();

		System.out.println("Message sent Successfully to mobile Number " + toMobileNumber);

		return otp;
	}
}
