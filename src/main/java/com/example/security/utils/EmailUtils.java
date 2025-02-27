package com.example.security.utils;

public class EmailUtils {
    public static String getEmailService(String name, String host, String token){
        return "hello "  + name + ",\n\n Your new account has been created. Please click on the link below to verify your account.\n\n" +
                getVrificationUrl(host, token) + "\n\n The Support Team";
    }

    public static String getResetPasswordMessage(String name, String host, String token){
        return "hello "  + name + ",\n\n Your new account has been created. Please click on the link below to verify your account.\n\n" +
                getResetPasswordUrl(host, token) + "\n\n The Support Team";
    }
    private static String getVrificationUrl(String host, String token){
        return host + "/verify/account?token=" + token;
    }
    private static String getResetPasswordUrl(String host, String token){
        return host + "/verify/password?token=" + token;
    }
}
