>>>>>>>>>>   Here is my Ruby _________________________________
 
Variables in Ruby 
=================

Local variable    -----> Defined in Method bracket--start with lower case or '_'
Instance variable -----> Defined inside Method body --start with '@'                  -----> Note this kind of variable are shared accross class methods 
Class variable  -----> Available across obj and its child --start with  '@@'
Glopal variable -----> Available across classes -- start with '$'

Creating class 
===============

 Cust1 =customer.new --->new is uniqe type of method which is predefined in Ryby libarary .new method belongs to Class method 

=====>The Constructor method in Ruby -->(intialize method)

class Customer 
 def initialize(id,name,addr)
@cust_id=id
@cust_name=name
@cust_add=addr
 end
end

Note --> any method in ruby start with def and end
     --> Constructor method called initialize in Ruby
     --> Method name prefered to be in lower case in Ruby
     --> In Ruby you can accesse value of any variable or constant by putting a         hash'(#)' before that variable
    
 
The '.' and '::'  operators.
===========================
1. '::' ---> is unary opertor that allows Constants,Instance method,class method --->defined whith class or module to be accessed from anywhere outside class or     module
Ex--> :: My_const=9  # set glopal My_const to 9 (defined in main file ,obj,     module,etc)
  --> Foo::My_const  # set local My_const of Module foo differ from glopal const                     above 

Ruby if...else  Statment
=========================
x=5
if x>1         ##(write then here or new line)
puts "x is greater than one"
elsif x<=11   ##(write then here or new line)
puts "x is less than 1"
else
puts "Is that a number ???"


Ruby Unless_Statment
=====================
x=1
unless x>2
   puts "x is less than 2"
 else
  puts
--->Executes code if condition is false 


Ruby Unless_Modifier
=====================

print "here is my value " if $var
print "here is my value " unless $var

Ruby case Statment
===================

$age =  5
case $age
when 0 .. 2
    puts "baby"
when 3 .. 6
    puts "little child"
when 7 .. 12
    puts "child"
when 13 .. 18
    puts "youth"
else
    puts "adult"
end

Ruby while Statment
====================
$i = 0
$num = 5

while $i < $num  do  # 'do' or just new line
   puts("Inside the loop i = #$i" )
   $i +=1
end

===>Ruby while ((modifier))

$i= 0
$num = 5
begin
   puts("Inside the loop i = #$i" )
   $i +=1
end while $i < $num


Ruby -->for loop
==================

for i in 0..5 # for variable i between (0 to 5)
  puts "value of local variable is #{i}"
end 

 next -->reserved word it will jump from that line to the next loop iteration 
 redo -->Restarts this iteration of the most internal loop, without checking           loop condition. may go for infinit loop
 retry -->retry appears in rescue clause of begin expression, restart from the 
          the begining of the ___begin body  

Ruby method
============= 
every method on ruby return value by default the returned value of the last     segment
Note--> Ruby can return one or more value of Ruby_method
ex return 1,C,2,etc.,etc..

==>( Define method accept any number of parameter in Ruby )---------------------

def sample (*test)
   puts "The number of parameters is #{test.length}"
   for i in 0...test.length
      puts "The parameters are #{test[i]}"
   end
end
sample "Zara", "6", "F"
sample "Mac", "36", "M", "MCA"
-----------------------------------------------------------------------

===> What is alias and alias_method in Ruby
  Alias works as nick_name for method or variable this can be helpful if you 
  want to override the behaviour of  some methood without changing the origion 
  implementation 
  Alias_method--->????????????? 

===> Doses Ruby support Method_Overloading ?_

In ruby there can be only one method with a given name. If there is multiple methods with the same name,the last one prevail i,e the last method will be invoked when called.



