package com.devstudios.dbu.devstudios_dbu.config;

import io.jsonwebtoken.Jwts;
import java.util.Date;
import javax.crypto.SecretKey;



public class JwtEnvs {


    public static SecretKey getKey() {
        return Jwts.SIG.HS256.key().build();
    }
    public static Date getDateExpire() {
        return new Date(System.currentTimeMillis() + 3600000);
    }
}
