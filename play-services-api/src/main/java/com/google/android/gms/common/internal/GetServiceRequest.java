/*
 * Copyright 2013-2015 µg Project Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;

import com.google.android.gms.common.api.Scope;

import org.microg.gms.common.Constants;
import org.microg.gms.common.Services;
import org.microg.safeparcel.AutoSafeParcelable;
import org.microg.safeparcel.SafeParceled;

import java.util.Arrays;

public class GetServiceRequest extends AutoSafeParcelable {
    @SafeParceled(1)
    private final int versionCode;

    @SafeParceled(2)
    public final int serviceId;

    @SafeParceled(3)
    public int gmsVersion;

    @SafeParceled(4)
    public String packageName;

    @SafeParceled(5)
    public IBinder accountAccessor;

    @SafeParceled(6)
    public Scope[] scopes;

    @SafeParceled(7)
    public Bundle extras;

    @SafeParceled(8)
    public Account account;

    private GetServiceRequest() {
        versionCode = 2;
        serviceId = -1;
        gmsVersion = Constants.MAX_REFERENCE_VERSION;
    }

    public GetServiceRequest(int serviceId) {
        this.versionCode = 2;
        this.serviceId = serviceId;
        this.gmsVersion = Constants.MAX_REFERENCE_VERSION;
    }

    @Override
    public String toString() {
        return "GetServiceRequest{" +
                "serviceId=" + Services.nameFromServiceId(serviceId) +
                ", gmsVersion=" + gmsVersion +
                ", packageName='" + packageName + '\'' +
                (scopes == null || scopes.length == 0 ? "" : (", scopes=" + Arrays.toString(scopes))) +
                (extras == null ? "" : (", extras=" + extras)) +
                (account == null ? "" : (", account=" + account)) +
                '}';
    }

    public static Creator<GetServiceRequest> CREATOR = new AutoCreator<GetServiceRequest>(GetServiceRequest.class);
}
