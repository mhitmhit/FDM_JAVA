package Mockito_WalkThrough;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.lenient;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


@ExtendWith(MockitoExtension.class)
class TestUserManager {
	
	@Mock
	User mockUser1, mockUser2;
	
	@Mock
	UserDatabaseAccess mockUserDatabaseAccess;
	
	UserManager userManager;
	
	@BeforeEach
	void setUp() throws Exception {
		userManager = new UserManager(mockUserDatabaseAccess);
	}
	
	@Test
	void test_authenticate_callsGetUserWithArgUserOne_whenUserOnePassedIn() {
		boolean authenticated = userManager.authenticate("user.one","password1");
		verify(mockUserDatabaseAccess).getUser("user.one");
	}
	
	@Test
	void dummyTest() {
		
	}

}
