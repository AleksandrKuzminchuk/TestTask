package sciforce.solutions.kuzminchuk_aleksandr.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.stereotype.Component;


import sciforce.solutions.kuzminchuk_aleksandr.test.entity.Goods;

@Component
public class JoinTwoListsGoodsAndJoinDublicate {

	public List<Goods> joinTwoListsAndDublicate(List<Goods> fromFile, List<Goods> fromWeb) {

		List<Goods> raw = new ArrayList<>();
		raw.addAll(fromFile);
		raw.addAll(fromWeb);

		Map<String, Goods> toReturn = new HashMap<>();

		raw.forEach(rawGoods -> {
			if (toReturn.get(rawGoods.getProductUuid()) == null) {
				toReturn.put(rawGoods.getProductUuid(), rawGoods);
			} else {
				Goods toChange = toReturn.get(rawGoods.getProductUuid());
				int newAmount = toChange.getAmount() + rawGoods.getAmount();
				toReturn.get(rawGoods.getProductUuid()).setAmount(newAmount);

			}
		});

		return new ArrayList<>(toReturn.values());
	}

}
