package bank.dao;

import java.util.ArrayList;
import bank.model.Account;

public class AccountDAO {
	static ArrayList<Account> account=new ArrayList<Account>();
	
	public void insertNewAccount(Account ac){
		account.add(ac);
	}
	public void deleteAccount(Account ac){
		account.remove(ac);
	}
	public ArrayList<Account> getAccount(){
		return account;
	}
	public void setAccount(ArrayList<Account> ac){
		this.account=ac;
	}
	public Account selectOneAccount(String id){
		for(int i=0;i<account.size();i++){
			Account temp=account.get(i);
			if(temp.getId().equals(id))
				return temp;
		}
		return null;
	}
	public void replaceAccount(Account oldAccount){
		for(int i=0;i<account.size();i++){
			Account temp=account.get(i);
			if(oldAccount.getId().equals(temp)){
				account.set(i,oldAccount);
			}
		}
	}
}
