package sciforce.solutions.kuzminchuk_aleksandr.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("showRemains")
public class ShowRemainsOfGoodsInStock {
	
	@Autowired
	DeserializationFile deserializationFile;

	@Autowired
	DeserializationWeb deserializationWeb;
	
	@Autowired
	JoinTwoListsGoodsDublicateAndShowInList remainsInStock;
	
	public void showRemainsOfGoodsInStockAfterMergedFileAndWeb() {
		remainsInStock.joinTwoListShowGeneralAmount(deserializationFile.DeserializationFileInList(Constants.FILE)
				, deserializationWeb.DeserializationWebInList(Constants.URL) );

	}

}
