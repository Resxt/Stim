package com.resxt.stim.services;

import com.resxt.stim.dao.SteamAppDao;
import com.resxt.stim.models.SteamApp;

public class SteamAppService {

    SteamAppDao dao = new SteamAppDao();

    public SteamApp getSteamApp(int appId) {
        return dao.getSteamApp(appId);
    }

    public SteamApp[] getSteamApps() {
        return dao.getSteamApps();
    }
}
