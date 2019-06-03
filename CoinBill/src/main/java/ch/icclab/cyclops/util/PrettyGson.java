package ch.icclab.cyclops.util;
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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Author: Martin Skoviera (linkedin.com/in/skoviera)
 * Created: 08/03/16
 * Description: Always use pretty JSON output
 */
public class PrettyGson {

    private static Gson getGson() {
        // here we can specify whether we want setPrettyPrinting() or not
        return new GsonBuilder().create();
    }

    public static String toJson(Object object) {
        return getGson().toJson(object);
    }
}
