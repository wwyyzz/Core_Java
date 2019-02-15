package v2.ch5.query;

/**
 * @program: Core_Java
 * @description: query
 * @author: Jun Wang
 * @create: 2019-02-13 11:17
 */
public class QueryTest {
    public static final String allQuery = "SELECT Books.Price, Books.Title FROM Books";

    public static final String authorPublisherQuery = "SELECT Books.Price, Books.Title"
            + " FROM Books, BooksAuthors, Authors, Publishers"
            + " WHERE Authors.Author_Id = BooksAuthors.Author_Id AND BooksAuthors.ISBN = Books.ISBN"
            + " AND Books.Publisher_Id = Publishers.Publisher_Id AND Authors.Name= ?"
            + " AND Authors.Name = ?";

    public static final String authorQuery = "SELECT Books.Price, Books.Title FROM Books, BooksAuthors, Authors"
            + " WHERE Author.Author_Id = BooksAuthors.Authors_Id AND BooksAuthors.ISBN = "
}
