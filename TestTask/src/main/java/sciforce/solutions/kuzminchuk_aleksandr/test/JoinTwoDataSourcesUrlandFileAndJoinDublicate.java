package sciforce.solutions.kuzminchuk_aleksandr.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("joinTwoListsAndDublicate")
public class JoinTwoDataSourcesUrlandFileAndJoinDublicate {

	@Autowired
	DeserializationFile deserializationFile;

	@Autowired
	DeserializationWeb deserializationWeb;

	@Autowired
	JoinTwoListsGoodsAndJoinDublicate joinTwoListsAndDublicate;

	@Autowired
	SerializationObject serializationObject;

	@Autowired
	JoinTwoListsGoodsDublicateAndShowInList dublicateAndShowInList;

	@Autowired
	CheckTwoDatasourceOnDublicate checkTwoDatasourceOnDublicate;

	public void deserializationWebAndFileInListsJoinListsAndDublicateSerializationInJSON() {

		serializationObject.SerializationInJSON(joinTwoListsAndDublicate.joinTwoListsAndDublicate(
				deserializationFile.DeserializationFileInList(Constants.FILE),
				deserializationWeb.DeserializationWebInList(Constants.URL)));

	}
	
	public void ThrowExceptionIfThereAreDublicates() {
		serializationObject.SerializationInJSON(checkTwoDatasourceOnDublicate.joinTwoListCheckOnDublicate(
				deserializationFile.DeserializationFileInList(Constants.FILE),
				deserializationWeb.DeserializationWebInList(Constants.URL)));
	}

}
