package com.example.firstlotlin

fun main(){
    var computer= ""
    var human=""
    println("rock,paper & scissor enter your choice!")
    human= readln()
    var randoms=(1..3).random()
    when(randoms){
        1 ->{
            computer="rock"
        }
        2 ->{
            computer="paper"
        }
        3 ->{
            computer="scissors"
        }
    }
    println(computer)
    var winner =when{
        human == computer ->"tie"
        human == "rock" && computer =="scissors" -> "human"
        human == "scissors" && computer =="paper" -> "human"
        human == "paper" && computer =="rock" -> "human"
        else -> "computer"
    }
    when(winner){
        "tie" -> {
            println("it's a tie")
        }
        "human" -> {
            println("you won!")
        }
        "computer" -> {
            println("computer won!")
        }

    }


}