package com.moneymoney.account.dao;

import java.sql.SQLException;
import java.util.List;

import com.moneymoney.account.SavingsAccount;
import com.moneymoney.exception.AccountNotFoundException;

public interface SavingsAccountDAO {
	
	SavingsAccount createNewAccount(SavingsAccount account) throws ClassNotFoundException, SQLException;
	
	SavingsAccount getAccountById(int accountNumber) throws ClassNotFoundException, SQLException, AccountNotFoundException;
	SavingsAccount deleteAccount(int accountNumber) throws ClassNotFoundException, SQLException;
	List<SavingsAccount> getAllSavingsAccount() throws ClassNotFoundException, SQLException;
	void updateBalance(int accountNumber, double currentBalance) throws ClassNotFoundException, SQLException;
	void commit() throws SQLException;
	double checkCurrentBalance(int accountNumber) throws ClassNotFoundException, SQLException, AccountNotFoundException;
	
	SavingsAccount seachByAccountNumber(int accountNumber) throws SQLException, ClassNotFoundException, AccountNotFoundException;
	SavingsAccount seachByAccountName(String accountHolderName) throws SQLException, ClassNotFoundException, AccountNotFoundException;
	SavingsAccount updateAccount(String newAccountHolderName, int accountNumber,boolean salary) throws SQLException, ClassNotFoundException;

	void sortByName(int accountNumber, String accountHolderName) throws ClassNotFoundException, SQLException;

	List<SavingsAccount> sortByaccountHolderName() throws ClassNotFoundException, SQLException;

	List<SavingsAccount> sortByaccountBalance() throws ClassNotFoundException, SQLException;

	List<SavingsAccount> sortByaccountNumber() throws ClassNotFoundException, SQLException;
	
	

}
