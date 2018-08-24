package org.playground.atomic.data.pub;

import org.playground.atomic.data.PublicationType;

import javax.persistence.*;

@Entity
@DiscriminatorValue("BOOK")
@SecondaryTable(name = "book", pkJoinColumns = @PrimaryKeyJoinColumn(name = "publication_id"))
public class Book extends Publication {

    @Column(name = "num_pages")
    private int numPages;

    public Book() {
    }

    public Book(int numPages) {
        this.numPages = numPages;
    }

    public Book(int version, String title, int numPages) {
        super(version, title, PublicationType.BOOK);
        this.numPages = numPages;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }
}
