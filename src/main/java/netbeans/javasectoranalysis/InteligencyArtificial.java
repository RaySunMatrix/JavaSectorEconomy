/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package netbeans.javasectoranalysis;

import java.io.DataOutput;
import java.io.IOException;

/**
 *
 * @author admin
 */
public class InteligencyArtificial {
    
public interface ObjectOutput extends DataOutput, AutoCloseable {

    public void writeObject(Object o) throws IOException;

    @Override
    public void write(int i) throws IOException;

    @Override
    public void write(byte[] bytes) throws IOException;

    @Override
    public void write(byte[] bytes, int i, int i1) throws IOException;

    public void flush() throws IOException;

    @Override
    public void close() throws IOException;
}
}
