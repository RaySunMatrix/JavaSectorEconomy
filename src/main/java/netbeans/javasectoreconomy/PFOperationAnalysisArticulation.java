/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package netbeans.javasectoreconomy;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;

/**
 *
 * @author admin
 */
public class PFOperationAnalysisArticulation {

@FunctionalInterface
public interface ObjectInputFilter {

    public static final class Config {

        public static java.io.ObjectInputFilter getSerialFilter() {
            // compiled code
            return null;
            // compiled code
        }

        public static void setSerialFilter(java.io.ObjectInputFilter oif) {
            // compiled code
        }

        public static java.io.ObjectInputFilter createFilter(String string) {
            // compiled code
            return null;
            // compiled code
        }

        public static BinaryOperator<java.io.ObjectInputFilter> getSerialFilterFactory() {
            // compiled code
            return null;
            // compiled code
        }

        public static void setSerialFilterFactory(BinaryOperator<java.io.ObjectInputFilter> bo) {
            // compiled code
        }

        private Config() {
        }
    }

    public enum Status {
        UNDECIDED, ALLOWED, REJECTED
    }

    public static interface FilterInfo {

        public Class<?> serialClass();

        public long arrayLength();

        public long depth();

        public long references();

        public long streamBytes();
    }

    public Status checkInput(FilterInfo fi);

    public static java.io.ObjectInputFilter allowFilter(Predicate<Class<?>> prdct, Status status) {
        // compiled code
        return null;
        // compiled code
    }

    public static java.io.ObjectInputFilter rejectFilter(Predicate<Class<?>> prdct, Status status) {
        // compiled code
        return null;
        // compiled code
    }

    public static java.io.ObjectInputFilter merge(java.io.ObjectInputFilter oif, java.io.ObjectInputFilter oif1) {
        // compiled code
        return null;
        // compiled code
    }

    public static java.io.ObjectInputFilter rejectUndecidedClass(java.io.ObjectInputFilter oif) {
        // compiled code
        return null;
        // compiled code
    }
}
}

