package Mockito_InClass_Example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.lenient;

@ExtendWith(MockitoExtension.class) 								// must be added before the class to use Mockito
class UserManagerTest {

	UserManager userManager;
	
	@Mock
	UserDataBaseAccess mockUserDataBaseAccess;						// mock object that will be injected
																	// need to have a @mock section for each type of VAR'
	
	@Mock
	User mockUser1, mockUser2;
	
	
	
	@BeforeEach
	void setUp() throws Exception {
		
		userManager = new UserManager(mockUserDataBaseAccess);  	// this is called Injection, injecting the mock object
	}
	
	@Test
	void test_authenticate_CallsGetUserWithArgUserOne_WhenUserOnePasseIn() {
		System.out.println("test 1 running:");
		String userName = "Clayton";
		String password = "password123";
		boolean isAuthenticated = userManager.authenticate(userName, password );
		
		verify(mockUserDataBaseAccess).getUser(userName); 			// this is checking if interaction between UserManager and UserDataBaseAccess was triggered.
																	// isAuthenticated true or false doesnt matter, we are only checking interaction taking place.
																	// in this case, it is always returning null - as mock object return their default value
	}
	
	@Test
	void test_authenticate_CallsGetUserWithArgUserOne_WhenUserOnePasseIn2() {
		System.out.println("test 2 running:");
		String userName = "Clayton";
		String password = "password123";
		
		User clayton = new User();
		clayton.setUserName("Clayton");
		clayton.setPassword("password123");
		
		User antonio = new User();
		antonio.setUserName("Antonio");
		antonio.setPassword("password456");
		
		lenient().when(mockUserDataBaseAccess.getUser("Clayton")).thenReturn(clayton);  // when i do pass you username clayton, i want you to return the clayton User
		lenient().when(mockUserDataBaseAccess.getUser("Antonio")).thenReturn(antonio);  // when i do pass you username antonio, i want you to return the antonio User
		
		boolean isAuthenticated = userManager.authenticate(userName, password );
		verify(mockUserDataBaseAccess).getUser(userName);
	}
	
	@Test
	void test_authenticate_ReturnsTrue_WhenClaytonAndPassword123ArePassedIn() {
		System.out.println("test 3 running:");
		String userName = "Clayton";
		String password = "password123";
		
		User clayton = new User();
		clayton.setUserName("Clayton");
		clayton.setPassword("password123");
		
		when(mockUserDataBaseAccess.getUser("Clayton")).thenReturn(clayton);
		boolean isAuthenticated = userManager.authenticate(userName, password );
		assertTrue(isAuthenticated);
	}

	
}// End of Test Class
