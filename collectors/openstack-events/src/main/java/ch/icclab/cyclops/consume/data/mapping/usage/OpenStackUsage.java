/*
 * Copyright (c) 2016. Zuercher Hochschule fuer Angewandte Wissenschaften
 *  All Rights Reserved.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License"); you may
 *     not use this file except in compliance with the License. You may obtain
 *     a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *     WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 *     License for the specific language governing permissions and limitations
 *     under the License.
 */
package ch.icclab.cyclops.consume.data.mapping.usage;

import ch.icclab.cyclops.timeseries.GenerateDBPoint;
import org.influxdb.dto.Point;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Author: Oleksii
 * Date: 26/08/2016
 * Description: This class holds the OpenStackUsage response
 */
public class OpenStackUsage {
    public OpenStackUsage() {
    }
    protected Long time;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Double getUsage() {
        return usage;
    }

    public void setUsage(Double usage) {
        this.usage = usage;
    }

    public String getWasSent() {
        return wasSent;
    }

    public void setWasSent(String wasSent) {
        this.wasSent = wasSent;
    }


    protected String account;
    protected Double usage;
    protected String wasSent = "false";

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public void isSent() {wasSent = "true";}

    public Point.Builder getPoint() {
        List<String> tags = new ArrayList<>();
        tags.add("account");
        tags.add("metadata.sourceId");
        tags.add("_class");
        return GenerateDBPoint.fromObjectWithTimeAndTags(this, "time", TimeUnit.MILLISECONDS, tags);

    }

}
