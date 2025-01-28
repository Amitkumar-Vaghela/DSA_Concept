class Book:
    def __init__(self, title, author, isbn, status="Available"):
        self.title = title
        self.author = author
        self.isbn = isbn
        self.status = status

    def issue_book(self):
        if self.status == "Available":
            self.status = "Issued"
            print(f"{self.title} has been issued.")
        else:
            print(f"{self.title} is already issued.")

    def return_book(self):
        if self.status == "Issued":
            self.status = "Available"
            print(f"{self.title} has been returned.")
        else:
            print(f"{self.title} was not issued.")

# Creating and managing books
book1 = Book("Python Programming", "John Smith", "123456789")
book1.issue_book()
book1.return_book()
