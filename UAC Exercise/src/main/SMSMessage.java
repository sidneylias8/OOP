package main;

public class SMSMessage extends Message {

	public SMSMessage(ILogin iLogin, String sender, String recipient, String content) {
		super(iLogin, sender, recipient, content);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void send(String username, String password) {
		if(iLogin.authenticate(username, password)) {
			System.out.println("SMS sent from " + sender + " to " + recipient + ": " + content);
		}else {
			System.out.println("SMS authentication failed for user: " + username);
		}
	}

	
}
