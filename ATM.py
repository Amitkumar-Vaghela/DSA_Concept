class Bank:
    def __init__(self, balance, account):
        self.balance = balance
        self.account = account

    def debit(self, amount):
        try:
            amount = int(amount)  # Convert the input to integer
            if amount <= self.balance:  # Check if balance is sufficient
                self.balance -= amount
                print(f"Rs {amount} was successfully debited from your account")
                print(f"Total amount in your account is: Rs {self.get_balance()}")
            else:
                print("Insufficient funds.")
        except ValueError:
            print("Invalid input. Please enter a valid amount.")

    def credit(self, amount):
        try:
            amount = int(amount)  # Convert the input to integer
            if amount > 0:  # Ensure that credit amount is positive
                self.balance += amount
                print(f"Rs {amount} was successfully credited to your account")
                print(f"Total amount in your account is: Rs {self.get_balance()}")
            else:
                print("Please enter a positive amount to credit.")
        except ValueError:
            print("Invalid input. Please enter a valid amount.")

    def get_balance(self):
        return self.balance


# Example usage
acc1 = Bank(10000, "Amitkumar7777")

# Debit and credit example
acc1.debit(input("Enter the amount to debit from your account: "))
acc1.credit(input("Enter the amount to add to your account: "))
