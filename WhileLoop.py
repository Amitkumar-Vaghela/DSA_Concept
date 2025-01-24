# List example
my_list = [10, 20, 30, 40, 50]
i = 0
print("Iterating through a list:")
while i < len(my_list):
    print(my_list[i])
    i += 1

# Dictionary example
my_dict = {'a': 1, 'b': 2, 'c': 3}
keys = list(my_dict.keys())
i = 0
print("\nIterating through a dictionary (keys and values):")
while i < len(keys):
    key = keys[i]
    print(f"{key}: {my_dict[key]}")
    i += 1

# Tuple example
my_tuple = (100, 200, 300, 400)
i = 0
print("\nIterating through a tuple:")
while i < len(my_tuple):
    print(my_tuple[i])
    i += 1

# Set example
my_set = {5, 10, 15, 20}
set_list = list(my_set)  # Convert set to list (because set is unordered)
i = 0
print("\nIterating through a set:")
while i < len(set_list):
    print(set_list[i])
    i += 1







# Iterating through a list:
# 10
# 20
# 30
# 40
# 50

# Iterating through a dictionary (keys and values):
# a: 1
# b: 2
# c: 3

# Iterating through a tuple:
# 100
# 200
# 300
# 400

# Iterating through a set:
# 5
# 10
# 15
# 20
