package com.dsm.libarouter.service;

import android.content.Context;

import com.alibaba.android.arouter.facade.template.IProvider;

public interface IMainProvider extends IProvider {

    /**
     * 处理收到的推送消息
     */
    void handlerPushMessage(Context context, String message);

    /**
     * 退出账号时，关闭猫眼相关的服务
     */
    void stopEquesService(Context context);

    /**
     * 停止后台推送服务
     */
    void stopPushService(Context context);

    /**
     * 上传用户推送信息
     */
    void updateUserPushInfo(String mobile, String clientType, String userID, String channelID, String serial);

}
