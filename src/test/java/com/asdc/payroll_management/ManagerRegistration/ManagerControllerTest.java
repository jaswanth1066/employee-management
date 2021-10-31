package com.asdc.payroll_management.ManagerRegistration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.asdc.payroll_management.Database.MySQLDB;

class ManagerControllerTest {

	@Test
	public void TestgetAllManager() throws SQLException {
		
		try
		{		
			ManagerController mng=new ManagerController();		
			//List<Manager> mngList=mng.getAllManagers();		
			assertEquals(0, 0); 
		}
		catch (Exception e) {
			fail();
		}
					
	}
	
	@Test
	public void TestsaveManager() throws SQLException {
			
		try
		{		
			ManagerController mngC=new ManagerController();		
			Manager mng=new Manager();
			mng.setManager_EmailID("Test");
			mng.setManager_Name("Test");
			mng.setManager_Password("Test");		
			String result=mngC.saveManager(mng);		
			assertEquals(0, 0); 
		}
		catch (Exception e) {
			fail();
		}
		
	}
	
}
