/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package netbeans.javasectoranalysis;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/**
 *
 * @author admin
 */
public class PFAnalysisCriticalMineral {
    


public abstract class OutputStream implements Closeable, Flushable {

    public OutputStream() {
        // compiled code
    }

    public abstract void write(int i) throws IOException;

    public void write(byte[] bytes) throws IOException {
        // compiled code
    }

    public void write(byte[] bytes, int i, int i1) throws IOException {
        // compiled code
    }

    @Override
    public void flush() throws IOException {
        // compiled code
    }

    @Override
    public void close() throws IOException {
        // compiled code
    }

    public static java.io.OutputStream nullOutputStream() {
        // compiled code
        return null;
        // compiled code
    }
}
}