/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uteis;

import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

/**
 *
 * @author Ramon Honorio
 */
public class FiltroCaracteres extends DocumentFilter{
    private final int max;
    private Component form;

    public FiltroCaracteres(int max, Component form) {
        this.max = max;
        this.form = form;
    }

    @Override
    public void insertString(DocumentFilter.FilterBypass fb, int offset,
                             String text, AttributeSet attr) 
            throws BadLocationException {
        if (fb.getDocument().getLength() + text.length() < max)
            super.insertString(fb, offset, text.toUpperCase(), attr);
        else 
            showError();
    }

    @Override
    public void replace(DocumentFilter.FilterBypass fb, int offset,
                        int length, String text, AttributeSet attrs)
            throws BadLocationException {
        int documentLength = fb.getDocument().getLength();
        if (documentLength - length + text.length() < max)
            super.replace(fb, offset, length, text.toUpperCase(), attrs);
        else 
            showError();
    }

    private void showError() {
        JOptionPane.showMessageDialog(form, "O limite de caracteres foi excedido. Tente resumir um pouco mais.", "Erro", JOptionPane.ERROR_MESSAGE);
    }
}
