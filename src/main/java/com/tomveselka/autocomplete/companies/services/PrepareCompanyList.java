package com.tomveselka.autocomplete.companies.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tomveselka.autocomplete.companies.dto.CompanyDto;
import com.tomveselka.autocomplete.companies.entities.CompanyEntity;
import com.tomveselka.autocomplete.companies.entities.CompanyFormEntity;
import com.tomveselka.autocomplete.companies.entities.NaceEntity;
import com.tomveselka.autocomplete.companies.entities.NumberOfEmplyEntity;
import com.tomveselka.autocomplete.companies.repositories.CompanyFormRepository;
import com.tomveselka.autocomplete.enums.NumberOfEmployeesEnum;

@Service
public class PrepareCompanyList {
		
	public List<CompanyDto> prepareCompanyData (List<CompanyEntity> entityList){
		List<CompanyDto> dtoList= new ArrayList<CompanyDto>();
		for (CompanyEntity entity: entityList) {
			CompanyFormEntity formEntity = entity.getFormEntity();
			NumberOfEmplyEntity employeeEntity = entity.getEmployeeEntity();
			//NaceEntity naceEntity = entity.getNaceEntity();
			CompanyDto dto = new CompanyDto();
			dto.setName(entity.getFirma());
			dto.setIco(entity.getIco());
			dto.setDateOfCreation(entity.getDdatvzn());
			dto.setDateOfEnding(entity.getDdatzan());
			if(formEntity != null) {
				dto.setCompanyForm(formEntity.getZkrtext());
			}
			if(employeeEntity != null) {
			dto.setNumberOfEmpl(prepareNumberOfEmpl(employeeEntity.getChodnota()).toString());
			}
			dto.setCity(entity.getObecText());
			dto.setStreet(entity.getUliceText());
			if (entity.getCor() != null) {
				dto.setHouseNumber(entity.getCdom()+"/"+entity.getCor());
			}else {
				dto.setHouseNumber(entity.getCdom());
			}
			dto.setZipCode(entity.getPsc());
			
			dtoList.add(dto);
		}	
		return dtoList;
	}
	
	public NumberOfEmployeesEnum prepareNumberOfEmpl(String code) { 
		int codeInt=Integer.valueOf(code);
		if(codeInt==110) {
			return NumberOfEmployeesEnum.E1;
		}else if(codeInt<=230) {
			return NumberOfEmployeesEnum.E2;
		}else if (codeInt<=320) {
			return NumberOfEmployeesEnum.E3;
		}else if (codeInt<=340) {
			return NumberOfEmployeesEnum.E4;
		}else if (codeInt<=470) {
			return NumberOfEmployeesEnum.E5;
		}else if (codeInt==510) {
			return NumberOfEmployeesEnum.E6;
		}
		
		return NumberOfEmployeesEnum.E0;
	}
}
