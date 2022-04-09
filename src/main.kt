fun main(){
   oddNum()
    var w=longNames(arrayOf("Nailantei","Zipporah","Layla","Ian","Esther","Romezu","Minicu"))
    println(w)
    robotwaiter(2)
    robotwaiter(6)
    robotwaiter(15)
    robotwaiter(25)

    numNewLine()
}

//1. Create a function that prints out all the odd numbers between 1 and 100 (2pts)

fun oddNum(){
    for (n in 1..100)
        if(n % 2 != 0)
            println(n)
}

//2. Create a function that takes in an array of names and returns the number of
//names longer than 5 characters (2pts

fun longNames(names:Array<String>):Int{
    var name=0
    names.forEach { new->
        if(new.length > 5) {
        name+=1
        }
    }
    return name
}
//3.You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age. (2pts)

fun robotwaiter(guests:Int){
    if (guests < 6){
        println("gets milk")
    }
    else if (guests>6 && guests<=15){
        println("gets fanta orange")
    }
    else{
        println("gets coca cola")
    }
    return
}

//4. Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number. (4pts)

fun numNewLine(){
    for (numb in 1..100)
    if (numb%3==0 && numb%5==0){
        println("FizzBuzz")
    }
    else if (numb%5==0){
        println("Buzz")
    }
    else if (numb%3==0){
        println("Fizz")
    }
    else{
        println(numb)
    }

}
