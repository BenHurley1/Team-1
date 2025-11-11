a, b = 0, 1

# Bug added: Sum even starts at 1 instead of 0. Jonas Hemmett
sum_even = 1

while b < 4000000:
    if b % 2 == 0:
        
        # Bug added: Subtracts b instead of adding b. Jonas Hemmett
        sum_even -= b
    a, b = b, a+b

print(sum_even)

# answer should be 4613732
