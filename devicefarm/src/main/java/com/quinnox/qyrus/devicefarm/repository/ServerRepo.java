package com.quinnox.qyrus.devicefarm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.quinnox.qyrus.devicefarm.domain.Server;

@Repository
public interface ServerRepo extends JpaRepository<Server, Long >{
	
	List<Server> findAll();

	Server getOne(long parseLong);
	
	void save(long id);
	
	@Query(value = "SELECT count(*) FROM Server")
	Long total();

}
