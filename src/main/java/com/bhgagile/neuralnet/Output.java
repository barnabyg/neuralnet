 /*************************************************************************
 *  2014 BHGAGILE
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of BHGAGILE.
 */
package com.bhgagile.neuralnet;

/**
 * @author Barnaby Golden
 * @param <T> type
 */
public interface Output<T> {

    /**
     * Set the value of the output.
     * The type of the value will depend on the implementation.
     * @param value the value of the output
     */
    void setValue(T value);

    /**
     * Get the value of the output.
     * @return output value
     */
    T getValue();
}
