package com.fdmgroup.contactrestapi.controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fdmgroup.contactrestapi.model.User;
import com.fdmgroup.contactrestapi.service.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.headers.Header;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

	UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

	@GetMapping()
	public List<User> getUsers() {
		return userService.retriveUsers();
	}

	@Operation(summary = "find a user resourse with input id")
	@ApiResponses(value = { @ApiResponse(	responseCode = "201", 
											description = "user found", 
											content = {
														@Content(mediaType = MediaType.APPLICATION_JSON_VALUE) 
													  }
										),
							@ApiResponse(	responseCode = "404",
											description = "user resourse with this corresponding id is not found"
	)
						  }
				 )
	
	@GetMapping("/id/{id}")
	public User getUser(@PathVariable long id) {
		return userService.retrieveUserById(id);

	}

	@Operation(summary = "find a user resourse with input username")
	@ApiResponses(value = { @ApiResponse(	responseCode = "201", 
											description = "user found", 
											content = {
														@Content(mediaType = MediaType.APPLICATION_JSON_VALUE) 
													  }
										),
							@ApiResponse(	responseCode = "404",
											description = "user resourse with this corresponding username is not found"
	)
						  }
				 )
	@GetMapping("/username/{username}")
	public User getUser(@PathVariable String username) {
		return userService.retrieveUserByUsername(username);

	}

	@Operation(summary = "create a user resourse from user input")
	@ApiResponses(value = { @ApiResponse(	responseCode = "201", 
											description = "user resource created", 
											headers = {@Header(name = "location", description = "URI to access the created resourse") },
											content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE) }
										)
						  }
				)

	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user) {
		User createdUser = userService.createUser(user);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId())
				.toUri();

		// return ResponseEntity.created(location).build();
		return ResponseEntity.created(location).body(createdUser);
	}

	@PutMapping("/{id}")
	public ResponseEntity<User> updateUser(@PathVariable long id, @RequestBody User user) {
		User updatedContact = userService.updateUser(id, user);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId())
				.toUri();
		return ResponseEntity.created(location).body(updatedContact);
	}

	@Operation(summary = "delete a user resourse with corresponding input id")
	@ApiResponses(	value = { 	@ApiResponse(	responseCode = "201",
												description = "user resource deleted",
												content = { @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
													      }
										    )
							}
				)
	
	@DeleteMapping("/{id}")
	public ResponseEntity<User> deleteUser(@PathVariable long id) {
		User deletedContact = userService.deleteUser(id);
		
		return ResponseEntity.created(null).body(deletedContact);
	}
}
