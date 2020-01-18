package ca.bc.gov.restxml;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class RetrieveXmlController {

	@RequestMapping(value = "/retrieve", method = RequestMethod.GET)
	@ResponseBody
	public RetrieveXmlResponse retrieveXml() {
		ResponseEntity<RetrieveXmlResponse> responseEntity = new RestTemplate()
				.getForEntity("http://jsonplaceholder.typicode.com/posts/1", RetrieveXmlResponse.class);
		return responseEntity.getBody();
	}

}
