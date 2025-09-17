/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class AccountDirectory {
    
    private ArrayList<Account> accounts;
    public AccountDirectory() {
        this.accounts = new ArrayList<Account> ();
    }
    
    public ArrayList<Account> getAccount() {
        return accounts;
    }

    public void setAccount(ArrayList<Account> account) {
        this.accounts = account;
    }
    
    public Account addAccount(){
        Account a=new Account();
        accounts.add(a);
        return a;
    }
    
    public void deleteAccount(Account account){
        accounts.remove(account);
    }
}
