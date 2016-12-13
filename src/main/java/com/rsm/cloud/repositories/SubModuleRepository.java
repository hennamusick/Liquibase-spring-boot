package com.rsm.cloud.repositories;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.rsm.cloud.models.SubModule;


@Repository
public interface SubModuleRepository extends PagingAndSortingRepository<SubModule, Long>{
	
	List<SubModule> findAllSubModuleById(long id);
	
	SubModule findFirstSubModuleByName(String name);

}
