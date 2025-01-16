package control;

public class PreviousImageCommand implements Command {
    private final ImagePresenter imagePresenter;

    public PreviousImageCommand(ImagePresenter imagePresenter) {
        this.imagePresenter = imagePresenter;
    }

    @Override
    public void execute() {
        imagePresenter.display(imagePresenter.image().prev());
    }
}
