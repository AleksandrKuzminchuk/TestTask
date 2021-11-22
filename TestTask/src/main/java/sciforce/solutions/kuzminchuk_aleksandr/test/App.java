package sciforce.solutions.kuzminchuk_aleksandr.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sciforce.solutions.kuzminchuk_aleksandr.test.configuration.MyConfig;

public class App {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

		JoinTwoDataSourcesUrlandFileAndJoinDublicate joinTwoListsAndDublicate = context
				.getBean("joinTwoListsAndDublicate", JoinTwoDataSourcesUrlandFileAndJoinDublicate.class);

		joinTwoListsAndDublicate.deserializationWebAndFileInListsJoinListsAndDublicateSerializationInJSON();
		
		joinTwoListsAndDublicate.ThrowExceptionIfThereAreDublicates();

		ShowRemainsOfGoodsInStock inStock = context.getBean("showRemains", ShowRemainsOfGoodsInStock.class);
		inStock.showRemainsOfGoodsInStockAfterMergedFileAndWeb();

		context.close();

	}
}
