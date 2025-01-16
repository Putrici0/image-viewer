package software.ulpgc.imageviewer.view;

import software.ulpgc.imageviewer.model.Image;

public interface ImageDisplay {
    void on(Released released);
    void on(Shift shift);
    int getWidth();
    void show(Image image);
    void paint(String id, int offset);
    void clear();

    interface Released{
        Released Null = (int offset) -> {};
        void offset(int offset);
    }

    interface Shift{
        Shift Null = (int offset) -> {};
        void offset(int offset);
    }
}
