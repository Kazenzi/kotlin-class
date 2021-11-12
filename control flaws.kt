fun main(args: Array<String>) {
    var nambari=56
    if (nambari<=45) {
        println("not true")

    }else{
        println("true")
    }
    var jina="james"
    if (jina == "james") { println("save the name")

    }else{
        println("continue search")}
//when expression
    var ch = 'A'

    when(ch){

        'A' -> println("A is a Vowel")
        'E' -> println("E is a Vowel")
        'I' -> println("I is a Vowel")
        'O' -> println("O is a Vowel")
        'U' -> println("U is a Vowel")

        else -> println("$ch is a Consonant")
    }
    var occupation="farmer"
    when(occupation){
        "teacher"-> println("am a teacher")
        "doctor"-> println("am a doctor")
        else -> println("no occupation")
    }
//for loop
    for(n in 10..15){
        println("Loop: $n")
    }

    for (k in 20..25)
        println("$k")
//while loop

    var num = 10

    while(num>=5){
        println("Loop: $num")
        num--
    }
    var namba =20
    while (namba<=20){
        println("$namba")
        namba++
    }
    //do-while loop
    var nam = 100
    do {
        println("Loop: $nam")
        nam++
    }
    while (nam<=105)


//continue

    for (n in 1..5){
        println("before continue, Loop: $n")
        if(n==2||n==4)
            continue

        println("after continue, Loop: $n")

    }
    //abreak
    for(n in 1..10){
        println("before break, Loop: $n")
        if (n==5) {
            println("I am terminating loop")
            break
        }
    }

}