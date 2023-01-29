package rw.ac.onbank.orm.appDos.deos.daoImplementors;

import rw.ac.onbank.orm.appDos.deos.daos.BankDao;
import rw.ac.onbank.orm.appDos.deos.DAO;
import rw.ac.onbank.orm.entities.Bank;

import java.util.List;

public class BankDaoImplementor extends DAO implements BankDao {

  
    MessagesAndOptionsPrinter printer = new MessagesAndOptionsPrinter();
    Session session = getSession();

    @Override
    public List<Bank> getAvailableBanks() {
        return null;
    }

    @Override
    public Bank getBankById(long id) {
        return null;
    }

    @Override
    public Bank saveBank(Bank bank) {

            try{
                Transaction transaction = session.beginTransaction();
                session.saveOrUpdate(bank);
                transaction.commit();
            }catch(Exception e){
                printer.print("Error" + e.getMessage());
                
            }finally{
                   session.close();
            }

    @Override
    public boolean deleteBankById(long id) {
        return false;
    }
}
