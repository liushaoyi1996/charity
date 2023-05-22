package com.charity.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016080400167425";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDh3FyZGWg8zcp2625bbl4XB79dKVYU1WOOm8uxSqC9LBc2SQJpJ7olM8Ydvc6HfKfl35wBxQ9odrF077hk7GZa5kQu7DHB+ci3ruE69YhuRFRTBEioWi1I2VIStiiAZmrVTKsJKDKn0qIl0RNNAjaE2AIGA60LkElbu646wxZBPAp+CCF4M4C9Am9vA42nGBKhq7NkkUxPzI0Sg8VfphRNgwBUGvTSinhTyRSElTkrt4ZFffKj4jT2kyLCZ7GPNYKDcqLYJnQgl2sEd3DaApDbrrurlIB6pjA1r568eab46IQAQebTEYEmWwAmdHwUyTCdWEnaDRtM7LSrt5jqZHfVAgMBAAECggEAF7euOZ2DZq8tjaNXaV6DnuN/YucOVQ27cKRHlYyCqJrSrS6phCVZ1MJFEaZ2459hejArD7yDy7J7HA54TJDOhskba9n9t6LlQvSoTiqucvXV7QnMH3Gow7eeeLyMMD+RBGkSpNmFyD3ELThxUGrlErokLEGCkG5MZcelmiIWWi8jVIUpeQwsop6YnjiWX6nv4O0eUhi8g5dszzEFZlAxzWgcGJq3/RyTNW9/ZwiY+uIudXCnQa4JR71DxzvtE2lvX3JETVfmoFAzqnp13QZ8vsnmkO6myAz+jq8B61SOCg9lWBj23EHXD4271h13hJVLU3A2BBKj/oMYUF/cReom2QKBgQD76RRBUyagndX3UkvyITq4DUiq0NyHpjVfD4EY+TGn1a+cLd3dHCHli/2Pqq1Ymq55Xd6SFNxS7WIGLgIaQ2ewlWpK6LsQ/IA66DecHHfYGRv/f9dK6tdfP1lTvCVpIgA9uavJQExFvb5exvacw2nzLaWjNvc1p2Jsi7C7bdUACwKBgQDlhwWoHbK31+4UF50GkiDsXZf1MEW+xd0ZFVGDIniV7Al/DfR1iI8ZXTt0idrIaCXw3waKNWajQNIM3QTwE4p2KmHHLFfSbk7Wb8rdwvW2jhlq5fvctKSJQWt5Q33tZLqd7yiRSiIHzLh6Pu6F5A17KJdxIpPZQP1EzAaxOo3znwKBgAl7jaKj4alcJ6jGtUspCw/QmDKt6A9HJ20rpT1ua/sYZSLo6xgerfv5GBNnZl0WfYjeCrnPBTgt7Wm0I6ofbXDNPxIQzrHl/2G4ShebTruYvmAQzObqDi9ssA0h4PqjKAUqzxelTvm1Gcxxiuj9xig8SKbrM8UWRvM1EvMLQGBfAoGBAMdffKNmgJo+31fmlwhhIGYQenGJZ9vphT9HjFFrPPGFYU5S8diyMRLoMD/vivJvvR04rTaaYjhGku6HgcWEQ86Wy+41b2ejV6ne24m70rGrRxrbAObapt1uzQs9fAIccBnF5yglC+BYjJnrVkdJLAih3sJwNZsOX7FFxD5oTWujAoGAac7u8zQ4+Ofji1fkpTVVvnFTrqcFNwjx6ywhZUJ5HNFKBqgp3JqOIJb//44fzdyAnnIrskfZfrFLXurnmvQoSsqxe/JHfzBhYXs1IpjcWldh90PsKbju4ec8g600+CjrVqoGyH2+3yN3T8Ng6riBRQPWKWXACbgPJIlYyEnVJcY=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA4dxcmRloPM3KdutuW25eFwe/XSlWFNVjjpvLsUqgvSwXNkkCaSe6JTPGHb3Oh3yn5d+cAcUPaHaxdO+4ZOxmWuZELuwxwfnIt67hOvWIbkRUUwRIqFotSNlSErYogGZq1UyrCSgyp9KiJdETTQI2hNgCBgOtC5BJW7uuOsMWQTwKfggheDOAvQJvbwONpxgSoauzZJFMT8yNEoPFX6YUTYMAVBr00op4U8kUhJU5K7eGRX3yo+I09pMiwmexjzWCg3Ki2CZ0IJdrBHdw2gKQ2667q5SAeqYwNa+evHmm+OiEAEHm0xGBJlsAJnR8FMkwnVhJ2g0bTOy0q7eY6mR31QIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:8080/notify";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://localhost:8080/returnUrl";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "D:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     *
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis() + ".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}