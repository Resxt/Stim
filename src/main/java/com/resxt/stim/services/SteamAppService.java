package com.resxt.stim.services;

import com.resxt.stim.dao.SteamAppDao;
import com.resxt.stim.models.SteamApp;

public class SteamAppService {

    private static final SteamAppDao dao = new SteamAppDao();

    public static SteamApp getSteamApp(int appId) {
        return dao.getSteamApp(appId);
    }

    public static SteamApp[] getSteamApps() {
        return dao.getSteamApps();
    }
}
