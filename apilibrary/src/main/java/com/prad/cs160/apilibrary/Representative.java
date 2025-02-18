package com.prad.cs160.apilibrary;

import org.apache.commons.lang3.SerializationUtils;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by eviltwin on 3/6/16.
 */
public class Representative implements Serializable {
    public String bioguide_id;
    public String name;
    public boolean is_senator;
    public List<String> bills;
    public List<String> committees;
    public enum Party {
        DEMOCRAT, REPUBLICAN, INDEPENDENT
    }
    public Party party;
    public String email;
    public String website;
    public String twitter_handle;
    public Date term_end;

    // Gson object. Decode using: final Tweet tweet = gson.fromJson(latest_tweet, Tweet.class);
    public List<String> latest_tweets;
    public SerializableBitmap profile_picture;

    private static final long serialVersionUID = -3775600205635065568L;
    public static byte[] serialize(Representative rep) {
        return SerializationUtils.serialize(rep);
    }

    public static Representative deserialize(byte[] rep_array) {
        return (Representative) SerializationUtils.deserialize(rep_array);
    }
}