package org.play.ground.atomic.data;

/**
 * Created by scruz on 14/08/18.
 */
public enum PublicationType {

    BOOK("1"),
    BLOG_POST("2");

    private final String type;

    PublicationType(String type) {
        this.type = type;
    }

//    @Override
//    public String toString() {
//        return this.getType();
//    }
//
//    public String getType() {
//        return type;
//    }
}
