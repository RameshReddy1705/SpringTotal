package com.ramesh9705.Reservation.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ramesh9705.Reservation.Dao.AdminDao;
import com.ramesh9705.Reservation.Dto.Admin;
import com.ramesh9705.Reservation.Dto.ResponseStructure;
import com.ramesh9705.Reservation.Exception.IdNotFoundException;
import com.ramesh9705.Reservation.Exception.InvaildCredentialException;
@Service
public class AdminService
{
	@Autowired
	public AdminDao adminDao;

	public ResponseEntity<ResponseStructure<Admin>> saveAdmin(Admin admin)
	{
		ResponseStructure<Admin> str= new ResponseStructure<>();
		str.setBody(adminDao.saveAdmin(admin));
		str.setMessage("Successfully Created");
		str.setCode(HttpStatus.ACCEPTED.value());
		return new ResponseEntity<ResponseStructure<Admin>>(str, HttpStatus.CREATED);
	}
	
	public ResponseEntity<ResponseStructure<Admin>> updateAdmin(Admin admin)
	{
			ResponseStructure<Admin> str= new ResponseStructure<>();
			str.setBody(adminDao.updateAdmin(admin));
			str.setMessage("Successfully Updated");
			str.setCode(HttpStatus.ACCEPTED.value());

			return new ResponseEntity<ResponseStructure<Admin>>(str, HttpStatus.ACCEPTED);		
	}

	public ResponseEntity<ResponseStructure<Admin>> findById(int id)
	{
		ResponseStructure<Admin> str= new ResponseStructure<>();
		Optional<Admin> recAdmin=adminDao.finddById(id);
		if(recAdmin.isPresent())
		{
			str.setBody(recAdmin.get());
			str.setMessage("Admin Found");
			str.setCode(HttpStatus.OK.value());
			return new ResponseEntity<ResponseStructure<Admin>>(str, HttpStatus.ACCEPTED);
		}
		throw new IdNotFoundException();
	}

	public ResponseEntity<ResponseStructure<Admin>> verifyAdmin(long phone, String password)
	{
		ResponseStructure<Admin> str= new ResponseStructure<>();
		Optional<Admin> recAdmin=adminDao.verifyAdmin(phone, password);
		if(recAdmin.isPresent())
		{
			str.setBody(recAdmin.get());
			str.setMessage("Admin verified");
			str.setCode(HttpStatus.OK.value());
			return new ResponseEntity<ResponseStructure<Admin>>(str, HttpStatus.ACCEPTED);
		}
		throw new InvaildCredentialException();
	}

	public ResponseEntity<ResponseStructure<List<Admin>>> findAllAdmins()
	{
		ResponseStructure<List<Admin>> str= new ResponseStructure<List<Admin>>();
		str.setBody(adminDao.findAllAdmins());
		str.setMessage("Find All Admin");
		str.setCode(HttpStatus.ACCEPTED.value());
		return new ResponseEntity<ResponseStructure<List<Admin>>>(HttpStatus.ACCEPTED);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public ResponseEntity<ResponseStructure<Admin>> updateAdmin(Admin admin,int id)
//	{
//		Optional<Admin> adminid=adminDao.finddById(id);
//		if(adminid.isPresent())
//		{
//			admin.setName(admin.getName());
//			admin.setEmail(admin.getEmail());
//			admin.setPassword(admin.getPassword());
//			admin.setPhone(admin.getPhone());
//			admin.setGst(admin.getGst());
//			
//			ResponseStructure<Admin> str= new ResponseStructure<>();
//			str.setBody(adminDao.updateAdmin(admin));
//			str.setMessage("Successfully Updated");
//			str.setCode(HttpStatus.ACCEPTED.value());
//
//			return new ResponseEntity<ResponseStructure<Admin>>(str, HttpStatus.CREATED);
//		}
//		throw new IdNotFoundException();
		
//	}
}
