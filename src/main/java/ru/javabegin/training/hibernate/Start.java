package ru.javabegin.training.hibernate;

import org.hibernate.Session;
import ru.javabegin.training.hibernate.entity.Author;

import java.util.logging.Logger;

public class Start {
    private static final Logger LOG = Logger.getLogger(AuthorHelper.class.getName());

    public static void main(String[] args) {
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        System.out.println("new AuthorHelper().getAuthorList() = " + new AuthorHelper().getAuthorList());
//        for (Author author : new AuthorHelper().getAuthorList()) {
//            LOG.warning(author.getName());
//            System.out.println("author = " + author.getName());
//        }
        Author author = new Author("test");
        new AuthorHelper().addAuthor(author);
    }
}
