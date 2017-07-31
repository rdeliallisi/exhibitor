package com.netflix.exhibitor.standalone;

import com.netflix.exhibitor.core.SSLConfigurationBundle;

public class SecurityArguments
{
    private final String securityFile;
    private final String realmSpec;
    private final String remoteAuthSpec;
    private final SSLConfigurationBundle clientSSL;
    private final SSLConfigurationBundle serverSSL;

    public SecurityArguments()
    {
        this(null, null, null, null, null);
    }

    public SecurityArguments(String securityFile, String realmSpec, String remoteAuthSpec,
        SSLConfigurationBundle clientSSL, SSLConfigurationBundle serverSSL)
    {
        this.securityFile = securityFile;
        this.realmSpec = realmSpec;
        this.remoteAuthSpec = remoteAuthSpec;
        this.clientSSL = clientSSL;
        this.serverSSL = serverSSL;
    }

    public String getSecurityFile()
    {
        return securityFile;
    }

    public String getRealmSpec()
    {
        return realmSpec;
    }

    public String getRemoteAuthSpec()
    {
        return remoteAuthSpec;
    }

    public SSLConfigurationBundle getClientSSL()
    {
        return clientSSL;
    }

    public SSLConfigurationBundle getServerSSL()
    {
        return serverSSL;
    }
}
