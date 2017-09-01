package io.rnkit.appstore;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import io.rnkit.appstore.entity.AppInfoEntity;
import io.rnkit.appstore.utils.Common;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Name: AppInfo
 * Author: SimMan <liwei0990@gmail.com>
 * CreatedAt: 01/09/2017
 * Description:
 * Copyright (c) 2017 Toutoo, Inc.
 */
public class AppInfo {

    private static final String BASE_URL = "https://itunes.apple.com/lookup";

    public static AppInfoEntity getAppInfo(Long appId) {
        AppInfoEntity appInfo = null;
        try {
            Map<String, String> reqMap = new LinkedHashMap<String, String>();
            reqMap.put("id", appId.toString());
            String resStr = Common.sendGet(BASE_URL, reqMap);
            System.out.println(resStr);
            if (resStr != null && resStr.length() > 0) {
                try {
                    Gson gson = new Gson();
                    JsonElement element = gson.fromJson (resStr, JsonElement.class);
                    if (element.getAsJsonObject().get("resultCount").getAsInt() == 1) {
                        JsonArray jsonArray = element.getAsJsonObject().getAsJsonArray("results");
                        if (jsonArray.size() > 0) {
                            JsonObject jsonObject = jsonArray.get(0).getAsJsonObject();
                            appInfo = gson.fromJson(jsonObject.toString(), AppInfoEntity.class);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return appInfo;
        }
    }
}
