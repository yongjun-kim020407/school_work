import java.util.ArrayList;

public class AccountMain{
    public static void main(String[] args){
        ArrayList<Account> account = new ArrayList<>();
        account.add(new CheckingAccount("Cho", 1.0)); //업 캐스팅
        account.get(0).deposit(100000);
        SavingsAccount savings = new SavingsAccount("Cho2", 3.5);
        savings.setmonthlyPayment(50000);
        savings.setduration(12);
        savings.deposit(50000);
        savings.deposit(5000);
        savings.withdraw(50000);
        account.add(savings);
        for(int i = 0; i< account.size(); i++ ){
            if(account.get(i).getOwner().equals("Cho")){
                System.out.println(account.get(i).getAcctNum());
            }
        }  
        account.get(0).close();
        account.get(0).deposit(100);
        System.out.println(account.get(0).getAcctNum());    

    }
}