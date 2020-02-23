package RestApiTryTests.Rest;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

import Com.qa.client.RestClient;

public class ApiTests extends TestBase{

	public static void main(String [] args) throws ClientProtocolException, IOException {
		String url="https://restcountries.eu/rest/v2/alpha/ind";
		RestClient r=new RestClient();
		r.GetCall(url);
		
		
	}
}
