package org.play.ground.atomic.data.pub;

import org.play.ground.atomic.data.PublicationType;

import javax.persistence.*;

@Entity
@Table(name = "publication")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
public abstract class Publication {

    private int id;

    private int version;

    private String title;

    private PublicationType type;

    public Publication() {
    }

    public Publication(int version, String title, PublicationType type) {
        this.version = version;
        this.title = title;
        this.type = type;
    }

    @Id
    @Column(name = "publication_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Transient
    public PublicationType getType() {
        return type;
    }

    public void setType(PublicationType type) {
        this.type = type;
    }
}
