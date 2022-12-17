package Mockito_InClass_Example;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.lenient;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyString;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.anyDouble;

@ExtendWith(MockitoExtension.class)
class UserAdminTest {
	
	UserAdmin userAdmin;
	
	@Mock
	UserDataBaseAccess mockUserDataBaseAccess;
	
	@BeforeEach
	void setUp()throws Exception {
		userAdmin = new UserAdmin(mockUserDataBaseAccess);
	}
	
	@Test
	void createMultipleUsers_CallsAddUserThreeTimesPassingInAUser_WhenListWithThreeUserNamesIsUsed() {
		// Arr
		List<String> usernames = new ArrayList(Arrays.asList("user1", "user2", "user3"));
		String password = "password123";
		
		// Act
		userAdmin.createMultipleUsers(usernames, password);
		
		// Assert or Verify
		verify(mockUserDataBaseAccess, times(3)).addUser(any(User.class));
		//verify(mockUserDataBaseAccess, times(3)).addUser(anyString());
		//verify(mockUserDataBaseAccess, times(3)).addUser(anyInt());
		//verify(mockUserDataBaseAccess, times(3)).addUser(anyDouble());
		
		
		
		
	}

}
