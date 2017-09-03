package io.rnkit.appstore;

import io.rnkit.appstore.entity.AppInfoEntity;
import org.junit.Assert;
import org.junit.Test;

/**
 * Name: AppTest
 * Author: SimMan [liwei0990@gmail.com]
 * CreatedAt: 01/09/2017
 * Description:
 * Copyright (c) 2017 Toutoo, Inc.
 */
public class AppTest {

    @Test
    public void getAppInfoTest() {
        Long appId = 414603431L; // QQ Music
        AppInfoEntity appInfo = AppInfo.getAppInfo(appId);
        Assert.assertNotNull(appInfo);
        Assert.assertEquals(appId, appInfo.getTrackId());
    }
}
