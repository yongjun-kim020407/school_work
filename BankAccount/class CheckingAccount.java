class  CheckingAccount extends Account{

    
    CheckingAccount(String owner, double rate){
        super(owner, rate);
    }

    @Override
    String generateAcctNum(){
        return BankUtil.generateAcctNum(101, 201, 10000, 50000); 
    }
}