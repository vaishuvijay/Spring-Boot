package Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;

import Services.TdServices;
import beans.TdWrapper;

@Controller
public class TdController {
	
	@Autowired
	private TdServices tdServices;
	
	 @PostMapping("/saveTd")
	 public ResponseEntity<TdWrapper> saveTd(@RequestBody TdWrapper tdWrapper) {
		tdServices.saveTd(tdWrapper);
		return ResponseEntity.ok(tdWrapper);
		}

}
