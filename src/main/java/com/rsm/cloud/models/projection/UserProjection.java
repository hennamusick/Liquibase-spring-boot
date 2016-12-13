package com.rsm.cloud.models.projection;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import com.rsm.cloud.models.Login;
import com.rsm.cloud.models.Role;

public interface UserProjection {

	@Projection(name = "UserCall", types = Login.class)
	public interface userSearch{
		String getUserName();
		
		@Value("#{target == null ? '' : target.role }")
		List<Role> getRole();
		
	}
}
