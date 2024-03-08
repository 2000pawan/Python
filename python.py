class Arithmatic():
    def sum(x,y):
        return x+y
    def sub(x,y):
        return x-y
    def multyply(x,y):
        return x*y
    def divide(x,y):
        return x//y
x=int(input())
y=int(input())
operation=Arithmatic()
z=operation.multyply(x,y)
print(z)