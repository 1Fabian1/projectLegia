package pl.Legia.services;


import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import pl.Legia.model.User;

import java.util.List;

public class SendEmail {
    private String singleAddress = null;

    public void sendEmail(String subject, String message, List<User> users) throws EmailException {
        Email email = new SimpleEmail();
        for (int i = 0; i < users.size(); i++) {
            singleAddress = users.get(i).getEmail();

            email.setHostName("smtp.googlemail.com");
            email.setSmtpPort(465);
            email.setAuthenticator(new DefaultAuthenticator("tester1234xd", "Qwerty123#"));
            email.setSSLOnConnect(true);
            email.setFrom("tester1234xd@gmail.com");
            email.setSubject(subject);
            email.setMsg(message);
            email.addTo(singleAddress);

            singleAddress = null;

        }
        email.send();
    }
}
