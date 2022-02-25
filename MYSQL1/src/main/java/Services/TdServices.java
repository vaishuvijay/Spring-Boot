package Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import beans.TdWrapper;
import models.Td;
import repository.TdRepo;


@Service
public class TdServices {
		
		@Autowired
		private TdRepo repository;
		
		public TdWrapper saveTd(TdWrapper inputTd) {
			 
			Td td = new Td( );
			td.setId(inputTd.getId());
			td.setAccNo(inputTd.getAccNo());
			td.setAccName(inputTd.getAccName());
			td.setBankNo(inputTd.getBankNo());
			td.setBankName(inputTd.getBankName());
			td.setTransNo(inputTd.getTransNo());
			td.setAmount(inputTd.getAmount());
			td.setR_AccNo(inputTd.getR_AccNo());
			td.setR_AccName(inputTd.getR_AccName());
			td.setStatus(inputTd.getStatus());
			td.setDate(inputTd.getDate());
			
			td = repository.save(td);			
			
		    inputTd.setId(td.getId());
		    inputTd.setAccNo(td.getAccNo());
		    inputTd.setAccName(td.getAccName());
		    inputTd.setBankNo(td.getBankNo());
		    inputTd.setBankName(td.getBankName());
		    inputTd.setTransNo(td.getTransNo());
		    inputTd.setAmount(td.getAmount());
		    inputTd.setR_AccNo(td.getR_AccNo());
		    inputTd.setR_AccName(td.getR_AccName());
		    inputTd.setStatus(td.getStatus());
		    inputTd.setDate(td.getDate());
		    return inputTd;		    
			
			}
}