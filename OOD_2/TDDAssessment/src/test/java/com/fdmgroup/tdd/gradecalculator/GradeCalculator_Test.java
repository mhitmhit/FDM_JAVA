package com.fdmgroup.tdd.gradecalculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

class GradeCalculator_Test {

	@org.junit.jupiter.api.Test
	void test_GetClassificationMethod_WhenMarkIsLessThan75() {
		
		GradeCalculator gradeCalculator = new GradeCalculator();
		
		String actualResult = gradeCalculator.getClassification(74.00);
		String expectedResult = "fail";
		
		assertEquals(actualResult, expectedResult);
	}
	
	@org.junit.jupiter.api.Test
	void test_GetClassificationMethod_WhenMarkIsGreaterThanOrEqual75andLessThan80() {
		
		GradeCalculator gradeCalculator = new GradeCalculator();
		
		String actualResult = gradeCalculator.getClassification(75.00);
		String expectedResult = "pass";
		
		assertEquals(actualResult, expectedResult);
	}
	
	@org.junit.jupiter.api.Test
	void test_GetClassificationMethod_WhenMarkIsGreaterThanOrEqual80andLessThan90() {
		
		GradeCalculator gradeCalculator = new GradeCalculator();
		
		String actualResult = gradeCalculator.getClassification(80.00);
		String expectedResult = "merit";
		
		assertEquals(actualResult, expectedResult);
	}
	
	@org.junit.jupiter.api.Test
	void test_GetClassificationMethod_WhenMarkIsGreaterThanOrEqual90andLessThan100() {
		
		GradeCalculator gradeCalculator = new GradeCalculator();
		
		String actualResult = gradeCalculator.getClassification(90.00);
		String expectedResult = "distinction";
		
		assertEquals(actualResult, expectedResult);
	}
	
	@org.junit.jupiter.api.Test
	void test_GetClassificationMethod_WhenMarkIsGreaterThan100_InvalidGrade() {
		
		GradeCalculator gradeCalculator = new GradeCalculator();
		
		String actualResult = gradeCalculator.getClassification(101.00);
		String expectedResult = "invalid grade entered";
		
		assertEquals(actualResult, expectedResult);
	}
	
	@org.junit.jupiter.api.Test
	void test_GetClassificationMethod_WhenMarkIsLessThanZero_InvalidGrade() {
		
		GradeCalculator gradeCalculator = new GradeCalculator();
		
		String actualResult = gradeCalculator.getClassification(-70);
		String expectedResult = "invalid grade entered";
		
		assertEquals(actualResult, expectedResult);
	}

	
}
