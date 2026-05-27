from book_system import *
booklist = ["Solo", "SuperIntelligence", "India After Ghandi", "Dream Count", "Gaza", "Ripple", "hidden Genius", "The Attributes"];
inbook_system = True
while inbook_system:
    print(""" 
    Welcome to the Book Suggestion System!
    0. Exit
    1. Get Suggestions
    2. Add Book
    3. Remove Book
    4. Update book
    5. Show all books

""")

    user_choice = int(input("Choose from options: "))
 
    match user_choice:
        
        case 0:
            inbook_system = False
            print("Exiting the Book Suggestion System")
        
        case 1:
            print("Book for the Day:\nBook Title: ", end ="")
            print(get_suggested_books(booklist))
            print("Page: ", end ="")
            print(get_pagenumber())
            
            optional = input("Would you like to get another suggestion? (yes/no): ")
            
            while (optional.lower() == "yes"):
            
                print("Book for the Day:\nBook Title: ", end ="")
                print(get_suggested_books(booklist))
                print("Page: ", end ="")
                print(get_pagenumber())
                
                optional = input("Would you like to get another suggestion? (yes/no): ")
                
        case 2:
            
            book_name = input("Enter the book title: ")
            add_books(booklist, book_name)
            print("Book successfully added !")
            
        case 3:

            book_name = input("Enter the book title to remove: ")
            remove_books(booklist, book_name)
            print("Book successfully removed!")
            
            
        case 4:

            old_bookname = input("Enter the old book title: ")
            new_bookname = input("Enter the new book title: ")
            update_books(booklist, old_bookname, new_bookname)
            print("Book updated successfully!")
            
        case 5:
            print("All Books")
            count = 1
            for elements in show_books(booklist):
                print(f"{count}. {elements}")
                count+=1
            
        case _:
            print("Invalid Choice, Please choose from 0-5")
                
                
        
