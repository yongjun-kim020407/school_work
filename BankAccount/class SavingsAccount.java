class SavingsAccount extends Account{
    private int monthlyPayment;
    private int duration;
    private int paymentCount;
    private int fixedamount; 
    
    public int getduration(){
        return duration;
    }

    public void setduration(int amount){
        duration = amount;
    }

    public void setmonthlyPayment(int amount){
        monthlyPayment = amount;
    }

    public int getmonthlyPayment(){
        return monthlyPayment;
    }

    SavingsAccount(String owner, double rate){
        super(owner, rate);
    }

    @Override 
    String generateAcctNum(){
        return BankUtil.generateAcctNum(201, 301, 10000, 50000);
    }
   
    @Override
    void withdraw(int amount){
        System.out.println("출금이 불가능한 계좌입니다.");
    }
    @Override
    void deposit(int amount){
        if(isClosed()){
            System.out.println("해지된 계좌입니다.");
        }
        else if(amount != getmonthlyPayment()){
            System.out.println("정해진 금액만 입금해주세요.");
        }
        else if(paymentCount >= getduration()){
            System.out.println("만기 되었습니다.");
        }
        else {
            super.deposit(amount);
            paymentCount++;
        }
    }
    
}