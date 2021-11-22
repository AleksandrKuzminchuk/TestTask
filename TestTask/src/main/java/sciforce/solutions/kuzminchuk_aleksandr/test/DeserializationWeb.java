package sciforce.solutions.kuzminchuk_aleksandr.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import sciforce.solutions.kuzminchuk_aleksandr.test.entity.Goods;

@Component
public class DeserializationWeb {
	
	@Autowired
	RestTemplate restTemplate;
	
	public List<Goods> DeserializationWebInList(String urlMessage){
		
		ResponseEntity<List<Goods>> responseEntity = restTemplate.exchange(urlMessage, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Goods>>() {
				});

		return new ArrayList<>(responseEntity.getBody());
	}

}
