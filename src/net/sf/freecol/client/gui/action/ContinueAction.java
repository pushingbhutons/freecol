/**
 *  Copyright (C) 2002-2013   The FreeCol Team
 *
 *  This file is part of FreeCol.
 *
 *  FreeCol is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  FreeCol is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with FreeCol.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.sf.freecol.client.gui.action;

import java.awt.event.ActionEvent;
import java.io.File;

import net.sf.freecol.client.FreeColClient;
import net.sf.freecol.client.gui.i18n.Messages;


/**
 * Action to load and start the most recent save game of the client.
 */
public class ContinueAction extends FreeColAction {

    public static final String id = "continueAction";


    /**
     * Creates a new <code>ContinueAction</code>.
     *
     * @param freeColClient The <code>FreeColClient</code> for the game.
     */
    public ContinueAction(FreeColClient freeColClient) {
        super(freeColClient, id);
        
        // interim solution to be replaced! redirect to identical NAME text
        putValue(NAME, Messages.message("victory.continue"));
        putValue(SHORT_DESCRIPTION, null);
    }


    // Interface ActionListener

    /**
     * {@inheritDoc}
     */
    public void actionPerformed(ActionEvent e) {
        File lastSave = getInGameController().getLastSaveGameFile();
        if (lastSave != null) {
            getGUI().removeInGameComponents();
            getConnectController().startSavedGame(lastSave, null);
        }
    }
}
