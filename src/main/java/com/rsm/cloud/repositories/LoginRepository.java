package com.rsm.cloud.repositories;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.rsm.cloud.models.Login;

@Repository
public interface LoginRepository extends PagingAndSortingRepository<Login, Long>{
	
	List<Login> findAllLoginById(long id);
	
	List<Login> findAllLoginByUserName(String userName);
	
	List<Login> findFirstByUserName(String userName);
	
}
