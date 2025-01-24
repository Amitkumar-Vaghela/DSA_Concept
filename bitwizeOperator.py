# Example numbers
a = 6   # Binary: 110
b = 3   # Binary: 011

# Bitwise AND (&) - Both bits must be 1
result_and = a & b  # Binary: 010 (Decimal: 2)
print(f"AND: {a} & {b} = {result_and}")

# Bitwise OR (|) - At least one bit must be 1
result_or = a | b  # Binary: 111 (Decimal: 7)
print(f"OR: {a} | {b} = {result_or}")

# Bitwise XOR (^) - Bits must be different
result_xor = a ^ b  # Binary: 101 (Decimal: 5)
print(f"XOR: {a} ^ {b} = {result_xor}")

# Bitwise NOT (~) - Inverts all bits (Unary operator)
result_not = ~a  # Binary: ...11111001 (Two's complement: -7)
print(f"NOT: ~{a} = {result_not}")

# Left Shift (<<) - Shift bits to the left, fill with 0s
result_lshift = a << 1  # Binary: 1100 (Decimal: 12)
print(f"Left Shift: {a} << 1 = {result_lshift}")

# Right Shift (>>) - Shift bits to the right, discard the rightmost bits
result_rshift = a >> 1  # Binary: 011 (Decimal: 3)
print(f"Right Shift: {a} >> 1 = {result_rshift}")

# Bitwise INVERT using XOR with all 1s (Alternate NOT behavior)
all_ones = 0b11111111  # 8-bit mask
result_invert = a ^ all_ones  # Binary: ...11110001 (Two's complement: -7)
print(f"INVERT (using XOR with 1s): {a} ^ {all_ones} = {result_invert}")



# AND: 6 & 3 = 2
# OR: 6 | 3 = 7
# XOR: 6 ^ 3 = 5
# NOT: ~6 = -7
# Left Shift: 6 << 1 = 12
# Right Shift: 6 >> 1 = 3
# INVERT (using XOR with 1s): 6 ^ 255 = 249



# Explanation:
# AND: Keeps bits that are 1 in both numbers.
# OR: Keeps bits that are 1 in either number.
# XOR: Keeps bits that are 1 in only one number (not both).
# NOT: Flips all bits (including the sign bit).
# Left Shift: Multiplies the number by 2 for each shift.
# Right Shift: Divides the number by 2 (integer division) for each shift.
# INVERT: An alternative way to invert bits using XOR with all 1s.

