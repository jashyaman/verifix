package com.verifix.resources;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.verifix.exceptions.EmptyRecordSetException;
import com.verifix.models.DefaultResponse;
import com.verifix.models.Project;
import com.verifix.models.Role;
import com.verifix.models.RoleGroup;
import com.verifix.models.UploadLog;
import com.verifix.models.User;
import com.verifix.services.ProjectService;
import com.verifix.services.RoleGroupService;
import com.verifix.services.RoleService;
import com.verifix.services.UploadLogService;
import com.verifix.services.UserService;

@RestController
//@RequestMapping(path="/verifix/v1")
public class BasicResource {
	
	@Autowired
	UserService userService;
	
	@Autowired
	UploadLogService uploadLogService;
	
	@Autowired
	RoleService roleService;
	
	@Autowired
	ProjectService projectService;
	
	@Autowired
	RoleGroupService roleGroupService;
	
	@GetMapping(path="/")
	public ResponseEntity<Map<String, DefaultResponse>> basicResponse() {
		Map<String, DefaultResponse> responseMap = new HashMap<String, DefaultResponse>();
		DefaultResponse defaultResponse = new DefaultResponse("10001", "good data default response", "200", "OK");
		defaultResponse.defaultResourceBuilder("{ \"data\" : \"default\" }");
		responseMap.put("payload", defaultResponse);
		return new ResponseEntity<Map<String,DefaultResponse>>(responseMap, HttpStatus.OK);
	}
	
	@GetMapping(path="/users/all")
	public ResponseEntity<Map<String, DefaultResponse>> getAllUsers() throws EmptyRecordSetException {
		
		
		List<User> responseList = userService.getAllUsers();

		if (responseList.size() == 0) 
			throw new EmptyRecordSetException("uploadlogs have no records");
		
		Map<String, DefaultResponse > responseMap = new HashMap<>();
		
		
		DefaultResponse defaultResponse = new DefaultResponse("10001", "good data default response", "200", "OK");
		defaultResponse.defaultResourceBuilder(responseList);
		responseMap.put("payload", defaultResponse );
		return new ResponseEntity<Map<String,DefaultResponse>>(responseMap, HttpStatus.OK);
	}
	
	@GetMapping(path="/uploadlogs/all")
	public ResponseEntity<Map<String, DefaultResponse>> getAllUploadLogs() throws EmptyRecordSetException {
		List<UploadLog> responseList = uploadLogService.findAllUploadLogs();
		Map<String, DefaultResponse> responseMap = new HashMap<>();
		
		if (responseList.size() == 0) 
			throw new EmptyRecordSetException("uploadlogs have no records");
		
		DefaultResponse defaultResponse = new DefaultResponse("10001", "good data default response", "200", "OK");
		defaultResponse.defaultResourceBuilder(responseList);
		responseMap.put("payload",defaultResponse);
		return new ResponseEntity<Map<String,DefaultResponse>>(responseMap, HttpStatus.OK);
		
	}
	
	@GetMapping(path="/projects/all")
	public ResponseEntity<Map<String, DefaultResponse>> getAllProjects() throws EmptyRecordSetException {
		List<Project> responseList = projectService.findAllProjects();
		
		if(responseList.size() == 0) 
			throw new EmptyRecordSetException("project list has no records");
		
		Map<String, DefaultResponse> responseMap = new HashMap<String, DefaultResponse>();
		
		DefaultResponse defaultResponse = new DefaultResponse("10001", "good data default response", "200", "OK");
		defaultResponse.defaultResourceBuilder(responseList);
		responseMap.put("payload", defaultResponse);
		return new ResponseEntity<Map<String,DefaultResponse>>(responseMap, HttpStatus.OK);
	}
	
	@GetMapping(path="/roles/all")
	public ResponseEntity<Map<String, DefaultResponse>> getAllRoles() throws EmptyRecordSetException {
		List<Role> responseList = roleService.findAllRoles();
		
		if(responseList.size() == 0) 
			throw new EmptyRecordSetException("role list has no records");
		
		Map<String, DefaultResponse> responseMap = new HashMap<String, DefaultResponse>();
		
		DefaultResponse defaultResponse = new DefaultResponse("10001", "good data default response", "200", "OK");
		defaultResponse.defaultResourceBuilder(responseList);
		responseMap.put("payload", defaultResponse);
		return new ResponseEntity<Map<String,DefaultResponse>>(responseMap, HttpStatus.OK);
	}
	
	@GetMapping(path="/rolegroups/all")
	public ResponseEntity<Map<String, DefaultResponse>> getAllRoleGroups() throws EmptyRecordSetException {
		List<RoleGroup> responseList = roleGroupService.findAllRoleGroups();
		
		if(responseList.size() == 0) 
			throw new EmptyRecordSetException("role group list has no records");
		
		Map<String, DefaultResponse> responseMap = new HashMap<String, DefaultResponse>();
		
		DefaultResponse defaultResponse = new DefaultResponse("10001", "good data default response", "200", "OK");
		defaultResponse.defaultResourceBuilder(responseList);
		responseMap.put("payload", defaultResponse);
		return new ResponseEntity<Map<String,DefaultResponse>>(responseMap, HttpStatus.OK);
	}
}
