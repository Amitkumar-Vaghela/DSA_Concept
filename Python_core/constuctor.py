# creating class
class Student:
    
  # parameterise consturctor 
  def __init__(self, name, marks):
    self.name = name
    self.marks= marks
    print("Adding student name in database so my constructor is defaulted is  working")


#created object (instance)
s1 = Student("Amitkumar",97)

print(s1.name,s1.marks)


