package tictactoe;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class MyFrame extends JFrame implements ActionListener {

    JPanel finalPanel;

    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;

    ImageIcon paw;
    ImageIcon bone;
    ImageIcon win;
    ImageIcon tie;

    JPanel panel;
    JPanel panelTop;
    JPanel player1;
    JPanel player2;
    JLabel winScreen;
    JLabel tieScreen;
    JLabel pl1;
    JLabel pl2;

    int count = 0;
    int playerWin = 0;
    Color ActivePlayer;
    Color InactivePlayer;
    Color winnerPlayer;

    ScheduledExecutorService executorService;

    MyFrame() {

        Border blackLine = BorderFactory.createLineBorder(Color.BLACK, 2);
        Font font = new Font("Arial", Font.BOLD, 30);

        ActivePlayer = new Color(0, 0, 225);
        InactivePlayer = Color.WHITE;
        winnerPlayer = new Color(255, 215, 0);

        pl1 = new JLabel("Player 1");
        pl1.setFont(font);
        pl2 = new JLabel("Player 2");
        pl2.setFont(font);
        player1 = new JPanel();
        player2 = new JPanel();
        panel = new JPanel();
        panelTop = new JPanel();
        finalPanel = new JPanel();
        winScreen = new JLabel();
        tieScreen = new JLabel();

        paw = new ImageIcon("paw.png");
        bone = new ImageIcon("bone.png");
        win = new ImageIcon("trophy.png");
        tie = new ImageIcon("tie.png");

        panel.setSize(250, 250);
        panel.setOpaque(true);
        panel.setBackground(Color.lightGray);
        panel.setLayout(new GridLayout(3, 3));

        panelTop.setLayout(new GridLayout(1, 2));

        winScreen.setIcon(win);
        tieScreen.setIcon(tie);

        player1.setOpaque(true);
        player1.setPreferredSize(new Dimension(150, 50));
        player1.setBorder(blackLine);
        player1.add(pl1);

        player2.setOpaque(true);
        player2.setPreferredSize(new Dimension(150, 50));
        player2.setBorder(blackLine);
        player2.add(pl2);

        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();

        button1.setFocusable(false);
        button2.setFocusable(false);
        button3.setFocusable(false);
        button4.setFocusable(false);
        button5.setFocusable(false);
        button6.setFocusable(false);
        button7.setFocusable(false);
        button8.setFocusable(false);
        button9.setFocusable(false);

        button1.setPreferredSize(new Dimension(100, 100));

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(320, 400);
        this.setBackground(InactivePlayer);
        this.setLayout(new FlowLayout());

        panelTop.add(player1);
        panelTop.add(player2);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);

        this.add(panelTop);
        this.add(panel);
        this.setResizable(false);
        this.setVisible(true);
        System.out.println(count);

        player1.setBackground(ActivePlayer);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button1) {
            if (count % 2 == 0) {
                button1.setIcon(paw);
                button1.setEnabled(false);
                button1.setDisabledIcon(paw);
            } else if (count % 2 != 0) {
                button1.setIcon(bone);
                button1.setEnabled(false);
                button1.setDisabledIcon(bone);
            }
            count++;
            System.out.println(count);

        } else if (e.getSource() == button2) {
            if (count % 2 == 0) {
                button2.setIcon(paw);
                button2.setEnabled(false);
                button2.setDisabledIcon(paw);
            } else if (count % 2 != 0) {
                button2.setIcon(bone);
                button2.setEnabled(false);
                button2.setDisabledIcon(bone);
            }
            count++;
            System.out.println(count);

        } else if (e.getSource() == button3) {
            if (count % 2 == 0) {
                button3.setIcon(paw);
                button3.setEnabled(false);
                button3.setDisabledIcon(paw);
            } else if (count % 2 != 0) {
                button3.setIcon(bone);
                button3.setEnabled(false);
                button3.setDisabledIcon(bone);
            }
            count++;
            System.out.println(count);

        } else if (e.getSource() == button4) {
            if (count % 2 == 0) {
                button4.setIcon(paw);
                button4.setEnabled(false);
                button4.setDisabledIcon(paw);
            } else if (count % 2 != 0) {
                button4.setIcon(bone);
                button4.setEnabled(false);
                button4.setDisabledIcon(bone);
            }
            count++;
            System.out.println(count);

        } else if (e.getSource() == button5) {
            if (count % 2 == 0) {
                button5.setIcon(paw);
                button5.setEnabled(false);
                button5.setDisabledIcon(paw);
            } else if (count % 2 != 0) {
                button5.setIcon(bone);
                button5.setEnabled(false);
                button5.setDisabledIcon(bone);
            }
            count++;
            System.out.println(count);

        } else if (e.getSource() == button6) {
            if (count % 2 == 0) {
                button6.setIcon(paw);
                button6.setEnabled(false);
                button6.setDisabledIcon(paw);
            } else if (count % 2 != 0) {
                button6.setIcon(bone);
                button6.setEnabled(false);
                button6.setDisabledIcon(bone);
            }
            count++;
            System.out.println(count);

        } else if (e.getSource() == button7) {
            if (count % 2 == 0) {
                button7.setIcon(paw);
                button7.setEnabled(false);
                button7.setDisabledIcon(paw);
            } else if (count % 2 != 0) {
                button7.setIcon(bone);
                button7.setEnabled(false);
                button7.setDisabledIcon(bone);
            }
            count++;
            System.out.println(count);

        } else if (e.getSource() == button8) {
            if (count % 2 == 0) {
                button8.setIcon(paw);
                button8.setEnabled(false);
                button8.setDisabledIcon(paw);
            } else if (count % 2 != 0) {
                button8.setIcon(bone);
                button8.setEnabled(false);
                button8.setDisabledIcon(bone);
            }
            count++;
            System.out.println(count);

        } else if (e.getSource() == button9) {
            if (count % 2 == 0) {
                button9.setIcon(paw);
                button9.setEnabled(false);
                button9.setDisabledIcon(paw);
            } else if (count % 2 != 0) {
                button9.setIcon(bone);
                button9.setEnabled(false);
                button9.setDisabledIcon(bone);
            }
            count++;
            System.out.println(count);
        }

        if (button3.getIcon() == paw && button6.getIcon() == paw && button9.getIcon() == paw) {
            button3.setDisabledIcon(win);
            button6.setDisabledIcon(win);
            button9.setDisabledIcon(win);
            playerWin = 1;
        }
        if (button1.getIcon() == paw && button4.getIcon() == paw && button7.getIcon() == paw) {
            button1.setDisabledIcon(win);
            button4.setDisabledIcon(win);
            button7.setDisabledIcon(win);
            playerWin = 1;
        }
        if (button2.getIcon() == paw && button5.getIcon() == paw && button8.getIcon() == paw) {
            button2.setDisabledIcon(win);
            button5.setDisabledIcon(win);
            button8.setDisabledIcon(win);
            playerWin = 1;
        }
        if (button1.getIcon() == paw && button2.getIcon() == paw && button3.getIcon() == paw) {
            button1.setDisabledIcon(win);
            button2.setDisabledIcon(win);
            button3.setDisabledIcon(win);
            playerWin = 1;
        }
        if (button4.getIcon() == paw && button5.getIcon() == paw && button6.getIcon() == paw) {
            button4.setDisabledIcon(win);
            button5.setDisabledIcon(win);
            button6.setDisabledIcon(win);
            playerWin = 1;
        }
        if (button7.getIcon() == paw && button8.getIcon() == paw && button9.getIcon() == paw) {
            button7.setDisabledIcon(win);
            button8.setDisabledIcon(win);
            button9.setDisabledIcon(win);
            playerWin = 1;
        }
        if (button1.getIcon() == paw && button5.getIcon() == paw && button9.getIcon() == paw) {
            button1.setDisabledIcon(win);
            button5.setDisabledIcon(win);
            button9.setDisabledIcon(win);
            playerWin = 1;
        }
        if (button3.getIcon() == paw && button5.getIcon() == paw && button7.getIcon() == paw) {
            button3.setDisabledIcon(win);
            button5.setDisabledIcon(win);
            button7.setDisabledIcon(win);
            playerWin = 1;

        }

//****************************************************************************************************************
        if (button3.getIcon() == bone && button6.getIcon() == bone && button9.getIcon() == bone) {
            button3.setDisabledIcon(win);
            button6.setDisabledIcon(win);
            button9.setDisabledIcon(win);//
            playerWin = 2;
        }
        if (button1.getIcon() == bone && button4.getIcon() == bone && button7.getIcon() == bone) {
            button1.setDisabledIcon(win);
            button4.setDisabledIcon(win);
            button7.setDisabledIcon(win);//
            playerWin = 2;
        }
        if (button2.getIcon() == bone && button5.getIcon() == bone && button8.getIcon() == bone) {
            button2.setDisabledIcon(win);
            button5.setDisabledIcon(win);
            button8.setDisabledIcon(win);//
            playerWin = 2;
        }
        if (button1.getIcon() == bone && button2.getIcon() == bone && button3.getIcon() == bone) {
            button1.setDisabledIcon(win);
            button2.setDisabledIcon(win);
            button3.setDisabledIcon(win);//
            playerWin = 2;
        }
        if (button4.getIcon() == bone && button5.getIcon() == bone && button6.getIcon() == bone) {
            button4.setDisabledIcon(win);
            button5.setDisabledIcon(win);
            button6.setDisabledIcon(win);//
            playerWin = 2;
        }
        if (button7.getIcon() == bone && button8.getIcon() == bone && button9.getIcon() == bone) {
            button7.setDisabledIcon(win);
            button8.setDisabledIcon(win);
            button9.setDisabledIcon(win);//
            playerWin = 2;
        }
        if (button1.getIcon() == bone && button5.getIcon() == bone && button9.getIcon() == bone) {
            button1.setDisabledIcon(win);
            button5.setDisabledIcon(win);
            button9.setDisabledIcon(win);//
            playerWin = 2;
        }
        if (button3.getIcon() == bone && button5.getIcon() == bone && button7.getIcon() == bone) {
            button3.setDisabledIcon(win);
            button5.setDisabledIcon(win);
            button7.setDisabledIcon(win);//
            playerWin = 2;
        }

        if (count % 2 == 0) {
            player1.setBackground(ActivePlayer);
            player2.setBackground(InactivePlayer);
        } else if (count % 2 != 0) {
            player2.setBackground(ActivePlayer);
            player1.setBackground(InactivePlayer);
        }

        if (playerWin == 1) {
            this.remove(panelTop);
            winScreen.setText("Player 1 Wins!");
            finalPanel.add(winScreen);
            this.add(finalPanel);
            this.pack();

            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);

        } else if (playerWin == 2) {
            this.remove(panelTop);
            winScreen.setText("Player 2 Wins!");
            finalPanel.add(winScreen);
            this.add(finalPanel);
            this.pack();

            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);

        }
        if (count >= 9 && playerWin != 2 && playerWin != 1) {
            this.remove(panelTop);
            tieScreen.setText("Its a tie!");
            finalPanel.add(tieScreen);
            this.add(finalPanel);
            this.pack();

            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);

        }

    }

}
