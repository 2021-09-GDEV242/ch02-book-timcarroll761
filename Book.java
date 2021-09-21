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

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
    }

    // Add the methods here ...
    // Return the author
    public String getAuthor(){
        return this.author;
    }
    
    //Return the title
    public String getTitle(){
        return this.title;
    }
    
    //Return the number of pages
    public int getPages(){
        return this.pages;
    }
    
    //Print the author
    public void printAuthor(){
        System.out.println("The author is " + this.author);
    }
    
    //Print the title
    public void printTitle(){
        System.out.println("The title is " + this.title);
    }
}
