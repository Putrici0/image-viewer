package software.ulpgc.imageviewer.main;

import software.ulpgc.imageviewer.control.NextImageCommand;
import software.ulpgc.imageviewer.control.PreviousImageCommand;
import software.ulpgc.imageviewer.model.FileImageLoader;
import software.ulpgc.imageviewer.model.Image;
import software.ulpgc.imageviewer.presenter.ImagePresenter;
import software.ulpgc.imageviewer.view.MainFrame;

import java.io.File;

public class Main {
    public static void main(String[] args){
        MainFrame mainFrame = new MainFrame();

        ImagePresenter imagePresenter = new ImagePresenter(mainFrame.imageDisplay());
        imagePresenter.display(image());

        mainFrame.add("Next",new NextImageCommand(imagePresenter));
        mainFrame.add("Previous", new PreviousImageCommand(imagePresenter));
        mainFrame.setVisible(true);
    }

    private static Image image(){
        return new FileImageLoader(new File("pictures")).load();
    }
}
