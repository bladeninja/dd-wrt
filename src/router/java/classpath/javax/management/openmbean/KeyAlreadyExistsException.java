/* KeyAlreadyExistsException.java -- Thrown when a key clashes with another.
   Copyright (C) 2006 Free Software Foundation, Inc.

This file is part of GNU Classpath.

GNU Classpath is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2, or (at your option)
any later version.

GNU Classpath is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
General Public License for more details.

You should have received a copy of the GNU General Public License
along with GNU Classpath; see the file COPYING.  If not, write to the
Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
02110-1301 USA.

Linking this library statically or dynamically with other modules is
making a combined work based on this library.  Thus, the terms and
conditions of the GNU General Public License cover the whole
combination.

As a special exception, the copyright holders of this library give you
permission to link this library with independent modules to produce an
executable, regardless of the license terms of these independent
modules, and to copy and distribute the resulting executable under
terms of your choice, provided that you also meet, for each linked
independent module, the terms and conditions of the license of that
module.  An independent module is a module which is not derived from
or based on this library.  If you modify this library, you may extend
this exception to your version of the library, but you are not
obligated to do so.  If you do not wish to do so, delete this
exception statement from your version. */

package javax.management.openmbean;

/**
 * Thrown when a key (a field name or row index) is passed to a method
 * of the {@link CompositeData} or {@link TabularData} classes and it
 * is found to already be in use.
 *
 * @author Andrew John Hughes (gnu_andrew@member.fsf.org)
 * @since 1.5
 */
public class KeyAlreadyExistsException
  extends IllegalArgumentException
{

  /**
   * Compatible with JDK 1.5
   */
  private static final long serialVersionUID = 1845183636745282866L;

  /**
   * Constructs a new <code>KeyAlreadyExistsException</code>.
   */
  public KeyAlreadyExistsException()
  {
    super();
  }

  /**
   * Constructs a new <code>KeyAlreadyExistsException</code>
   * with the specified message.
   *
   * @param message the error message to give to the user.
   */
  public KeyAlreadyExistsException(String message)
  {
    super(message);
  }

}
