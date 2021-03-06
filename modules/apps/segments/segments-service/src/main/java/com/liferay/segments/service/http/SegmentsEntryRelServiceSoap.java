/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.segments.service.http;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import com.liferay.segments.service.SegmentsEntryRelServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link SegmentsEntryRelServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.liferay.segments.model.SegmentsEntryRelSoap}.
 * If the method in the service utility returns a
 * {@link com.liferay.segments.model.SegmentsEntryRel}, that is translated to a
 * {@link com.liferay.segments.model.SegmentsEntryRelSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Eduardo Garcia
 * @see SegmentsEntryRelServiceHttp
 * @see com.liferay.segments.model.SegmentsEntryRelSoap
 * @see SegmentsEntryRelServiceUtil
 * @generated
 */
@ProviderType
public class SegmentsEntryRelServiceSoap {
	public static com.liferay.segments.model.SegmentsEntryRelSoap addSegmentsEntryRel(
		long segmentsEntryId, long classNameId, long classPK,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.liferay.segments.model.SegmentsEntryRel returnValue = SegmentsEntryRelServiceUtil.addSegmentsEntryRel(segmentsEntryId,
					classNameId, classPK, serviceContext);

			return com.liferay.segments.model.SegmentsEntryRelSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteSegmentsEntryRel(long segmentsEntryRelId)
		throws RemoteException {
		try {
			SegmentsEntryRelServiceUtil.deleteSegmentsEntryRel(segmentsEntryRelId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteSegmentsEntryRel(long segmentsEntryId,
		long classNameId, long classPK) throws RemoteException {
		try {
			SegmentsEntryRelServiceUtil.deleteSegmentsEntryRel(segmentsEntryId,
				classNameId, classPK);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.segments.model.SegmentsEntryRelSoap[] getSegmentsEntryRels(
		long segmentsEntryId) throws RemoteException {
		try {
			java.util.List<com.liferay.segments.model.SegmentsEntryRel> returnValue =
				SegmentsEntryRelServiceUtil.getSegmentsEntryRels(segmentsEntryId);

			return com.liferay.segments.model.SegmentsEntryRelSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.segments.model.SegmentsEntryRelSoap[] getSegmentsEntryRels(
		long groupId, long classNameId, long classPK) throws RemoteException {
		try {
			java.util.List<com.liferay.segments.model.SegmentsEntryRel> returnValue =
				SegmentsEntryRelServiceUtil.getSegmentsEntryRels(groupId,
					classNameId, classPK);

			return com.liferay.segments.model.SegmentsEntryRelSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int getSegmentsEntryRelsCount(long segmentsEntryId)
		throws RemoteException {
		try {
			int returnValue = SegmentsEntryRelServiceUtil.getSegmentsEntryRelsCount(segmentsEntryId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int getSegmentsEntryRelsCount(long groupId, long classNameId,
		long classPK) throws RemoteException {
		try {
			int returnValue = SegmentsEntryRelServiceUtil.getSegmentsEntryRelsCount(groupId,
					classNameId, classPK);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static boolean hasSegmentsEntryRel(long segmentsEntryId,
		long classNameId, long classPK) throws RemoteException {
		try {
			boolean returnValue = SegmentsEntryRelServiceUtil.hasSegmentsEntryRel(segmentsEntryId,
					classNameId, classPK);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(SegmentsEntryRelServiceSoap.class);
}