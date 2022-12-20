package com.fdmgroup.tdd.groupcontroller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class GroupController_Test {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@Mock
	DatabaseReader mockDatabaseReader;
	
	@Mock
	DatabaseWriter mockDatabaseWriter;
	
	@Mock
	Trainee trainee1, trainee2, trainee3;
	
	
	
	
	@org.junit.jupiter.api.Test
	void test_getAllTrainnesMethod_callsReadGroupMethodOfDabaseReader() {
		
		GroupController groupController = new GroupController(mockDatabaseReader);
		
		groupController.getAllTrainees();
		
		verify(mockDatabaseReader).readGroup();
		
	}
	
	@org.junit.jupiter.api.Test
	void test_getAllTrainnesMethod_returnsMapFromReadGroupMethodOfDatabaseReader_whenThereAreNoTrainees() {
		
		GroupController groupController = new GroupController(mockDatabaseReader);
		
		Map <String, Trainee> expectedTraineeMap = new HashMap<String, Trainee>();
		
		assertEquals(groupController.getAllTrainees(), expectedTraineeMap);
		
	}
	
	@org.junit.jupiter.api.Test
	void test_getAllTrainnesMethod_returnsMapFromReadGroupMethodOfDatabaseReader() {
		
		GroupController groupController = new GroupController(mockDatabaseReader);
		
		Map <String, Trainee> expectedTraineeMap = new HashMap<String, Trainee>();
		
		expectedTraineeMap.put("one", trainee1);
		expectedTraineeMap.put("two", trainee2);
		
		when(mockDatabaseReader.readGroup()).thenReturn(expectedTraineeMap);
		
		assertEquals(groupController.getAllTrainees(), expectedTraineeMap);
		
	}
	
	@org.junit.jupiter.api.Test
	void test_RemoveTraineeByUserNameMethod_callsDeleteTraineeByUserNameOfDatabaseWriterClass() {
	
		GroupController groupController = new GroupController(mockDatabaseWriter);
		
		groupController.removeTraineeByUsername(trainee1.getUsername());
		
		verify(mockDatabaseWriter).deleteTraineeByUsername(null);
	}	
	
	@org.junit.jupiter.api.Test
	void test_RemoveTraineeByUserNameMethod_callsDeleteTraineeByUserNameOfDatabaseWriterClass_AndPassTheTraineeUserName() {

		Trainee trainee = new Trainee("one");

		GroupController groupController = new GroupController(mockDatabaseWriter);
		
		groupController.removeTraineeByUsername(trainee.getUsername());
		
		verify(mockDatabaseWriter).deleteTraineeByUsername("one");

	}		
	
	@org.junit.jupiter.api.Test
	void test_addTraineeMethod_callsAddTraineeOfDatabaseWriterClass_AndPassTheTrainee() {

		GroupController groupController = new GroupController(mockDatabaseWriter);
		
		groupController.addTrainee(trainee1);
		
		verify(mockDatabaseWriter).addTrainee(trainee1);

	}		
	

}
