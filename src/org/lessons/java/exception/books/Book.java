package org.lessons.java.exception.books;

public class Book {
    private String title;
    private int pages;
    private String author;
    private String editor;

    public Book(String title, int pages, String author, String editor) {
        setTitle(title);
        setPages(pages);
        setAuthor(author);
        setEditor(editor);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null && !title.isBlank()) this.title = title;
        else throw new EmptyStringException("The book title must not be null");
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if (pages > 0 ) this.pages = pages;
        else throw new MustHavePagesException("Pages must be more than zero");
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author != null && !author.isBlank()) this.author = author;
        else throw new EmptyStringException("The book author must not be null");
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        if (editor != null && !editor.isBlank()) this.editor = editor;
        else throw new EmptyStringException("The book editor must not be null");
    }
}
