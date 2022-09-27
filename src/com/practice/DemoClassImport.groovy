package com.practice

import groovy.xml.MarkupBuilder

import java.text.SimpleDateFormat

def xml = new MarkupBuilder()
assert xml != null

def sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
println(sdf.format(new Date()))