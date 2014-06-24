 /*************************************************************************
 *  2014 BHGAGILE
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of BHGAGILE.
 */
package com.bhgagile.neuralnet;

import java.util.List;

/**
 * @author Barnaby Golden
 *
 */
public final class FlatValueProcessor implements Processor<Float, Float> {

    /**
     * The value to return on all requests.
     */
    private final Float val;

    /**
     * Constructor, takes the flat value to return.
     * @param val value to return on all requests
     */
    public FlatValueProcessor(final Float val) {
        this.val = val;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public Output<Float> process(final List<Output<Float>> outputs) {

        final Output<Float> output = new NumericalOutput();

        output.setValue(val);

        return output;
    }

}
