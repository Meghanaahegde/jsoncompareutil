package com.jsonproj.practise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsonPractise.config.JsonComparisionProperties;

@Service
public class FileConsumerService {
	@Autowired
	JsonComparisionProperties jsoncompareproperty;

	public void processJsonFiles() throws Exception{
		// TODO Auto-generated method stub
		
	}

}
