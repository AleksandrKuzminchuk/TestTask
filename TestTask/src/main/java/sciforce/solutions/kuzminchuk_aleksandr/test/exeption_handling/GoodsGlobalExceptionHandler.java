package sciforce.solutions.kuzminchuk_aleksandr.test.exeption_handling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GoodsGlobalExceptionHandler {
	
	@ExceptionHandler
	public ResponseEntity<GoodsDublicate> handleException(DublicateGoodsException exeption){
		GoodsDublicate dublicate = new GoodsDublicate();
		dublicate.setInfo(exeption.getMessage());
		
		return new ResponseEntity<>(dublicate, HttpStatus.NOT_ACCEPTABLE);
	}
	
	@ExceptionHandler
	public ResponseEntity<GoodsDublicate> handleException(Exception exeption){
		GoodsDublicate dublicate = new GoodsDublicate();
		dublicate.setInfo(exeption.getMessage());
		
		return new ResponseEntity<>(dublicate, HttpStatus.BAD_REQUEST);
	}

}


