package com.ramesh9705.Reservation.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ramesh9705.Reservation.Dto.Admin;
import com.ramesh9705.Reservation.Repository.AdminRepository;
@Repository
public class AdminDao
{
	@Autowired
	AdminRepository adminRepository;

	public Admin saveAdmin(Admin admin)
	{
		return adminRepository.save(admin);
	}

	public Admin updateAdmin(Admin admin)
	{
		return adminRepository.save(admin);
	}

	public Optional<Admin> finddById(int id)
	{
		return adminRepository.findById(id);
		
	}

	public Optional<Admin> verifyAdmin(long phone, String password)
	{
		return adminRepository.verifyAdmin(phone, password);
	}

	public List<Admin> findAllAdmins()
	{
		return adminRepository.findAll();
	}
}
