package com.rsm.cloud.repositories;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.rsm.cloud.models.Role;

@Repository
public interface RoleRepository extends PagingAndSortingRepository<Role, Long>{
	
	List<Role> findAllRoleById(long id);
	
	Role findFirstRoleByName(String name);

}
