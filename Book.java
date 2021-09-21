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

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
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
}
