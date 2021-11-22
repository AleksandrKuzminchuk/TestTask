package sciforce.solutions.kuzminchuk_aleksandr.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import sciforce.solutions.kuzminchuk_aleksandr.test.entity.Goods;
import sciforce.solutions.kuzminchuk_aleksandr.test.exeption_handling.DublicateGoodsException;

@Component
public class CheckTwoDatasourceOnDublicate {

	public List<Goods> joinTwoListCheckOnDublicate(List<Goods> fromFile, List<Goods> fromWeb) {
		List<Goods> raw = new ArrayList<>();
		raw.addAll(fromFile);
		raw.addAll(fromWeb);

		Map<String, Goods> toReturn = new HashMap<>();

		raw.forEach(rawGoods -> {
			if (toReturn.get(rawGoods.getProductUuid()) == null) {
				toReturn.put(rawGoods.getProductUuid(), rawGoods);
			} else {
				throw new DublicateGoodsException("This product: " + rawGoods.getProductName() + " already exists in the list");

			}
		});

		for (Map.Entry<String, Goods> entry : toReturn.entrySet()) {

			System.out.println(entry.getKey() + " : " + entry.getValue().getAmount());

		}

		return new ArrayList<>(toReturn.values());
		
	}

}
