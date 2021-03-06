package project.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.HRMS.business.abstarcts.UserService;
import project.HRMS.core.utilities.results.DataResult;
import project.HRMS.entities.concretes.User;

@RestController
@RequestMapping("api/users")
public class UsersController {
	
	private UserService userService;
    @Autowired
	public UsersController(UserService userService) {
		super();
		this.userService = userService;
	}
	
    @GetMapping("/getall")
    public DataResult<List<User>> getAll() {
    	return this.userService.getAll();
    }
	

	

}
