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
 *
 */
public final class NumericalOutput implements Output<Float> {

    /**
     * Value.
     */
    private Float val;

    /**
     * {@inheritDoc}
     */
    @Override
    public void setValue(final Float value) {

        this.val = value;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Float getValue() {

        return val;
    }

}
