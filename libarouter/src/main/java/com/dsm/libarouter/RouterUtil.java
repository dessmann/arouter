package com.dsm.libarouter;

import android.app.Activity;
import android.text.TextUtils;

import com.alibaba.android.arouter.launcher.ARouter;

import java.io.Serializable;

/**
 * RouterUtil
 *
 * @author SJL
 * @date 2017/7/24
 */

public class RouterUtil {

    /**
     * 跳转手环扫描界面
     *
     * @param account
     * @param lockMac
     * @param deviceBongRelationList
     */
    public static String toBongScan(String account, String lockMac, Serializable deviceBongRelationList) {
        ARouter.getInstance().build("/bong/scan")
                .withString("account", account)
                .withString("lockMac", lockMac)
                .withSerializable("deviceBongRelationList", deviceBongRelationList)
                .navigation();
        return null;
    }

    /**
     * 跳转手环设备关联界面
     */
    public static String toBongLockRelation(Activity activity, int requestCode, String account, String linkedDeviceMac) {
        ARouter.getInstance().build("/bong/lockrelation")
                .withString("account", account)
                .withString("linkedDeviceMac", linkedDeviceMac)
                .navigation(activity, requestCode);
        return null;
    }

    /**
     * 跳转手环设置界面
     *
     * @param account
     * @param deviceCode
     */
    public static String toBongSetting(String account, String deviceCode) {
        ARouter.getInstance().build("/bong/setting")
                .withString("account", account)
                .withString("deviceCode", deviceCode)
                .navigation();
        return null;
    }

    /**
     * 跳转手环设置界面
     *
     * @param account
     * @param deviceCode
     */
    public static String toBongSetting(String account, String deviceCode, Activity activity, int requestCode) {
        ARouter.getInstance().build("/bong/setting")
                .withString("account", account)
                .withString("deviceCode", deviceCode)
                .navigation(activity, requestCode);
        return null;
    }

    /**
     * 跳转手环数据界面
     * @param account
     * @param deviceCode
     */
    public static String toBongData(String account, String deviceCode){
        ARouter.getInstance().build("/bong/data")
                .withString("account", account)
                .withString("deviceCode", deviceCode)
                .navigation();
        return null;
    }

    /**
     * 调整到登录界面
     */
    public static void goLoginActivity() {
        ARouter.getInstance().build("/user/login")
                .navigation();
    }

    public static String goMainActivity(String account) {
        ARouter.getInstance().build("/app/main")
            .withString("account", account)
            .navigation();
        return null;
    }

    public static String goMainActivity(String account, int flag) {
        ARouter.getInstance().build("/app/main")
                .withString("account", account)
                .withFlags(flag)
                .navigation();
        return null;
    }

    public static String goMessageCenter(){
        ARouter.getInstance().build("/user/messagecenter")
                .navigation();
        return null;
    }

    public static String goHelpFeedback(){
        ARouter.getInstance().build("/user/helpfeedback")
                .navigation();
        return null;
    }

    public static String goSmartCommunity(){
        ARouter.getInstance().build("/user/smartcommunity")
                .navigation();
        return null;
    }

    public static String goUserInfo(){
        ARouter.getInstance().build("/user/userinfo")
                .navigation();
        return null;
    }

    /**
     * 跳转到智能钥匙首页
     */
    public static String goSmartkeyMain(Activity activity, int requestCode, Serializable deviceLock, Serializable user) {
        ARouter.getInstance().build("/smartkey/main")
                .withSerializable("deviceLock", deviceLock)
                .withSerializable("user", user)
                .navigation(activity, requestCode);
        return null;
    }

    /**
     * 跳转锁具设置界面
     * @param lockMac
     * @param user
     * @return
     */
    public static String goLockSetting(String lockMac,Serializable user){
        ARouter.getInstance().build("/lock/setting")
                .withString("lockMac",lockMac)
                .withSerializable("user",user)
                .navigation();
        return null;
    }

    /**
     * 跳转密码验证界面
     * @param lockMac
     * @param user
     * @return
     */
    public static String goOpenPwdCheck(String lockMac, Serializable user, Activity activity,int requestCode){
        ARouter.getInstance().build("/lock/numberpwd")
                .withString("type","check_open_pwd")
                .withString("lockMac",lockMac)
                .withSerializable("user",user)
                .navigation(activity,requestCode);
        return null;
    }

    /**
     * 跳转手势验证界面
     * @param lockMac
     * @param user
     * @return
     */
    public static String goGestureCheck(String lockMac, Serializable user, Activity activity,int requestCode){
        ARouter.getInstance().build("/lock/gestureCheck")
                .withString("type","gesture_check")
                .withString("lockMac",lockMac)
                .withSerializable("user",user)
                .navigation(activity,requestCode);
        return null;
    }

    public static String goLockScan(String type, Serializable user){
        ARouter.getInstance().build("/lock/scan")
                .withString("type", type)
                .withSerializable("user",user)
                .navigation();
        return null;
    }

    public static String goWebView(String url){
        ARouter.getInstance().build("/app/content")
                .withString("url", url)
                .navigation();
        return null;
    }

    public static String goXMVideo(String sn,String devName,Serializable user){
        ARouter.getInstance().build("/xmrobot/xmvideo")
                .withString("sn", sn)
                .withSerializable("user", user)
                .withString("devName", devName)
                .navigation();
        return null;
    }

    public static String goXMCheckDevPwd(Activity activity, int requestCode, String devSn, Serializable user) {
        ARouter.getInstance().build("/xmrobot/check/devpwd")
            .withString("robotSN", devSn)
            .withSerializable("user", user)
            .navigation(activity, requestCode);
        return null;
    }

    public static String goXMDeviceSetting(String devSn, String devPwd, Serializable user) {
        ARouter.getInstance().build("/xmrobot/device/setting")
            .withString("devSn", devSn)
            .withString("devPwd", devPwd)
            .withSerializable("user", user)
            .navigation();
        return null;
    }
}
