package com.virtualkeyrepository;

public class LockedMeMain {

	public static void main(String[] args) {
		
        FileOperations.createMainFolderIfNotPresent("Main");
         
        MenuOptions.printWelcomeScreen("LockedMe","Prathamesh Chinchamalatpure");
         
        HandleOptions.handleWelcomeScreenInput();
         
	}

}
