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
public final class SumProcessor implements Processor<Float, Float> {

    /**
     * {@inheritDoc}
     */
    @Override
    public Output<Float> process(final List<Output<Float>> outputs) {

        float retVal = 0;

        if (outputs != null) {
            for (Output<Float> feed: outputs) {
                retVal += feed.getValue();
            }
        }

        final Output<Float> output = new NumericalOutput();

        output.setValue(retVal);

        return output;
    }

}
