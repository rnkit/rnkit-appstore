package io.rnkit.appstore;

import io.rnkit.appstore.entity.AppInfoEntity;
import org.junit.Assert;
import org.junit.Test;

/**
 * Name: AppTest
 * Author: SimMan <liwei0990@gmail.com>
 * CreatedAt: 01/09/2017
 * Description:
 * Copyright (c) 2017 Toutoo, Inc.
 */
public class AppTest {

    @Test
    public void testGetAppInfo() {
        Long appId = 414603431L;
        AppInfoEntity appInfo = AppInfo.getAppInfo(appId); // QQ Music
        if (appInfo != null) {
            Assert.assertSame(appId.toString(), appInfo.getTrackId().toString());
        }
    }
}
