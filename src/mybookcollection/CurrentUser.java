/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mybookcollection;

/**
 *
 * @author Rayhan Halim G
 */
public class CurrentUser {
    public static String username = ""; // simpan username yang login

    public static boolean isLoggedIn() {
        return !username.isEmpty();
    }
}
