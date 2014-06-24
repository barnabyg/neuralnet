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
public final class NeuronImpl extends AbstractNeuron<Float, Float> {

    /**
     * Constructor sets the processor.
     * @param processor processor
     */
    public NeuronImpl(final Processor<Float, Float> processor) {
        super(processor);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void process() {

        setOutput(getProcessor().process(getUpstreamInputs()));
    }

}
