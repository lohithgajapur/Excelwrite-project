package Com.qa.client;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestClient {
	
	//get call from postman
	
	public void GetCall(String url) throws ClientProtocolException, IOException {
		CloseableHttpClient httpclient=HttpClients.createDefault();
		HttpGet httpget=new HttpGet(url);
	//lohith
		CloseableHttpResponse closeablehttpresponse=httpclient.execute(httpget);
		int responsestatuscode=closeablehttpresponse.getStatusLine().getStatusCode();
		System.out.println("responsestatuscode: "+responsestatuscode);
		
		String response=EntityUtils.toString(closeablehttpresponse.getEntity(),"UTF-8");
		System.out.println("ClientResponse: "+response);
		JSONObject jsonobject= new JSONObject(response);
		
		System.out.println("jsonobject: "+jsonobject);
		
		
	}

}
