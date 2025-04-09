package aTM

class UserAccount(private var balance:Double) {

    //depositing amount to users account

    fun deposit(amount:Double){
        if (amount>0){
        balance += amount
            println("You have deposited R $amount into your Account")
            println("Your new Balance is :R $balance")
        }else{
            println("please Enter valid amount")
        }
    }

    fun withdraw(amount: Double){
        if (amount>0&&amount<=balance){
            balance -= amount
            println("Your R$balance withdrawal was a success")
            println("Your new balance is :R$balance")
        }else{
            println("something went wrong..")
        }
    }

    fun checkBalance():Double{
        return balance
    }
}