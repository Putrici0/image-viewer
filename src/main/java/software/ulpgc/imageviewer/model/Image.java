package software.ulpgc.imageviewer.model;

public interface Image {
    Image prev();
    Image next();
    String name();
}
