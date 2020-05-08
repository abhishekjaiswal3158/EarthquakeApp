package com.example.android.quakereport;

/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */



public class Earthquake {

    // Name of the Android version (e.g. Gingerbread, Honeycomb, Ice Cream Sandwich)
    private String mag;

    // Android version number (e.g. 2.3-2.7, 3.0-3.2.6, 4.0-4.0.4)
    private String location;

    // Drawable resource ID
    private String date;

    private String time;

    /*
     * Create a new AndroidFlavor object.
     *
     * @param vName is the name of the Android version (e.g. Gingerbread)
     * @param vNumber is the corresponding Android version number (e.g. 2.3-2.7)
     * @param image is drawable reference ID that corresponds to the Android version
     * */
    public Earthquake(String vmag, String vlocation, String da,String ti)
    {
       mag=vmag;
       location=vlocation;
       time=ti;
       date=da;

    }

    /**
     * Get the name of the Android version
     */
    public String getMag() {
        return mag;
    }

    /**
     * Get the Android version number
     */
    public String getLocation() {
        return location;
    }

    /**
     * Get the image resource ID
     */
    public String getTime() {
        return time;
    }



    public String getDate(){ return date; }

}