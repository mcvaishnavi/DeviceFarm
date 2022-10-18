package com.quinnox.qyrus.devicefarm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quinnox.qyrus.devicefarm.domain.Server;
import com.quinnox.qyrus.devicefarm.repository.ServerRepo;

@Service
public class ServerServiceimpl implements ServerService{
	
	@Autowired
	private ServerRepo serverRepo;
	public ServerServiceimpl() {
		
	}
	
		
	@Override
	public List<Server> getServers() {
		
		return serverRepo.findAll();
		
	}
	
	
	@Override
	public Server getServer(long id) {
		
		return serverRepo.findById(id).orElse(null);
	}
	
	@Override	
	public Server addServers(Server server) {
		
		serverRepo.save(server);
		return server;
	}





	@Override
	public Server updateServer(Server server) {
		
		serverRepo.save(server);
		return null;
	}
	
	
	@Override
	public void deleteServer(long parseLong) {
		
		Server entity = serverRepo.getOne(parseLong);
		serverRepo.delete(entity);
	}
	
	@Override
	public long total(){
		
		 return serverRepo.count();
		

    }
}
