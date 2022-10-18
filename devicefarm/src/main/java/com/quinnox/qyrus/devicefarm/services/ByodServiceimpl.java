package com.quinnox.qyrus.devicefarm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quinnox.qyrus.devicefarm.domain.Byod;
import com.quinnox.qyrus.devicefarm.repository.ByodRepo;

@Service
public class ByodServiceimpl implements ByodService{
	
	@Autowired
	private ByodRepo byodRepo;
	public ByodServiceimpl() {
		
	}
	
		
	@Override
	public List<Byod> getByods() {
		
		return byodRepo.findAll();
		
	}
	
	
	@Override
	public Byod getByod(long id) {
		
		return byodRepo.findById(id).orElse(null);
	}
	
	@Override	
	public Byod addByods(Byod byod) {
		
		byodRepo.save(byod);
		return byod;
	}





	@Override
	public Byod updateByods(Byod byod) {
		
		byodRepo.save(byod);
		return null;
	}
	
	@Override
	public long total(){
		
		 return byodRepo.count();
		
	}
	
	@Override
	public void deleteByod(long parseLong) {
		
		Byod entity = byodRepo.getOne(parseLong);
		byodRepo.delete(entity);
	}

}
