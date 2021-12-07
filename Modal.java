import javax.swing.*;
import java.awt.*;

class Modal extends JFrame{
    Modal(){
        setTitle("Modal");
        setSize(420, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.WHITE);
        mainPanel.setLayout(new BorderLayout());

        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(Color.RED);
        leftPanel.setPreferredSize(new Dimension(270,0));

        JPanel leftPanelTop = new JPanel();
        leftPanelTop.setPreferredSize(new Dimension(0,120));
        leftPanelTop.setBackground(Color.WHITE);

        JPanel leftPanelCenter = new JPanel();
        leftPanelCenter.setPreferredSize(new Dimension(0,120));
        leftPanelCenter.setBackground(Color.RED);

        JPanel leftPanelButtom = new JPanel();
        leftPanelButtom.setPreferredSize(new Dimension(0,50));
        leftPanelButtom.setBackground(Color.GREEN);

        leftPanel.setLayout(new BorderLayout());
        leftPanel.add(leftPanelTop,BorderLayout.NORTH);
        leftPanel.add(leftPanelCenter,BorderLayout.CENTER);
        leftPanel.add(leftPanelButtom,BorderLayout.SOUTH);

        //Start Right(EAST PANEL)
        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.YELLOW);

        //Setting grid layout and size
        rightPanel.setLayout(new GridLayout(9,1));
        rightPanel.setPreferredSize(new Dimension(150,0));

        //Adding JCheckboxes to Right Panel
        JCheckBox cTennis = new JCheckBox("Tennis");
        rightPanel.add(cTennis);
        JCheckBox cSquash = new JCheckBox("Squash");
        rightPanel.add(cSquash);
        JCheckBox cNatation = new JCheckBox("Natation");
        rightPanel.add(cNatation);
        JCheckBox cAthletisme = new JCheckBox("Athletisme");
        rightPanel.add(cAthletisme);
        JCheckBox cRandonnee = new JCheckBox("Randonnee");
        rightPanel.add(cRandonnee);
        JCheckBox cFoot = new JCheckBox("Foot");
        rightPanel.add(cFoot);
        JCheckBox cBasket = new JCheckBox("Basket");
        rightPanel.add(cBasket);
        JCheckBox cVolley = new JCheckBox("Volley");
        rightPanel.add(cVolley);
        JCheckBox cPetanque = new JCheckBox("Petanque");
        rightPanel.add(cPetanque);
        //End Right(EAST PANEL)
        

        JPanel southPanel = new JPanel();
        southPanel.setPreferredSize(new Dimension(0,60));
        southPanel.setBackground(Color.BLACK);
        

        mainPanel.add(leftPanel,BorderLayout.WEST);
        mainPanel.add(rightPanel,BorderLayout.EAST);
        mainPanel.add(southPanel,BorderLayout.SOUTH);

        add(mainPanel);
    }
}