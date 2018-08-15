package org.play.ground.atomic.data.pub;

import org.play.ground.atomic.data.PublicationType;
import org.play.ground.atomic.data.pub.Publication;

import javax.persistence.*;

/**
 * Created by scruz on 14/08/18.
 */
@Entity
//@Table(name = "blog_post")
@DiscriminatorValue("BLOG_POST")
@SecondaryTable(name = "blog_post", pkJoinColumns = @PrimaryKeyJoinColumn(name = "publication_id"))
public class BlogPost extends Publication {

    private String url;

    public BlogPost() {
    }

    public BlogPost(int version, String title, String url) {
        super(version, title, PublicationType.BLOG_POST);
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
