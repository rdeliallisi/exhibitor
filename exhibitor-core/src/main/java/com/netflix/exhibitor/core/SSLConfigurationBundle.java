/*
 * Copyright 2012 Netflix, Inc.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.netflix.exhibitor.core;

import java.io.File;

public class SSLConfigurationBundle {
    public static final String DEFAULT_KEYSTORE = System.getProperty("user.home") + File.separator + ".keystore";
    public static final String DEFAULT_KEYSTORE_PASSWORD = "password";
    public static final String DEFAULT_KEYSTORE_TYPE = "JKS";
    public static final String DEFAULT_KEYMANAGER_TYPE = "SunX509";
    public static final String DEFAULT_TRUSTSTORE = System.getProperty("user.home") + File.separator + ".truststore";
    public static final String DEFAULT_TRUSTSTORE_PASSWORD = "password";
    public static final String DEFAULT_TRUSTSTORE_TYPE = "JKS";
    public static final String DEFAULT_TRUSTMANAGER_TYPE = "SunX509";
    public static final String DEFAULT_SSL_CONTEXT_TYPE = "TLS";

    private String keystorePath = DEFAULT_KEYSTORE;
    private String keystorePass = DEFAULT_KEYSTORE_PASSWORD;
    private String keystoreType = DEFAULT_KEYSTORE_TYPE;
    private String keymanagerType = DEFAULT_KEYMANAGER_TYPE;

    private String truststorePath = DEFAULT_TRUSTSTORE;
    private String truststorePass = DEFAULT_TRUSTSTORE_PASSWORD;
    private String truststoreType = DEFAULT_TRUSTSTORE_TYPE;
    private String trustmanagerType = DEFAULT_TRUSTMANAGER_TYPE;

    private String sslContextType = DEFAULT_SSL_CONTEXT_TYPE;

    public SSLConfigurationBundle() {
    }

    public SSLConfigurationBundle(String keystorePath, String keystorePass, String truststorePath,
            String truststorePass) {
        this.keystorePath = keystorePath;
        this.keystorePass = keystorePass;
        this.truststorePath = truststorePath;
        this.truststorePass = truststorePass;
    }

    public SSLConfigurationBundle(String keystorePath, String keystorePass, String keystoreType, String keymanagerType,
            String truststorePath, String truststorePass, String truststoreType, String trustmanagerType,
            String sslContextType) {
        this(keystorePath, keystorePass, truststorePath, truststorePass);
        this.keystoreType = keystoreType;
        this.keymanagerType = keymanagerType;
        this.truststoreType = truststoreType;
        this.trustmanagerType = trustmanagerType;
        this.sslContextType = sslContextType;
    }

    public String getKeystorePath() {
        return keystorePath;
    }

    public String getKeystorePass() {
        return keystorePass;
    }

    public String getKeystoreType() {
        return keystoreType;
    }

    public String getKeymanagerType() {
        return keymanagerType;
    }

    public String getTruststorePath() {
        return truststorePath;
    }

    public String getTruststorePass() {
        return truststorePass;
    }

    public String getTruststoreType() {
        return truststoreType;
    }

    public String getTrustmanagerType() {
        return trustmanagerType;
    }

    public String getSslContextType() {
        return sslContextType;
    }
}