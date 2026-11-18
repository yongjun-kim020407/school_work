abstract class Account{
    private String owner; //소유주
    private int balance; //잔고
    private String number; // 계좌번호
    private double interestRate; //이자율
    private boolean closed; // 계좌 해지 여부 


    public Account(String owner, double rate){
        this.owner = owner;
        interestRate = rate;
        this.number = generateAcctNum();
    }
    public int getBalance(){
        return balance;
    }
    public void setBalance(int amount){
        balance = amount;
    }
    public String getOwner(){
        return owner;
    }

    public boolean isClosed(){
        return closed;
    }
    public String getAcctNum(){
        return number;
    }

    void deposit(int amount){
        if(!closed){
            balance += amount;
        }
        else
            System.out.println("계좌가 해지 상태입니다.");
    }
    void withdraw(int amount){
        if(!closed ){
            if(balance >= amount){
                balance -= amount;
                System.out.println( amount + "출금");
            }
            else{
                System.out.println("잔고가 출금 하려는 돈보다 적습니다.");
            }
        }
        else{
            System.out.println("계좌가 해지 상태입니다.");
        }
            
    
    }
    void close(){
        closed = true;
        System.out.println("계좌 " + getAcctNum() +"를 해지." +balance + "원을 환급" );
        balance = 0;
    
    }
    abstract String generateAcctNum();
    @Override
    public String toString(){
        return getOwner() + " " + getAcctNum() + " " +  getBalance() + " 해지상태: " + closed;
    }
    
}   