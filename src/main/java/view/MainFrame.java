package view;

import control.Command;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;

public class MainFrame extends JFrame {

    private ImageDisplay imageDisplay;
    private final Map<String, Command> commands;

    public MainFrame() {
        this.commands = new HashMap<>();
        setTitle("Image Viewer");
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(createImageDisplay());
        add(createToolbar(), BorderLayout.SOUTH);
    }

    private KeyListener createkeyListener(){
        return new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e){
            }
            @Override
            public void keyPressed(KeyEvent e){
                if (e.getKeyCode() == KeyEvent.VK_RIGHT){
                    commands.get("Next").execute();
                }else if (e.getKeyCode() == KeyEvent.VK_LEFT){
                    commands.get("Previous").execute();
                }
            }
            @Override
            public void keyReleased(KeyEvent e){
            }
        };
    }

    private Component createToolbar() {
        JPanel panel = new JPanel();
        panel.add(createButton("Previous"));
        panel.add(createButton("Next"));
        return panel;
    }

    private Component createButton(String label) {
        JButton button = new JButton(label);
        button.addActionListener(e -> commands.get(label).execute());
        return button;
    }

    private Component createImageDisplay(){
        SwingImageDisplay display = new SwingImageDisplay();
        display.addKeyListener(createkeyListener());
        this.imageDisplay = display;
        return display;
    }


    public void add(String name, Command command) {
        commands.put(name, command);
    }

    public ImageDisplay imageDisplay() {
        return imageDisplay;
    }
}
