package aTM

import java.util.Scanner


fun main(){
    val input = Scanner(System.`in`)
    var initialbalance=00.0
    val account=UserAccount(initialbalance)

    while (true){
        println("WELCOME...\n")
        println("1. CHECK BALANCE")
        println("2. DEPOSIT ")
        println("3. WITHDRAWAL")
        println("4.EXIT")

        println("please select your option")
        val choice:Int=input.nextInt()

        when(choice){
            1->println("Your balance is :R${account.checkBalance()}")
            2->{
                println("please enter the amount you wish to deposit..")
                val amount=input.nextDouble()
                account.deposit(amount)
            }
            3->{
                println("please enter the amount you wish to withdraw")
                val amount=input.nextDouble()
                account.withdraw(amount)
            }
            4->{
                println("GOODBYE..")
                return
            }
        }
    }

    }
