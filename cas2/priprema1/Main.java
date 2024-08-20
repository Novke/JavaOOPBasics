package org.example.cas2.priprema1;

public class Main {

    public static void main(String[] args) {
        Avatar a1 = AvatarProvider.getRandomAvatar("http://localhost/avatars");
        Avatar a2 = AvatarProvider.getRandomAvatar("http://localhost/avatars");
        Avatar a3 = AvatarProvider.getRandomAvatar("http://localhost/avatars");
        Avatar a4 = AvatarProvider.getDemoAvatarWithName("http://localhost/avatars" ,"test");
        Avatar a5 = AvatarProvider.getDemoAvatarWithName("http://localhost/avatars" ,"test");
        Avatar a6 = AvatarProvider.getDemoAvatarWithName("http://localhost/avatars" ,"test");

        System.out.println("A!: " + a1.getLink() + ", " + a1.getNaziv() + ", " + a1.getBoja());
        System.out.println("A!: " + a2.getLink() + ", " + a2.getNaziv() + ", " + a2.getBoja());
        System.out.println("A!: " + a3.getLink() + ", " + a3.getNaziv() + ", " + a3.getBoja());
        System.out.println("A!: " + a4.getLink() + ", " + a4.getNaziv() + ", " + a4.getBoja());
        System.out.println("A!: " + a5.getLink() + ", " + a5.getNaziv() + ", " + a5.getBoja());
        System.out.println("A!: " + a6.getLink() + ", " + a6.getNaziv() + ", " + a6.getBoja());
    }
}
