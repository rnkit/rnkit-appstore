package io.rnkit.appstore.utils;

import org.apache.commons.codec.CharEncoding;
import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

/**
 * Name: common
 * Author: SimMan <liwei0990@gmail.com>
 * CreatedAt: 01/09/2017
 * Description:
 * Copyright (c) 2017 Toutoo, Inc.
 */
public class Common {

    /**
     * send get request
     * @param url
     * @param parameters
     * @return
     * @throws IOException
     */
    public static String sendGet(String url, Map<String, String> parameters) throws IOException {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        StringBuilder entityStringBuilder = new StringBuilder();
        if (parameters != null) {
            url += assemblyParameter(parameters);
        }
        try {
            HttpGet httpget = new HttpGet(url);
            RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(2000).setConnectTimeout(5000).build();
            httpget.setConfig(requestConfig);
            CloseableHttpResponse response = httpclient.execute(httpget);
            BufferedReader bufferedReader;
            try {
                int statusCode = response.getStatusLine().getStatusCode();
                if (statusCode == HttpStatus.SC_OK) {
                    HttpEntity entity = response.getEntity();
                    bufferedReader = new BufferedReader
                            (new InputStreamReader(entity.getContent(), CharEncoding.UTF_8), 8 * 1024);
                    String line = null;
                    while ((line = bufferedReader.readLine()) != null) {
                        entityStringBuilder.append(line);
                    }
                }
            } finally {
                response.close();
            }
        } catch (Exception e) {
            throw e;
        } finally {
            try {
                httpclient.close();
            } catch (IOException e) {
                throw e;
            }
            return entityStringBuilder.toString();
        }
    }

    /**
     * assemblyParameter
     *
     * @param parameters
     * @return
     */
    public static String assemblyParameter(Map<String, String> parameters) {
        String para = "?";
        for (String str : parameters.keySet()) {
            para += str + "=" + parameters.get(str) + "&";
        }
        return para.substring(0, para.length() - 1);
    }
}
