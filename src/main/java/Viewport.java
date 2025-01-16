public class Viewport {
    private final Dimension containerSize;
    private Dimension imageSize;

    public Viewport(Dimension containerSize) {
        this.containerSize = containerSize;
    }

    public Dimension resize(Dimension imageSize) {
        this.imageSize = imageSize;

        double scale = calculateScale();
        return calculateNewSize(scale);
    }

    private double calculateScale() {
        return Math.min(calculateScaleX(), calculateScaleY());
    }

    private double calculateScaleX() {
        return (double) containerSize.width() / imageSize.width();
    }

    private double calculateScaleY() {
        return (double) containerSize.height() / imageSize.height();
    }

    private Dimension calculateNewSize(double scale) {
        int newWidth = scaleWidth(scale);
        int newHeight = scaleHeight(scale);
        return new Dimension(newWidth, newHeight);
    }

    private int scaleWidth(double scale) {
        return (int) (imageSize.width() * scale);
    }

    private int scaleHeight(double scale) {
        return (int) (imageSize.height() * scale);
    }
}
