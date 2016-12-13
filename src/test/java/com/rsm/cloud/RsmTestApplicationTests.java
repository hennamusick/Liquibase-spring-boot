package com.rsm.cloud;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class RsmTestApplicationTests {

	/*@Inject
	LoginRepository loginRepository;

	@Inject
	RoleRepository roleRepository;

	@Inject
	ModuleRepository moduleRepository;

	@Inject
	SubModuleRepository subModuleRepository;

	@Inject
	UserController userController;
	
	@Inject
	UserService userService;*/
	@Test
	public void contextLoads() {
	}

	/*@Test void initializeRole(){
		HashMap<String, Role> stateSaveMap = new HashMap<String, Role>();
		
	}
	
	@Test
	public void userTest() {
		Login user = loginRepository.findFirstByUserName("nimal");
		System.err.println("User Test");

		if (user == null) {
			user = new Login();
			user.setUserName("nimal");
			user.setPassword("password");
		} else {
			System.out.println(user.getUserName());
		}
	}

	@Test
	public void roleTest() {
		Role role = roleRepository.findFirstRoleByName("roleName");

		if (role == null) {
			role = new Role();
			role.setName("roleName");

		} else {
			System.out.println(role.getName());
		}
	}

	@Test
	public void moduleTest() {
		Module module = moduleRepository.findFirstModuleByName("moduleName");

		if (module == null) {
			module = new Module();
			module.setName("moduleName");
		} else {
			System.out.println(module.getName());
		}
	}

	@Test
	public void subModuleTest() {
		SubModule subModule = subModuleRepository.findFirstSubModuleByName("subModuleName");

		if (subModule == null) {
			subModule = new SubModule();
			subModule.setName("subModuleName");
		} else {
			System.out.println(subModule.getName());
		}
	}

	@Test
	public void valueParsingTest() {
		ResponseEntity entity=userController.valueParsing("Thamira", 25);
		UserDTO dto=new UserDTO();
		dto.setAge(25*2);
		dto.setName("Thamira");
		assertThat(entity).isEqualTo(dto);
	}*/

}
