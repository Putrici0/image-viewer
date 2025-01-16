package view;

import model.Image;

public class ImagePresenter {
    private final ImageDisplay display;
    private Image image;

    public ImagePresenter(ImageDisplay imageDisplay){
        this.display = imageDisplay;
        this.display.on((ImageDisplay.Shift) offset1 -> shift(offset1));
        this.display.on((ImageDisplay.Released) offset -> released(offset));
    }

    private void repaint(){
        this.display.clear();
        this.display.paint(image.name(), 0);
    }

    private void shift(int offset){
        display.clear();
        display.paint(image.name(), offset);

        if (offset > 0) {
            display.paint(image.prev().name(), offset - display.getWidth());
        } else {
            display.paint(image.next().name(), display.getWidth() + offset);
        }
    }

    private void released(int offset){
        if (Math.abs(offset) >= display.getWidth() / 2){
            image = offset > 0 ? image.prev():image.next();
            display.show(image);
        }

        repaint();
    }

    public void display(Image image){
        this.image = image;
        display.show(this.image);
        repaint();
    }

    public Image image(){
        return image;
    }
}
