package sciforce.solutions.kuzminchuk_aleksandr.test;

import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import sciforce.solutions.kuzminchuk_aleksandr.test.entity.Goods;

@Component
public class SerializationObject {
	
	ObjectMapper mapper = new ObjectMapper();
	
	public void SerializationInJSON(List<Goods> list) {
		
		String amountAllJoinedGoodsInJSON = "";
		
		try {
			amountAllJoinedGoodsInJSON = mapper.writeValueAsString(list);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		System.out.println(amountAllJoinedGoodsInJSON);
		
	}

}
