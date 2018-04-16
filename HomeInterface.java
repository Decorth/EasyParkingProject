import javax.swing.*;
import java.awt.*;

/**
*
*
* @author Dylan Connolly
* @version 30 Mar 2018
*/

public class HomeInterface extends JFrame{

  private String systemIntroduction = "Introduction of this system \n Welcome to our EasyParking Database system. Here you can reserve a parking place at any of the Liverpool parking sites on Liverpool of University Campus.";

  public void HomeInterface(){
    BuildHomeInterfaceTopPanel();
    BuildHomeInterfaceMiddlePanel();
    BuildHomeInterfaceBottomPanel();
  //  InitialiseHomeInterface();
  }

  public void BuildHomeInterfaceTopPanel(){
    JPanel topPanel = new JPanel();
    add(topPanel, BorderLayout.NORTH);
    topPanel.add(new JTextField("EasyParking System"));
  }

  public void BuildHomeInterfaceMiddlePanel(){
    JPanel middlePanel = new JPanel();
    add(middlePanel, BorderLayout.CENTER);
    middlePanel.add(new JButton("Login"), BorderLayout.WEST);
    middlePanel.add(new JButton("Register"), BorderLayout.EAST);
  }

  public void BuildHomeInterfaceBottomPanel(){
    JPanel bottomPanel = new JPanel();
    add(bottomPanel, BorderLayout.SOUTH);
    bottomPanel.add(new JTextArea(systemIntroduction));
  }

//  public void InitialiseHomeInterface(){
  //  setSize(900, 500);
    //setDefaultCloseOperation(EXIT_ON_CLOSE);
  //  pack();
  //  setVisible(true);
  //}

}
