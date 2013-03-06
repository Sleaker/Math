/*
 * This file is part of Math.
 *
 * Copyright (c) 2011-2013, Spout LLC <http://www.spout.org/>
 * Math is licensed under the Spout License Version 1.
 *
 * Math is free software: you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option)
 * any later version.
 *
 * In addition, 180 days after any changes are published, you can use the
 * software, incorporating those changes, under the terms of the MIT license,
 * as described in the Spout License Version 1.
 *
 * Math is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for
 * more details.
 *
 * You should have received a copy of the GNU Lesser General Public License,
 * the MIT license and the Spout License Version 1 along with this program.
 * If not, see <http://www.gnu.org/licenses/> for the GNU Lesser General Public
 * License and see <http://spout.in/licensev1> for the full license, including
 * the MIT license.
 */
/*
 * This file is part of SpoutAPI.
 *
 * Copyright (c) 2011-2012, Spout LLC <http://www.spout.org/>
 * SpoutAPI is licensed under the Spout License Version 1.
 *
 * SpoutAPI is free software: you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option)
 * any later version.
 *
 * In addition, 180 days after any changes are published, you can use the
 * software, incorporating those changes, under the terms of the MIT license,
 * as described in the Spout License Version 1.
 *
 * SpoutAPI is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for
 * more details.
 *
 * You should have received a copy of the GNU Lesser General Public License,
 * the MIT license and the Spout License Version 1 along with this program.
 * If not, see <http://www.gnu.org/licenses/> for the GNU Lesser General Public
 * License and see <http://spout.in/licensev1> for the full license, including
 * the MIT license.
 */
package org.spout.math.util;

public class StringUtil {
	/**
	 * Wraps all components in between brackets delimited by ','-signs
	 * @param components to turn into a String
	 * @return a String representation of the input
	 */
	public static String toString(Object... components) {
		return toNamedString(null, components);
	}

	/**
	 * Wraps all components in between brackets delimited by ','-signs,
	 * appending the class name in front of it.
	 * @param object name to append in front
	 * @param components to turn into a String
	 * @return a String representation of the input
	 */
	public static String toNamedString(Object object, Object... components) {
		StringBuilder b = new StringBuilder(components.length * 5 + 2);
		if (object != null) {
			b.append(object.getClass().getSimpleName()).append(' ');
		}
		b.append('{');
		for (int i = 0; i < components.length; i++) {
			if (i != 0) {
				b.append(", ");
			}
			b.append(components[i]);
		}
		b.append('}');
		return b.toString();
	}
}