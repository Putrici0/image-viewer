public class NextImageCommand implements Command {
    private final ImagePresenter imagePresenter;

    public NextImageCommand(ImagePresenter imagePresenter) {
        this.imagePresenter = imagePresenter;
    }

    @Override
    public void execute() {
        imagePresenter.display(imagePresenter.image().next());
    }
}
