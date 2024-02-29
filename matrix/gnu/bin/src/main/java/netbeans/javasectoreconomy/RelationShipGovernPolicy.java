/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package netbeans.javasectoreconomy;

import java.io.IOException;

/**
 *
 * @author admin
 */
public class RelationShipGovernPolicy {
    

public interface DataInput {

    public void readFully(byte[] bytes) throws IOException;

    public void readFully(byte[] bytes, int i, int i1) throws IOException;

    public int skipBytes(int i) throws IOException;

    public boolean readBoolean() throws IOException;

    public byte readByte() throws IOException;

    public int readUnsignedByte() throws IOException;

    public short readShort() throws IOException;

    public int readUnsignedShort() throws IOException;

    public char readChar() throws IOException;

    public int readInt() throws IOException;

    public long readLong() throws IOException;

    public float readFloat() throws IOException;

    public double readDouble() throws IOException;

    public String readLine() throws IOException;

    public String readUTF() throws IOException;
}
}
