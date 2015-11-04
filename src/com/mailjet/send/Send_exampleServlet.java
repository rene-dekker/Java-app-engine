package com.mailjet.send;

import java.io.IOException;

import javax.servlet.http.*;

import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.resource.Contact;

@SuppressWarnings("serial")
public class Send_exampleServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		
		String apiKey = "85480869a17b7d13ef8bd393283d40d9";
		String apiSecret = "7ebd58e70a16291548a02d6fcfe9b4a1";
		
		MailjetClient client = new MailjetClient(apiKey, apiSecret);
		MailjetRequest request = new MailjetRequest(Contact.resource);
		MailjetResponse response = null;
		try {
			response = client.get(request);
		} catch (MailjetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		resp.setContentType("text/plain");
		resp.getWriter().println(response.toString());
	}
}
