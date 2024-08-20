package org.example.cas2.priprema1;

public abstract class AvatarProvider {

    private AvatarProvider() {
    }

    public static Avatar getRandomAvatar(String link){
        DemoAvatarRepository demoava = new DemoAvatarRepository(link);

        return demoava.getRandomAvatar();
    }

    public static Avatar getDemoAvatarWithName(String link, String name){
        DemoAvatarRepository demoAvatarRepository = new DemoAvatarRepository(link);
        return demoAvatarRepository.getAvatarByName(name);
    }
}
