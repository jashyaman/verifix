package com.verifix.resources;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.verifix.exceptions.EmptyRecordSetException;
import com.verifix.exceptions.UserNotFoundException;
import com.verifix.models.Credentials;
import com.verifix.models.DefaultResponse;
import com.verifix.models.ModificationLogs;
import com.verifix.models.Project;
import com.verifix.models.ResRgMap;
import com.verifix.models.Resource;
import com.verifix.models.ResourceGroup;
import com.verifix.models.Role;
import com.verifix.models.RoleGroup;
import com.verifix.models.UploadLog;
import com.verifix.models.User;
import com.verifix.services.CredentialService;
import com.verifix.services.ModificationLogsService;
import com.verifix.services.ProjectService;
import com.verifix.services.ResourceGroupService;
import com.verifix.services.ResourceResourceGroupMapService;
import com.verifix.services.ResourceService;
import com.verifix.services.RoleGroupService;
import com.verifix.services.RoleService;
import com.verifix.services.UploadLogService;
import com.verifix.services.UserService;

@RestController
@RequestMapping(path = "/verifix/v1")
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

	@Autowired
	ResourceService resourceService;

	@Autowired
	ResourceGroupService resourceGroupService;

	@Autowired
	ResourceResourceGroupMapService resrgService;

	@Autowired
	ModificationLogsService modificationLogService;

	@Autowired
	CredentialService credentialService;

	@GetMapping(path = "/")
	public ResponseEntity<Map<String, DefaultResponse>> basicResponse() {
		Map<String, DefaultResponse> responseMap = new HashMap<String, DefaultResponse>();
		DefaultResponse defaultResponse = new DefaultResponse("10001", "good data default response", "200", "OK");
		defaultResponse.defaultResourceBuilder("{ \"data\" : \"default\" }");
		responseMap.put("payload", defaultResponse);
		return new ResponseEntity<Map<String, DefaultResponse>>(responseMap, HttpStatus.OK);
	}

	@GetMapping(path = "/users/all")
	public ResponseEntity<Map<String, DefaultResponse>> getAllUsers() throws EmptyRecordSetException {

		List<User> responseList = userService.getAllUsers();

		if (responseList.size() == 0)
			throw new EmptyRecordSetException("uploadlogs have no records");

		Map<String, DefaultResponse> responseMap = new HashMap<>();

		DefaultResponse defaultResponse = new DefaultResponse("10001", "good data default response", "200", "OK");
		defaultResponse.defaultResourceBuilder(responseList);
		responseMap.put("payload", defaultResponse);
		return new ResponseEntity<Map<String, DefaultResponse>>(responseMap, HttpStatus.OK);
	}

	@GetMapping(path = "/uploadlogs/all")
	public ResponseEntity<Map<String, DefaultResponse>> getAllUploadLogs() throws EmptyRecordSetException {
		List<UploadLog> responseList = uploadLogService.findAllUploadLogs();
		Map<String, DefaultResponse> responseMap = new HashMap<>();

		if (responseList.size() == 0)
			throw new EmptyRecordSetException("uploadlogs have no records");

		DefaultResponse defaultResponse = new DefaultResponse("10001", "good data default response", "200", "OK");
		defaultResponse.defaultResourceBuilder(responseList);
		responseMap.put("payload", defaultResponse);
		return new ResponseEntity<Map<String, DefaultResponse>>(responseMap, HttpStatus.OK);

	}

	@GetMapping(path = "/projects/all")
	public ResponseEntity<Map<String, DefaultResponse>> getAllProjects() throws EmptyRecordSetException {
		List<Project> responseList = projectService.findAllProjects();

		if (responseList.size() == 0)
			throw new EmptyRecordSetException("project list has no records");

		Map<String, DefaultResponse> responseMap = new HashMap<String, DefaultResponse>();

		DefaultResponse defaultResponse = new DefaultResponse("10001", "good data default response", "200", "OK");
		defaultResponse.defaultResourceBuilder(responseList);
		responseMap.put("payload", defaultResponse);
		return new ResponseEntity<Map<String, DefaultResponse>>(responseMap, HttpStatus.OK);
	}

	@GetMapping(path = "/roles/all")
	public ResponseEntity<Map<String, DefaultResponse>> getAllRoles() throws EmptyRecordSetException {
		List<Role> responseList = roleService.findAllRoles();

		if (responseList.size() == 0)
			throw new EmptyRecordSetException("role list has no records");

		Map<String, DefaultResponse> responseMap = new HashMap<String, DefaultResponse>();

		DefaultResponse defaultResponse = new DefaultResponse("10001", "good data default response", "200", "OK");
		defaultResponse.defaultResourceBuilder(responseList);
		responseMap.put("payload", defaultResponse);
		return new ResponseEntity<Map<String, DefaultResponse>>(responseMap, HttpStatus.OK);
	}
	
	/*
	 * accepts userid as input, provides list of roles associated with the user as output
	 */

	@GetMapping(path = "/finduserroles/{userid}")
	public ResponseEntity<Map<String, DefaultResponse>> findUserRoles(@PathVariable String userid) throws EmptyRecordSetException {
		List<Role> responseList = roleService.findUserRoles(userid);

		if (responseList.size() == 0)
			throw new EmptyRecordSetException("search for user with id "+userid+" returns role list that has no records");

		Map<String, DefaultResponse> responseMap = new HashMap<String, DefaultResponse>();

		DefaultResponse defaultResponse = new DefaultResponse("10001", "good data default response", "200", "OK");
		defaultResponse.defaultResourceBuilder(responseList);
		responseMap.put("payload", defaultResponse);
		return new ResponseEntity<Map<String, DefaultResponse>>(responseMap, HttpStatus.OK);
	}
	
	
	
	

	@GetMapping(path = "/rolegroups/all")
	public ResponseEntity<Map<String, DefaultResponse>> getAllRoleGroups() throws EmptyRecordSetException {
		List<RoleGroup> responseList = roleGroupService.findAllRoleGroups();

		if (responseList.size() == 0)
			throw new EmptyRecordSetException("role group list has no records");

		Map<String, DefaultResponse> responseMap = new HashMap<String, DefaultResponse>();

		DefaultResponse defaultResponse = new DefaultResponse("10001", "good data default response", "200", "OK");
		defaultResponse.defaultResourceBuilder(responseList);
		responseMap.put("payload", defaultResponse);
		return new ResponseEntity<Map<String, DefaultResponse>>(responseMap, HttpStatus.OK);
	}

	@GetMapping(path = "/resources/all")
	public ResponseEntity<Map<String, DefaultResponse>> getAllResource() throws EmptyRecordSetException {
		List<Resource> responseList = resourceService.findAllResources();

		if (responseList.size() == 0)
			throw new EmptyRecordSetException("resource list has no records");

		Map<String, DefaultResponse> responseMap = new HashMap<String, DefaultResponse>();

		DefaultResponse defaultResponse = new DefaultResponse("10001", "good data default response", "200", "OK");
		defaultResponse.defaultResourceBuilder(responseList);
		responseMap.put("payload", defaultResponse);
		return new ResponseEntity<Map<String, DefaultResponse>>(responseMap, HttpStatus.OK);
	}

	@GetMapping(path = "/resourcegroups/all")
	public ResponseEntity<Map<String, DefaultResponse>> getAllResourceGroups() throws EmptyRecordSetException {
		List<ResourceGroup> responseList = resourceGroupService.findAllResourceGroups();

		if (responseList.size() == 0)
			throw new EmptyRecordSetException("resource list has no records");

		Map<String, DefaultResponse> responseMap = new HashMap<String, DefaultResponse>();

		DefaultResponse defaultResponse = new DefaultResponse("10001", "good data default response", "200", "OK");
		defaultResponse.defaultResourceBuilder(responseList);
		responseMap.put("payload", defaultResponse);
		return new ResponseEntity<Map<String, DefaultResponse>>(responseMap, HttpStatus.OK);
	}

	@GetMapping(path = "/resrgmap/{resgid}")
	public ResponseEntity<Map<String, DefaultResponse>> findresourcesForGroupId(
			@PathVariable("resgid") int resourceGroupId) throws EmptyRecordSetException, MissingPathVariableException {
		List<ResRgMap> responseList = resrgService.findResourceOfResourceGroup(resourceGroupId);

		if (responseList.size() == 0)
			throw new EmptyRecordSetException("res rg map list has no records");

		Map<String, DefaultResponse> responseMap = new HashMap<String, DefaultResponse>();

		DefaultResponse defaultResponse = new DefaultResponse("10001", "good data default response", "200", "OK");
		defaultResponse.defaultResourceBuilder(responseList);
		responseMap.put("payload", defaultResponse);
		return new ResponseEntity<Map<String, DefaultResponse>>(responseMap, HttpStatus.OK);
	}

	@GetMapping(path = "/modificationlog/all")
	public ResponseEntity<Map<String, DefaultResponse>> findAllModificationLogs() throws EmptyRecordSetException {
		List<ModificationLogs> responseList = modificationLogService.findAllModificationLogs();
		if (responseList.size() == 0)
			throw new EmptyRecordSetException("res rg map list has no records");

		Map<String, DefaultResponse> responseMap = new HashMap<String, DefaultResponse>();

		DefaultResponse defaultResponse = new DefaultResponse("10001", "good data default response", "200", "OK");
		defaultResponse.defaultResourceBuilder(responseList);
		responseMap.put("payload", defaultResponse);
		return new ResponseEntity<Map<String, DefaultResponse>>(responseMap, HttpStatus.OK);

	}

	@PostMapping(path = "/credentialsvalidate")
	public ResponseEntity<Map<String, DefaultResponse>> mapCredential(@RequestBody Credentials credentials) throws UserNotFoundException {
		boolean response = credentialService.mapCredentials(credentials);

		Map<String, DefaultResponse> responseMap = new HashMap<String, DefaultResponse>();
		if (response) {
			DefaultResponse defaultResponse = new DefaultResponse("10001", "good data default response", "200", "OK");
			defaultResponse.defaultResourceBuilder(response);
			responseMap.put("payload", defaultResponse);
			return new ResponseEntity<Map<String, DefaultResponse>>(responseMap, HttpStatus.OK);
		} else {
			DefaultResponse defaultResponse = new DefaultResponse("11001", "Invalid credentials", "401",
					"Unauthorized");
			defaultResponse.defaultResourceBuilder(response);
			responseMap.put("payload", defaultResponse);
			return new ResponseEntity<Map<String, DefaultResponse>>(responseMap, HttpStatus.UNAUTHORIZED);
		}
	}
}
