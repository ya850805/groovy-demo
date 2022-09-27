package com.practice

//1.1 增：在集合添加元素
def list = [5, 6, 7, 8]
assert list instanceof java.util.List
list.add(12)
println(list.size())

//1.2 增：集合與集合相加
def list2 = [1, 2, 3, 4]
println(list.plus(list2))

/*******************************************************/

//2.1 刪：刪除下標為2的元素
list.remove(2)
println(list)

//2.2 刪：刪除集合中指定的元素
list.removeElement(12)
println(list)

//2.3 刪：從list集合中刪除另一個list的元素
def list3 = [6, 8]
list.removeAll(list3)
println(list)

//2.4 刪：從list表中彈出最後一個元素
println(list.pop())
println(list)

/*******************************************************/

//3.1 修改
list.putAt(2, 10) //等同於list[2] = 10
println(list)

/*******************************************************/

//4.1 遍歷
[1, 2, 3].each({
    println("Item: $it")
})

/*******************************************************/

//map，key可以不使用引號，也可以使用單引號或雙引號
def map = [J: "Java", "K": "Kotlin", 'G': "Groovy"]
map.put("P", "Python")
println("map：$map")

/*******************************************************/

//map刪除
map.remove("P")
map.remove("J", "Java")
println("刪除後：$map")

/*******************************************************/

//map修改，"+" "-"操作符重載
map2 = map - [K: "Kotlin"]
println(map2)

map3 = map + [G: "Gradle"] //key相同會覆蓋
println(map3)

/*******************************************************/

//map遍歷
map.each({ key, value ->
    println("key=$key value=$value")
})

map.each({ entry ->
    println("key=$entry.key value=$entry.value")
})

















