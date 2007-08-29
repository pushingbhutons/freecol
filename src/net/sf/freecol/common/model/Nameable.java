
package net.sf.freecol.common.model;

/**
 * An object with a name that can be changed.
 */
public interface Nameable extends Named {

    public static final String  COPYRIGHT = "Copyright (C) 2003-2007 The FreeCol Team";
    public static final String  LICENSE = "http://www.gnu.org/licenses/gpl.html";
    public static final String  REVISION = "$Revision$";

    /**
    * Sets the name for this <code>Nameable</code>.
    * @param newName The new name for the <code>Nameable</code>.
    */
    public void setName(String newName);

}
