package com.practice

def desc = "測試"

def str1 = '單引號，不支持變量引用，不支持換行操作，${desc}'
println(str1)

def str2 = "雙引號，支持變量引用，不支持換行操作，${desc}"
println(str2)

def str3 = '''模板字符串，不支持變量引用，支持
                        換行操作，${desc}'''
println(str3)

//基本數據類型也可以作為物件使用，可以調用物件的方法
println(str1.getClass().toString())
println(str2.getClass().toString())
println(str3.getClass().toString())