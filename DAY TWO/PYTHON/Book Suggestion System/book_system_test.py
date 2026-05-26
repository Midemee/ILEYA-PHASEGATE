import unittest

import book_system

class TestThatBookSuggestionFunctionWorks(unittest.TestCase):
    
    def test_that_suggested_book_is_from_the_list(self):
        books = ["Solo", "SuperIntelligence", "India After Ghandi", "Dream Count", "Gaza", "Ripple", "hidden Genius", "The Attributes"];
        suggested_book = book_system.get_suggested_books(books)
        self.assertIsNotNone(suggested_book)
        print("Suggested book", suggested_book)
              
    def test_that_the_pagenumber_is_between_one_and_hundred(self):
        pagenumber = book_system.get_pagenumber()
        self.assertTrue(pagenumber >= 1)
        self.assertTrue(pagenumber <= 100)
        print("PageNumber", pagenumber)
       
    def test_that_one_book_is_added(self):
       books = ["Solo", "SuperIntelligence", "India After Ghandi", "Dream Count", "Gaza", "Ripple"];
       new_book = "Hidden Genius"    
       actual =  book_system.add_books(books, new_book)
       result = ["Solo", "SuperIntelligence", "India After Ghandi", "Dream Count", "Gaza", "Ripple", "Hidden Genius" ];
       self.assertEqual(actual, result)
       
       
    def test_that_one_book_is_removed(self):
       books = ["Solo", "SuperIntelligence", "India After Ghandi", "Dream Count", "Gaza"];
       remove_book = "SuperIntelligence"    
       actual = book_system.remove_books(books, remove_book)
       result = ["Solo", "India After Ghandi", "Dream Count", "Gaza"];
       self.assertEqual(actual, result)
       
       
    def test_that_book_name_is_updated_after_changes(self):
       books = ["Solo", "SuperIntelligence", "India After Ghandi", "Dream Count", "Animal Farm", "Gaza"];
       old_bookname = "Animal Farm"
       updated_bookname = "Animal Kingdom"
       actual = book_system.update_books(books, old_bookname, updated_bookname)
       result = ["Solo", "SuperIntelligence", "India After Ghandi", "Dream Count", "Animal Kingdom", "Gaza"];
       self.assertEqual(actual, result)
       
       
    def test_that_all_books_is_shown(self):
       books = ["Solo", "SuperIntelligence", "India After Ghandi", "Dream Count", "Gaza", "Ripple", "hidden Genius", "Option B", "The Attributes", "Animal Farm"];   
       actual = book_system.show_books(books)
       result = ["Solo", "SuperIntelligence", "India After Ghandi", "Dream Count", "Gaza", "Ripple", "hidden Genius", "Option B", "The Attributes", "Animal Farm"]
       self.assertEqual(actual, result)
            
    
        
