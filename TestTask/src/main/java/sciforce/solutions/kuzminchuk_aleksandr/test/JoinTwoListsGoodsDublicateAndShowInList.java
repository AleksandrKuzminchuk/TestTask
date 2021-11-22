package sciforce.solutions.kuzminchuk_aleksandr.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import sciforce.solutions.kuzminchuk_aleksandr.test.entity.Goods;

@Component
public class JoinTwoListsGoodsDublicateAndShowInList {

	public void joinTwoListShowGeneralAmount(List<Goods> fromFile, List<Goods> fromWeb) {
		List<Goods> raw = new ArrayList<>();
		raw.addAll(fromFile);
		raw.addAll(fromWeb);

		Map<String, Goods> toReturn = new HashMap<>();

		raw.forEach(rawGoods -> {
			if (toReturn.get(rawGoods.getProductName()) == null) {
				toReturn.put(rawGoods.getProductName(), rawGoods);
			} else {
				Goods toChange = toReturn.get(rawGoods.getProductName());
				int newAmount = toChange.getAmount() + rawGoods.getAmount();
				toReturn.get(rawGoods.getProductName()).setAmount(newAmount);

			}
		});

		for (Map.Entry<String, Goods> entry : toReturn.entrySet()) {

			System.out.println(entry.getKey() + " : " + entry.getValue().getAmount());

		}
	}

}
