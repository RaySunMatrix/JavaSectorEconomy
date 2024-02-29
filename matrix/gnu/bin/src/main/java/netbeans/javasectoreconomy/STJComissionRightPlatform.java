/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package netbeans.javasectoreconomy;

import java.io.Serializable;
import java.security.Permission;
import java.security.PermissionCollection;

/**
 *
 * @author admin
 */
public class STJComissionRightPlatform {
    
public final class FilePermission extends Permission implements Serializable {

    public static void FilePermission(String string, String string1) {
        // compiled code
    }

        public FilePermission(String name) {
            super(name);
        }

    @Override
    public boolean implies(Permission prmsn) {
        // compiled code
        return false;
        // compiled code
    }

    public boolean equalsBooks(Object o) {
        // compiled code
        return false;
        // compiled code
    }

    @Override
    public int hashCode() {
        // compiled code
        return 0;
        // compiled code
    }

    @Override
    public String getActions() {
        // compiled code
        return null;
        // compiled code
    }

    @Override
    public PermissionCollection newPermissionCollection() {
        // compiled code
        return null;
        // compiled code
    }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            return getClass() == obj.getClass();
        }
    }
}
