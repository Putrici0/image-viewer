package main;

import control.NextImageCommand;
import control.PreviousImageCommand;
import model.FileImageLoader;
import model.Image;
import view.ImagePresenter;
import view.MainFrame;

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
        return new FileImageLoader(new File("/pictures")).load();
    }
}
