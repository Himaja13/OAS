package com.cg.oas.service;

import java.util.ArrayList;

import com.cg.oas.entities.Login;
import com.cg.oas.entities.UserTable;

public interface IUserService
{
    public UserTable addUserDetails(UserTable user);
    public Login addLoginDetails(Login login);
    public ArrayList<UserTable> getAllUserDetails();
   // public ArrayList<Login> getAllLoginDetails();
    public UserTable getUserDetailsById(String userId);
    public Login getLoginDetailsById(String userId);
    public Login deleteUserDetailsById(String userId);
    public Login deleteLoginDetailsById(String userId);
    public Login changePassword(Login login );
    public Login resetPassword(Login login );
    public UserTable updateUserDetails(UserTable user);
    //add more function if require as per requirnment

    
}
