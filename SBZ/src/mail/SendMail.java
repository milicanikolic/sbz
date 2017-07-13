package mail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {

	private String from;
	private String to;
	private String subject;
	private String text;

	public SendMail(String to, String subject, String text){
		this.from = "sistemisbz@gmail.com";
		this.to = to;
		this.subject = subject;
		this.text = text;
	}

	public void send(){

		Properties props = new Properties();
	

		String host = "smtp.gmail.com";

		String port = "465";

		props.put("mail.smtp.host", host);

		props.put("mail.smtp.auth", "true");

		props.put("mail.smtp.port", port);

		props.put("mail.smtp.socketFactory.port", port);

		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

		props.put("mail.smtp.socketFactory.fallback", "false");

		Session mailSession = Session.getInstance(props, new javax.mail.Authenticator() {

			protected PasswordAuthentication getPasswordAuthentication() {

			return new PasswordAuthentication("sistemisbz@gmail.com", "sistemisbz123");

			}

			});
		Message simpleMessage = new MimeMessage(mailSession);

		InternetAddress fromAddress = null;
		InternetAddress toAddress = null;
		try {
			fromAddress = new InternetAddress(from);
			toAddress = new InternetAddress(to);
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			simpleMessage.setFrom(fromAddress);
			simpleMessage.setRecipient(RecipientType.TO, toAddress);
			simpleMessage.setSubject(subject);
			simpleMessage.setText(text);

			Transport.send(simpleMessage);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	
	
