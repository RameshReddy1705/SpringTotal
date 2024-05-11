package com.ramesh9705.Reservation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ramesh9705.Reservation.Dto.Admin;
import com.ramesh9705.Reservation.Dto.ResponseStructure;
import com.ramesh9705.Reservation.Service.AdminService;
@RestController
@CrossOrigin
public class AdminController
{
	@Autowired
	public AdminService adminService;
	
	@PostMapping("/admins")
	public ResponseEntity<ResponseStructure<Admin>> saveAdmin(@RequestBody Admin admin)
	{
		return adminService.saveAdmin(admin);
	}
	@PutMapping("/admins")
	public ResponseEntity<ResponseStructure<Admin>> updateAdmin(@RequestBody Admin admin)
	{
		return adminService.updateAdmin(admin);
	}
	@GetMapping("/admins/{id}")
	public ResponseEntity<ResponseStructure<Admin>> findById(@PathVariable int id)
	{
		return adminService.findById(id);
	}
	@PostMapping("/admins/verify-by-phone")
	public ResponseEntity<ResponseStructure<Admin>> verifyAdmin(@RequestParam long phone, @RequestParam String password)
	{
		return adminService.verifyAdmin(phone, password);
	}
	@GetMapping("/admins")
	public ResponseEntity<ResponseStructure<List<Admin>>> retriveAllAdmins()
	{
		return adminService.findAllAdmins();
	}
	
	
	
	
	
//	@PutMapping("/admins/{id}")
//	public ResponseEntity<ResponseStructure<Admin>> updateAdmin(@RequestBody Admin admin, @PathVariable int id)
//	{
//		Admin admin2=adminService.findById(id);
//				admin.setName(admin2.getName());
//				admin.setEmail(admin2.getEmail());
//				admin.setPassword(admin2.getPassword());
//				admin.setPhone(admin2.getPhone());
//				admin.setGst(admin2.getGst());
//		return adminService.updateAdmin(admin);
//	}
}
