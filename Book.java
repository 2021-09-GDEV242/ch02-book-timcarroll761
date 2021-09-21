/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @Tim Carroll
 * @9/20/12
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean textbook)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = 0;
        courseText = textbook;
    }

    // Add the methods here ...
    // Return the author
    public String getAuthor(){
        return author;
    }
    
    //Return the title
    public String getTitle(){
        return title;
    }
    
    //Return the number of pages
    public int getPages(){
        return pages;
    }
    
    //Return the reference "number" string
    public String getRefNumber(){
        return refNumber;
    }
    
    //Return the number of times this book was checked out
    public int getBorrowed(){
        return borrowed;
    }
    
    //Increment the borrow counter
    public void borrow(){
        borrowed++;
    }
    
    //Returns whether or not this is a course textbook
    public boolean isCourseText(){
        return courseText;
    }
    
    //Set the reference "number" string
    public void setRefNumber(String ref){
        if (ref.length() >= 3)
            refNumber = ref;
        else
            System.out.println("The entered reference number is too short.");
    }
    
    //Print the author
    public void printAuthor(){
        System.out.println("The author is " + author);
    }
    
    //Print the title
    public void printTitle(){
        System.out.println("The title is " + title);
    }
    
    //Print all stored info
    public void printDetails(){
        System.out.print("Title: " + title + "\nAuthor: " + author + "\nPages: " + pages + "\nReference number: ");
        if (refNumber.length() > 0)
            System.out.println(refNumber);
        else
            System.out.println("ZZZ");
        System.out.println("This book has been checked out " + borrowed + " times.");
    }
}
