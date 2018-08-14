package org.play.ground.atomic.data;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Book")
public class Book extends Publication {

    @Column(name = "num_pages")
    private int numPages;

    public Book() {

    }

    public Book(int numPages) {
        this.numPages = numPages;
    }

    public Book(int version, String title, int numPages) {
        super(version, title);
        this.numPages = numPages;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }
}
