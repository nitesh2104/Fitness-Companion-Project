package com.example.team_foxhound.minicapstone_project.UserManagement;//
//
//  Generated by StarUML(tm) Java Add-In
// @ Company: @FOXHOUND.INC
//  @ Project : @FitnessCompanion
//  @ Author : @Ahmed, Nitesh, Nauman, Philippe
//
//


import android.widget.EditText;

import com.example.team_foxhound.minicapstone_project.MainActivity;
import com.example.team_foxhound.minicapstone_project.R;
import com.example.team_foxhound.minicapstone_project.UserManagement.SuperUser;

public class SubUser extends SuperUser {
	public int age;
	public int weight;
	public int height;

	SubUser user = new SubUser();

    EditText username = (EditText)findViewById(R.id.editText);
    EditText password = (EditText)findViewById(R.id.editText3);

//	user.setfName(username);
//	user.setlName(lastName);
//	user.setUsername(username);
//	user.setPassword(password);


	public final void modifyProfile() {

	}

	public void setPreferences(Boolean[] preferences, int Type) {

	}


}
