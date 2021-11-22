package sciforce.solutions.kuzminchuk_aleksandr.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import sciforce.solutions.kuzminchuk_aleksandr.test.entity.Goods;

@Component
public class DeserializationFile {

	Gson gson = new Gson();

	public List<Goods> DeserializationFileInList(String file) {
		
		List<Goods> goodsWithFileInList = new ArrayList<>();
		
		try (FileReader reader = new FileReader(file)) {

			Type type = new TypeToken<List<Goods>>() {
			}.getType();
			goodsWithFileInList = gson.fromJson(reader, type);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return goodsWithFileInList;
	}

}
