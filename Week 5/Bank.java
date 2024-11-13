import java.util.*;
abstract class Account {
   String Cust_name ,Acc_num;
   double balance;
   Account(String Cust_name,String Acc_num, double inti_bala){
           this.Cust_name=Cust_name;
           this.Acc_num=Acc_num;
           this.balance=inti_bala;
  }
  abstract void deposit(double amt);
  abstract void displayBalance();
  abstract void withdraw(double amt);
}

class Sav_Acct extends Account{
    double intrestRate;
    Sav_Acct(String Cust_name,String Acc_num, double inti_bala){
                   super(Cust_name,Acc_num,inti_bala);
                   this.intrestRate=intrestRate;
    }
    void deposit(double amt){
       balance+=amt;
    }
    void displayBalance(){
        System.out.println("Saving Balance:"+balance);
    }
    void withdraw(double amt){
     if(amt<=balance){
        balance-=amt;
     }
    }
    void computeAndDepositeIntrest(){
         balance+=balance*intrestRate/100;
    }
}

class Cur_Acct extends Account{
   static final double MIN_BALANCE=1000, SEVICE_CHARGE=50;
   Cur_Acct(String Cust_name,String Acc_num, double inti_bala){
               super(Cust_name,Acc_num,inti_bala);
   }
   void deposit(double amt){
       balance+=amt;
   }
   void displayBalance(){
        System.out.println("Saving Balance:"+balance);
   }
   void withdraw(double amt){
     if(amt<=balance){
        balance-=amt;
        if(balance<MIN_BALANCE){
           balance-=SEVICE_CHARGE;
        }
     }
   }
}

class Bank{

    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter account type(savings/current):");
        String type=scn.nextLine();
 
        System.out.println("Enter account name:");
        String name=scn.nextLine();

        System.out.println("Enter account number:");
        String number=scn.nextLine();

       Account account;
       if(type.equals("Savings")){
           System.out.println("Initial balance and interest rate:");
           account=new Sav_Acct(name,number,scn.nextDouble());
      }
      else{
          System.out.println("Intial balance :");
          account =new Cur_Acct(name,number,scn.nextDouble());
      }
      while(true){
           System.out.println("1.Deposit  2.Display Balance    3.Withdraw   4.Interest   5.Exit");
           int choice=scn.nextInt();
           switch(choice){
              case 1:account.deposit(scn.nextDouble());
                     break;
              case 2: account.displayBalance();
                      break;
              case 3: account.withdraw(scn.nextDouble());
                      break;
              case 4: if(account instanceof Sav_Acct){
                      ((Sav_Acct)account).computeAndDepositeIntrest();
                      }
                      break;
              case 5 : return;
            }
      }
  }
}
