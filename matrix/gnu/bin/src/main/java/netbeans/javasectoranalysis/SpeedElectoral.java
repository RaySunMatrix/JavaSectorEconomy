/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package netbeans.javasectoranalysis;

import java.io.IOException;
import netbeans.javasectoreconomy.RelationShipGovernPolicy.DataInput;

/**
 *
 * @author admin
 */
public class SpeedElectoral {
    
public interface ObjectInput extends DataInput, AutoCloseable {

    public Object readObject() throws ClassNotFoundException, IOException;

    public int read() throws IOException;

    public int read(byte[] bytes) throws IOException;

    public int read(byte[] bytes, int i, int i1) throws IOException;

    public long skip(long l) throws IOException;

    public int available() throws IOException;

    public void close() throws IOException;
}
}
