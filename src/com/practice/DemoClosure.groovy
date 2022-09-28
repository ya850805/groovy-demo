package com.practice

def running = { who ->
    println("$who running start...")
    println("$who running end...")
}

running("Jason")
running.call("Juan")

/*********************************************/

def run(Closure closure) {
    println("run start")
    closure()
    println("run start")
}

run({println("closure...")})

/*********************************************/

def calculate(num1, num2, Closure closure) {
    closure(num1, num2)
}

//閉包最為方法的最後一個參數，那麼閉包可以寫在方法外面
calculate(10, 15) {n1, n2 ->println("$n1 * $n2 = ${n1 * n2}")}