import random

def get_suggested_books(booklist):

    return random.choice(booklist)
        

def get_pagenumber():

     return random.randint(1,100)

        
def add_books(booklist, book_name):

    booklist.append(book_name)
    return booklist


def remove_books(booklist, book_name):

    booklist.remove(book_name)
    return booklist



def update_books(booklist, old_bookname, new_bookname):

    booklist.insert(booklist.index(old_bookname), new_bookname)
    booklist.remove(old_bookname)
    return booklist


def show_books(booklist):

    return booklist
    

    
