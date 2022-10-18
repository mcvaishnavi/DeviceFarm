package com.quinnox.qyrus.devicefarm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.quinnox.qyrus.devicefarm.domain.Byod;

@Repository
public interface ByodRepo extends JpaRepository<Byod, Long >{

	List<Byod> findAll();

	Byod getOne(long parseLong);
	
	void save(long id);
	
	@Query(value = "SELECT count(*) FROM Byod")
	Long total();
	

}