# n = int(input("Enter an Odd Number:"))
# if n % 2 == 0:
#     print("Enter a valid odd number.....")
# else:
#     for i in range(3, 6, 2):
#         for j in range(i):
#             print("*", end="")
#         for k in range(i):
#             print("@",end='')
#         print("\n")
#     for i in range(5, 2, -2):
#         for j in range(i):
#             print("*", end="")
#         print("\n")
rows = int(input("Enter number of rows: "))

k = 0

for i in range(1, rows + 1):
    for space in range(1, (rows - i) + 1):
        print(end=" ")

    while k != (2 * i - 1):
        print("* ", end="")
        k += 1

    k = 0
    print()
