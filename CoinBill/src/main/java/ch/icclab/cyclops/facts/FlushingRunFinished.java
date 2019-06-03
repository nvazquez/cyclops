package ch.icclab.cyclops.facts;
/*
 * Copyright (c) 2017. Zuercher Hochschule fuer Angewandte Wissenschaften
 * All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

import java.util.List;

/**
 * Author: Martin Skoviera (linkedin.com/in/skoviera)
 * Created: 03.08.17
 * Description: Fact marking that all relevant Charge records were flushed
 */
public class FlushingRunFinished extends TypedFact {
    private long time_from;
    private long time_to;
    private int run;
    private List<String> accounts;

    public FlushingRunFinished() {
        super();
    }

    public long getTime_from() {
        return time_from;
    }
    public void setTime_from(long time_from) {
        this.time_from = time_from;
    }

    public long getTime_to() {
        return time_to;
    }
    public void setTime_to(long time_to) {
        this.time_to = time_to;
    }

    public int getRun() {
        return run;
    }
    public void setRun(int run) {
        this.run = run;
    }

    public List<String> getAccounts() {
        return accounts;
    }
    public void setAccounts(List<String> accounts) {
        this.accounts = accounts;
    }
}
