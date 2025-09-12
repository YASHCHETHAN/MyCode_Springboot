package com.example.yashchethan.service;

import com.example.yashchethan.entity.Profile;

public interface ProfileService {

	Profile createProfile(Profile profile);

	Profile getProfile(int id);

	Profile updateProfile(int id, Profile profile);

	void deleteProfile(int id);

}
