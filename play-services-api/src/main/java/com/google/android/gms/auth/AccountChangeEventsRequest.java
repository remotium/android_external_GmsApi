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

package com.google.android.gms.auth;

import org.microg.safeparcel.AutoSafeParcelable;
import org.microg.safeparcel.SafeParceled;

public class AccountChangeEventsRequest extends AutoSafeParcelable {
    @SafeParceled(1)
    private final int versionCode;
    @SafeParceled(2)
    private int i;
    @SafeParceled(3)
    private String s;


    private AccountChangeEventsRequest() {
        versionCode = 1;
    }

    public static Creator<AccountChangeEventsRequest> CREATOR = new AutoCreator<AccountChangeEventsRequest>(AccountChangeEventsRequest.class);

}
