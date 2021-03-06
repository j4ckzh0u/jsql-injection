/*******************************************************************************
 * Copyhacked (H) 2012-2016.
 * This program and the accompanying materials
 * are made available under no term at all, use it like
 * you want, but share and discuss about it
 * every time possible with every body.
 *
 * Contributors:
 *      ron190 at ymail dot com - initial implementation
 *******************************************************************************/
package com.jsql.view.swing.text;

import javax.swing.JTextField;

import com.jsql.view.swing.HelperUi;

/**
 * A JTextField displaying an icon and buttons.
 */
@SuppressWarnings("serial")
public class JTextFieldAddressBar extends JPopupTextField implements DecoratorJComponent<JTextField> {
	
    /**
     * Constructor with default text.
     * @param string The text to display
     */
    public JTextFieldAddressBar(JTextField c) {
        super(c);

        this.getProxy().setFont(HelperUi.FONT_SEGOE_BIG);
    }
    
}
