/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.appointmentreminder.api.impl;

import org.openmrs.api.APIException;
import org.openmrs.api.UserService;
import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.appointmentreminder.api.AppointmentreminderService;
import org.openmrs.module.appointmentreminder.api.dao.AppointmentreminderDao;
import org.openmrs.module.appointmentreminder.api.model.Appointment;

import java.util.List;

public class AppointmentreminderServiceImpl extends BaseOpenmrsService implements AppointmentreminderService {
	
	AppointmentreminderDao appointmentreminderDao;
	public void setDao(AppointmentreminderDao appointmentreminderDao) {
		this.appointmentreminderDao = appointmentreminderDao;
	}
	public AppointmentreminderDao getAppointmentreminderDao(){
		return this.appointmentreminderDao;
	}
	public List<Appointment> getAllAppointments(){
		return null;
	}

	
}
