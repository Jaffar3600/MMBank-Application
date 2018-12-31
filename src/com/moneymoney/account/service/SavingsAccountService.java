package com.moneymoney.account.service;

import java.sql.SQLException;
import java.util.List;

import com.moneymoney.account.SavingsAccount;
import com.moneymoney.exception.AccountNotFoundException;

public interface SavingsAccountService {

	SavingsAccount createNewAccount(String accountHolderName, double accountBalance, boolean salary) throws ClassNotFoundException, SQLException;

	SavingsAccount updateAccount(SavingsAccount account);

	SavingsAccount getAccountById(int accountNumber) throws ClassNotFoundException, SQLException, AccountNotFoundException;

	SavingsAccount deleteAccount(int accountNumber) throws ClassNotFoundException, SQLException;
	
	List<SavingsAccount> getAllSavingsAccount() throws ClassNotFoundException, SQLException;
	double checkBalance(int accountNumber) throws ClassNotFoundException, SQLException, AccountNotFoundException;
	void fundTransfer(SavingsAccount sender, SavingsAccount receiver, double amount) throws ClassNotFoundException, SQLException;
	void deposit(SavingsAccount account, double amount) throws ClassNotFoundException, SQLException;
	void withdraw(SavingsAccount account, double amount) throws ClassNotFoundException, SQLException;

	List<SavingsAccount> sortByAccountHolderName() throws ClassNotFoundException, SQLException;
	List<SavingsAccount> sortByAccountBalance() throws ClassNotFoundException, SQLException;
	SavingsAccount seachByAccountNumber(int accountNumber) throws ClassNotFoundException, SQLException, AccountNotFoundException;

	SavingsAccount AccountHolderName(String accountHolderName) throws SQLException, ClassNotFoundException, AccountNotFoundException;

	


	SavingsAccount updateAccount(String newAccountHolderName,
			int accountNumber, boolean salary) throws SQLException,
			ClassNotFoundException;

	void sortByName(int accountNumber, String accountHolderName) throws ClassNotFoundException, SQLException;

	List<SavingsAccount> sortByAccountNumber() throws ClassNotFoundException, SQLException;

	
	
}











