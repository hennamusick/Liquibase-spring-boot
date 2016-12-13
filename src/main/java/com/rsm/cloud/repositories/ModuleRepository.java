package com.rsm.cloud.repositories;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.rsm.cloud.models.Module;

@Repository
public interface ModuleRepository extends PagingAndSortingRepository<Module, Long>{
	
	List<Module> findAllModuleById(long id);
	
	Module findFirstModuleByName(String name);

}
