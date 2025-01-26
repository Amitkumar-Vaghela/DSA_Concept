# 1>  non-static method 

class Student:
   # Class attribute

    def __init__(self, name, marks):  # Parameterized constructor
        self.name = name 
        self.marks = marks  
       
    # Method is also know as function 
    
    def get_avg(self):
        sum = 0
        for val in self.marks:
            sum += val
        print("hi",self.name ,"Your score is:",sum/3)   

    
# Creating an object of the Student class
s1 = Student ("Amitkumar", [50,30,100])
s1.get_avg()   # 60.0






#2> Static method  which is no need self parameter inside function 
#   usign @staticmethod


