package Grafikeditor1;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

@SuppressWarnings("serial")
final class EditorPanel extends JPanel {
  private EditorControl editorControl;

  EditorPanel(EditorControl control) {
    addMouseListener(new EditorMouseAdapter());
    addKeyListener(new EditorKeyAdapter());
    setFocusable(true);
    requestFocusInWindow();
    editorControl = control;
  }

  // Die paintComponent()-Methode wird automatisch aufgerufen, wenn irgendwer die repaint()-
  // Methode beim EditorFrame oder beim EditorPanel aufruft.
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    editorControl.allesNeuZeichnen(g);
  }

  class EditorMouseAdapter extends MouseAdapter {

    @Override
    public void mousePressed(MouseEvent event) {
      editorControl.setErsterPunkt(event.getPoint());
    }

    @Override
    public void mouseReleased(MouseEvent event) {
      editorControl.erzeugeFigurMitZweitemPunkt(event.getPoint());
      repaint();
    }
  }

  class EditorKeyAdapter extends KeyAdapter {
    @Override
    public void keyPressed(KeyEvent e) {
      super.keyPressed(e);
      editorControl.setFigurTyp(e.getKeyChar());
    }
  }
}