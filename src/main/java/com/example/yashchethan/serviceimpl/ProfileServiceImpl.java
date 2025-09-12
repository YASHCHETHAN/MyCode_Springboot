package com.example.yashchethan.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.yashchethan.entity.Profile;
import com.example.yashchethan.repositary.ProfileRepositary;
import com.example.yashchethan.service.ProfileService;

@Service
public class ProfileServiceImpl implements ProfileService{

	@Autowired
	ProfileRepositary profileRepositary;
	
	@Override
	public Profile createProfile(Profile profile) {
		return profileRepositary.save(profile);
	}

	@Override
	public Profile getProfile(int id) {
		return profileRepositary.findById(id).get();
	}

	@Override
	public Profile updateProfile(int id, Profile profile) {
		return profileRepositary.save(profile);
	}

	@Override
	public void deleteProfile(int id) {
		profileRepositary.deleteById(id);
	}

}
