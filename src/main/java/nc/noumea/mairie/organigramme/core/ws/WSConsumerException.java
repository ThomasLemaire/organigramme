package nc.noumea.mairie.organigramme.core.ws;

/*
 * #%L
 * Logiciel de Gestion des Organigrammes de la Ville de Nouméa
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2015 Mairie de Nouméa
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */

public class WSConsumerException extends RuntimeException {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 6378424967920764491L;

	public WSConsumerException() {
		super();
	}

	public WSConsumerException(String message) {
		super(message);
	}

	public WSConsumerException(String message, Exception innerException) {
		super(message, innerException);
	}
}
